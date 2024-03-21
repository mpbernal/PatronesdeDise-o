// Interfaz existente que representa un voltaje de 220V
interface Voltaje220V {
    void suministrarVoltaje220V();
}

// Clase existente que proporciona un voltaje de 220V
class Enchufe220V implements Voltaje220V {
    public void suministrarVoltaje220V() {
        System.out.println("Suministrando voltaje de 220V");
    }
}

// Interfaz objetivo que representa un voltaje de 110V
interface Voltaje110V {
    void suministrarVoltaje110V();
}

// Clase adaptadora que adapta Voltaje220V a Voltaje110V
class Adaptador220V implements Voltaje110V {
    private Voltaje220V voltaje220V;

    public Adaptador220V(Voltaje220V voltaje220V) {
        this.voltaje220V = voltaje220V;
    }

    public void suministrarVoltaje110V() {
        System.out.println("Adaptando voltaje de 220V a 110V");
        voltaje220V.suministrarVoltaje220V();
    }
}

// Cliente que utiliza un voltaje de 110V
class Cliente {
    private Voltaje110V voltaje110V;

    public Cliente(Voltaje110V voltaje110V) {
        this.voltaje110V = voltaje110V;
    }

    public void usarDispositivo110V() {
        voltaje110V.suministrarVoltaje110V();
    }
}

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        // Creamos un enchufe de 220V
        Voltaje220V enchufe220V = new Enchufe220V();

        // Adaptamos el enchufe de 220V a un dispositivo de 110V
        Voltaje110V adaptador = new Adaptador220V(enchufe220V);

        // Creamos un cliente que utiliza un dispositivo de 110V
        Cliente cliente = new Cliente(adaptador);

        // El cliente usa el dispositivo de 110V
        cliente.usarDispositivo110V();
    }
}

