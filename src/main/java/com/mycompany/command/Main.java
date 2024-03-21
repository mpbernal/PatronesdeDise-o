// Interfaz Command
interface Command {
    void execute();
}

// Clase concreta para encender la luz
class EncenderLuzCommand implements Command {
    private Luz luz;

    public EncenderLuzCommand(Luz luz) {
        this.luz = luz;
    }

    public void execute() {
        luz.encender();
    }
}

// Clase concreta para apagar la luz
class ApagarLuzCommand implements Command {
    private Luz luz;

    public ApagarLuzCommand(Luz luz) {
        this.luz = luz;
    }

    public void execute() {
        luz.apagar();
    }
}

// Clase receptor: representa el dispositivo que realiza la acción
class Luz {
    public void encender() {
        System.out.println("Luz encendida");
    }

    public void apagar() {
        System.out.println("Luz apagada");
    }
}

// Clase invocadora: representa al control remoto
class ControlRemoto {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void presionarBoton() {
        command.execute();
    }
}

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        // Creamos el receptor (luz)
        Luz luz = new Luz();

        // Creamos los comandos concretos
        Command encenderCommand = new EncenderLuzCommand(luz);
        Command apagarCommand = new ApagarLuzCommand(luz);

        // Creamos el invocador (control remoto)
        ControlRemoto controlRemoto = new ControlRemoto();

        // Configuramos los comandos en el control remoto
        controlRemoto.setCommand(encenderCommand);

        // Presionamos el botón del control remoto para encender la luz
        controlRemoto.presionarBoton();

        // Configuramos otro comando en el control remoto
        controlRemoto.setCommand(apagarCommand);

        // Presionamos el botón del control remoto para apagar la luz
        controlRemoto.presionarBoton();
    }
}

