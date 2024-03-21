// Definimos la interfaz para el manejador de solicitudes
interface ReembolsoHandler {
    void manejarSolicitud(Reembolso solicitud);

    public void setSiguienteHandler(ReembolsoHandler gerente);
}

// Implementación base del manejador
abstract class BaseReembolsoHandler implements ReembolsoHandler {
    private ReembolsoHandler siguienteHandler;

    public void setSiguienteHandler(ReembolsoHandler siguienteHandler) {
        this.siguienteHandler = siguienteHandler;
    }

    public void manejarSolicitud(Reembolso solicitud) {
        if (siguienteHandler != null) {
            siguienteHandler.manejarSolicitud(solicitud);
        }
    }
}

// Implementación de un manejador concreto: Supervisor
class SupervisorHandler extends BaseReembolsoHandler {
    private static final double LIMITE_APROBACION = 500.0;

    public void manejarSolicitud(Reembolso solicitud) {
        if (solicitud.getMonto() <= LIMITE_APROBACION) {
            System.out.println("Solicitud aprobada por el Supervisor");
        } else {
            super.manejarSolicitud(solicitud);
        }
    }
}

// Implementación de otro manejador concreto: Gerente
class GerenteHandler extends BaseReembolsoHandler {
    private static final double LIMITE_APROBACION = 1000.0;

    public void manejarSolicitud(Reembolso solicitud) {
        if (solicitud.getMonto() <= LIMITE_APROBACION) {
            System.out.println("Solicitud aprobada por el Gerente");
        } else {
            super.manejarSolicitud(solicitud);
        }
    }
}

// Implementación de la solicitud de reembolso
class Reembolso {
    private double monto;

    public Reembolso(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }
}

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        // Creamos la cadena de responsabilidad
        ReembolsoHandler supervisor = new SupervisorHandler();
        ReembolsoHandler gerente = new GerenteHandler();

        supervisor.setSiguienteHandler(gerente);

        // Creamos una solicitud de reembolso
        Reembolso solicitud1 = new Reembolso(300);
        Reembolso solicitud2 = new Reembolso(800);

        // Manejamos las solicitudes
        supervisor.manejarSolicitud(solicitud1);
        supervisor.manejarSolicitud(solicitud2);
    }
}

