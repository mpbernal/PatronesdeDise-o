import java.util.ArrayList;
import java.util.List;

// Componente base: Archivo o directorio
interface Componente {
    void mostrarNombre();
}

// Clase hoja: representa un archivo
class Archivo implements Componente {
    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Archivo: " + nombre);
    }
}

// Clase compuesta: representa un directorio
class Directorio implements Componente {
    private String nombre;
    private List<Componente> componentes = new ArrayList<>();

    public Directorio(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Componente componente) {
        componentes.add(componente);
    }

    public void eliminar(Componente componente) {
        componentes.remove(componente);
    }

    public void mostrarNombre() {
        System.out.println("Directorio: " + nombre);
        for (Componente componente : componentes) {
            componente.mostrarNombre();
        }
    }
}

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        // Creamos algunos archivos
        Archivo archivo1 = new Archivo("archivo1.txt");
        Archivo archivo2 = new Archivo("archivo2.txt");

        // Creamos un directorio
        Directorio directorio1 = new Directorio("Directorio 1");

        // Agregamos archivos al directorio
        directorio1.agregar(archivo1);
        directorio1.agregar(archivo2);

        // Creamos otro archivo
        Archivo archivo3 = new Archivo("archivo3.txt");

        // Creamos otro directorio y agregamos el archivo
        Directorio directorio2 = new Directorio("Directorio 2");
        directorio2.agregar(archivo3);

        // Agregamos el segundo directorio al primer directorio
        directorio1.agregar(directorio2);

        // Mostramos los nombres de los componentes
        directorio1.mostrarNombre();
    }
}

