// Interfaz que define el método de clonación
interface Clonable {
    Clonable clonar();
}

// Clase concreta que implementa la interfaz Clonable
class Prototipo implements Clonable {
    private String atributo;

    public Prototipo(String atributo) {
        this.atributo = atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getAtributo() {
        return atributo;
    }

    // Implementación del método de clonación
    public Clonable clonar() {
        // Creamos una nueva instancia del prototipo y copiamos el estado
        Prototipo clon = new Prototipo(this.atributo);
        return clon;
    }
}

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        // Creamos un prototipo
        Prototipo prototipoOriginal = new Prototipo("Prototipo Original");

        // Clonamos el prototipo
        Prototipo clon1 = (Prototipo) prototipoOriginal.clonar();

        // Modificamos el atributo del clon
        clon1.setAtributo("Clon 1 modificado");

        // Clonamos el prototipo nuevamente
        Prototipo clon2 = (Prototipo) prototipoOriginal.clonar();

        // Modificamos el atributo del segundo clon
        clon2.setAtributo("Clon 2 modificado");

        // Mostramos los atributos
        System.out.println("Atributo del prototipo original: " + prototipoOriginal.getAtributo());
        System.out.println("Atributo del primer clon: " + clon1.getAtributo());
        System.out.println("Atributo del segundo clon: " + clon2.getAtributo());
    }
}

