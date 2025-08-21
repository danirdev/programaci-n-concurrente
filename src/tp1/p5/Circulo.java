package tp1.p5;

public class Circulo extends Forma {
    private double radio;

    public Circulo(String nombreForma, double radio) {
        super(nombreForma);
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser un valor positivo.");
        }
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return getNombreForma() + " - Área: " + calcularArea() + ", Perímetro: " + calcularPerimetro();
    }

    
}