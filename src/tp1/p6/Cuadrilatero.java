package tp1.p6;

public class Cuadrilatero implements Forma{
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double diagonalMenor;
	private double diagonalMayor;
	public String nombreForma;

	public Cuadrilatero() {		
	}
	
    public Cuadrilatero(double lado1, double lado2,double lado3, double lado4 ,double diagonalMenor,double diagonalMayor) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
    }
    
	public String getNombreForma() {
		return nombreForma;
	}
	public void setNombreForma(String nombreForma) {
		this.nombreForma = nombreForma;
	}

	@Override
	public double area(int opc) {
		double area = 0;
		switch (opc) {
		case 1:
			setNombreForma("Cuadrado");
			area = areaCuadrado();
			break;
		case 2:
			setNombreForma("Rectangulo");
			area = areaRectangulo();
			break;
		case 3:
			setNombreForma("Rombo");
			area = areaRombo();
			break;
		}
		return area;
	}
		
	@Override
	public double perimetro(int opc) {
		double perimetro=0;
		switch (opc) {
		case 1:
			setNombreForma("Cuadrado");
			perimetro = perimetroCuadrado();
			break;
		case 2:
			setNombreForma("Rectángulo");
			perimetro = perimetroRectangulo();
			break;
		case 3:
			setNombreForma("Rombo");
			perimetro = perimetroRombo();
			break;
		}
		return perimetro;
	}
	
	// ÁREA Y PERÍMETRO DEL CUADRADO
	public double areaCuadrado() {
		return Math.pow(this.lado1, 2);
	}
	public double perimetroCuadrado() {
		return (this.lado1*4);
	}
	
	// ÁREA Y PERÍMETRO DEL RECTANGULO
	public double areaRectangulo() {
		return (this.lado1 * this.lado2);
	}
	public double perimetroRectangulo() {
		return (this.lado1+this.lado2+this.lado3+this.lado4);
	}
	
	// ÁREA Y PERÍMETRO DEL ROMBO
	public double areaRombo() {
		return (diagonalMayor*diagonalMenor)/2;
	}
	public double perimetroRombo() {
		return (this.lado1+ this.lado2+this.lado3+this.lado4);
	}
}
