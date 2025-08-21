package tp1.p4;
import tp1.p1.Helper;

public class Principal {

	public static void main(String[] args) {
		
		Cuadrilatero cuadrado= crearCuadrilatero();
		Cuadrilatero rombo= crearCuadrilatero();
		
		System.out.println("El perimetro del cuadrado es: "+cuadrado.perimetro());
		System.out.println("El perimetro del rombo es: "+rombo.perimetro());
		System.out.println("El area del cuadrado es: "+cuadrado.area());
		System.out.println("El area del rombo es: "+rombo.area());

	}
	
	public static Cuadrilatero crearCuadrilatero() {
		Cuadrilatero cuadrilatero;
		double lado1=Helper.getDouble("Ingrese lado 1: ");
		double lado2=Helper.getDouble("Ingrese lado 2: ");
		double lado3=Helper.getDouble("Ingrese lado 3: ");
		double lado4=Helper.getDouble("Ingrese lado 4: ");
		char opcion=Helper.yesOrNo("Desea ingresar diagonal ? Si/No");
		if(opcion=='S') {
			double diagonal=Helper.getDouble("Ingrese diagonal: ");
			cuadrilatero=new Cuadrilatero (lado1,lado2,lado3,lado4,diagonal);
			
		}
		else {
			cuadrilatero=new Cuadrilatero (lado1,lado2,lado3,lado4);
		}
		return cuadrilatero;
	}

}