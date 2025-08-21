package tp1.p5;

public abstract class Forma {
    private String nombreForma;

    public Forma(String nombreForma) {
        this.nombreForma = nombreForma;
    }

    public String getNombreForma() {
        return nombreForma;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
