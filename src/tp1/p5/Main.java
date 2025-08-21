package tp1.p5;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo("Círculo", 5);
        System.out.println(circulo1);
        System.out.println("Ingrese el radio del círculo:");
        double radio = input.nextDouble();
        Circulo circulo2 = new Circulo("Círculo", radio);
        System.out.println(circulo2);
    }
}
