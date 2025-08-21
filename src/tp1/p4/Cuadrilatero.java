package tp1.p4;

public class Cuadrilatero extends Forma{
	
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double diagonal;	
	
	public Cuadrilatero(double lado1, double lado2,double lado3,double lado4){
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
		this.lado4=lado4;
	}
	
	public Cuadrilatero(double lado1, double lado2,double lado3,double lado4,double diagonal){
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
		this.lado4=lado4;
		this.diagonal=diagonal;
	}
	
	public double perimetro() {
	double perimetro= this.lado1+ this.lado2 + this.lado3+ this.lado4;
	return perimetro;
	}
	
	public double area() {
		double area=0;
		if (diagonal==0) {
			// Fórmula de Brahmagupta (válida para cuadriláteros cíclicos: todos los vértices en una circunferencia)
	        double s = (lado1 + lado2 + lado3 + lado4) / 2; // semiperímetro
	        area=Math.sqrt((s - lado1) * (s - lado2) * (s - lado3) * (s - lado4)); //Cuadrado,Rectángulo,Trapecio isósceles
		}
		else {
			double s1 = (lado1 + lado2 + diagonal) / 2;
	        double area1 = Math.sqrt(s1 * (s1 - lado1) * (s1 - lado2) * (s1 - diagonal));

	        // Triángulo 2: lados lado3, lado4, diagonal
	        double s2 = (lado3 + lado4 + diagonal) / 2;
	        double area2 = Math.sqrt(s2 * (s2 - lado3) * (s2 - lado4) * (s2 - diagonal));
	        area=area1+area2; //rombos
		}
        return area;
	}

}