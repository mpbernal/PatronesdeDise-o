// Interfaz del visitante
interface Visitor {
    void visitar(Circulo circulo);
    void visitar(Cuadrado cuadrado);
}

// Interfaz de la figura geométrica visitable
interface Figura {
    void aceptar(Visitor visitor);
}

// Clase concreta: Circulo
class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }
}

// Clase concreta: Cuadrado
class Cuadrado implements Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }
}

// Clase concreta del visitante: AreaVisitor
class AreaVisitor implements Visitor {
    double areaTotal = 0;

    public void visitar(Circulo circulo) {
        areaTotal += Math.PI * circulo.getRadio() * circulo.getRadio();
    }

    public void visitar(Cuadrado cuadrado) {
        areaTotal += cuadrado.getLado() * cuadrado.getLado();
    }

    public double getAreaTotal() {
        return areaTotal;
    }
}

// Clase concreta del visitante: PerimetroVisitor
class PerimetroVisitor implements Visitor {
    double perimetroTotal = 0;

    public void visitar(Circulo circulo) {
        perimetroTotal += 2 * Math.PI * circulo.getRadio();
    }

    public void visitar(Cuadrado cuadrado) {
        perimetroTotal += 4 * cuadrado.getLado();
    }

    public double getPerimetroTotal() {
        return perimetroTotal;
    }
}

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        Figura[] figuras = {new Circulo(3), new Cuadrado(2), new Circulo(5)};
        
        AreaVisitor areaVisitor = new AreaVisitor();
        PerimetroVisitor perimetroVisitor = new PerimetroVisitor();
        
        for (Figura figura : figuras) {
            figura.aceptar(areaVisitor);
            figura.aceptar(perimetroVisitor);
        }

        System.out.println("Área total: " + areaVisitor.getAreaTotal());
        System.out.println("Perímetro total: " + perimetroVisitor.getPerimetroTotal());
    }
}
