// Clase base abstracta para la preparación de bebidas calientes
abstract class BebidaCaliente {
    // Método plantilla (template method) que define el algoritmo de preparación
    public final void prepararBebida() {
        calentarAgua();
        agregarIngredientes();
        verterEnTaza();
        agregarCondimentos();
        servir();
    }

    // Métodos abstractos que deben ser implementados por las subclases
    abstract void calentarAgua();
    abstract void agregarIngredientes();
    abstract void verterEnTaza();
    abstract void agregarCondimentos();
    abstract void servir();
}

// Implementación concreta de una bebida caliente: Té
class Te extends BebidaCaliente {
    void calentarAgua() {
        System.out.println("Calentando agua");
    }

    void agregarIngredientes() {
        System.out.println("Agregando té a la taza");
    }

    void verterEnTaza() {
        System.out.println("Vertiendo agua caliente en la taza con té");
    }

    void agregarCondimentos() {
        System.out.println("Agregando limón");
    }

    void servir() {
        System.out.println("Sirviendo té caliente");
    }
}

// Implementación concreta de una bebida caliente: Café
class Cafe extends BebidaCaliente {
    void calentarAgua() {
        System.out.println("Calentando agua");
    }

    void agregarIngredientes() {
        System.out.println("Agregando café molido a la taza");
    }

    void verterEnTaza() {
        System.out.println("Vertiendo agua caliente en la taza con café molido");
    }

    void agregarCondimentos() {
        System.out.println("Agregando azúcar y leche");
    }

    void servir() {
        System.out.println("Sirviendo café caliente");
    }
}

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        // Preparar té
        System.out.println("Preparando té:");
        BebidaCaliente te = new Te();
        te.prepararBebida();

        System.out.println();

        // Preparar café
        System.out.println("Preparando café:");
        BebidaCaliente cafe = new Cafe();
        cafe.prepararBebida();
    }
}

