package tp1.p001;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void iniciarMenu() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ CUENTA BANCARIA ---");
            System.out.println("1. Crear nueva cuenta");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Actualizar saldo (interés)");
            System.out.println("5. Mostrar todas las cuentas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    ingresarDinero();
                    break;
                case 3:
                    retirarDinero();
                    break;
                case 4:
                    actualizarSaldo();
                    break;
                case 5:
                    mostrarCuentas();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    private void crearCuenta() {
        System.out.print("Ingrese DNI: ");
        long dni = scanner.nextLong();
        System.out.print("Ingrese saldo inicial: ");
        double saldo = scanner.nextDouble();
        System.out.print("Ingrese interés anual (%): ");
        double interes = scanner.nextDouble();
        CuentaBancaria cuenta = new CuentaBancaria(dni, saldo, interes);
        cuentas.add(cuenta);
        System.out.println("Cuenta creada:");
        cuenta.mostrarDatos();
    }

    private CuentaBancaria buscarCuenta() {
        System.out.print("Ingrese número de cuenta: ");
        long numCuenta = scanner.nextLong();
        for (CuentaBancaria c : cuentas) {
            if (c.getNumeroCuenta() == numCuenta) {
                return c;
            }
        }
        System.out.println("Cuenta no encontrada.");
        return null;
    }

    private void ingresarDinero() {
        CuentaBancaria cuenta = buscarCuenta();
        if (cuenta != null) {
            System.out.print("Ingrese monto a depositar: ");
            double monto = scanner.nextDouble();
            cuenta.ingresar(monto);
            System.out.println("Depósito realizado. Nuevo saldo: " + cuenta.getSaldo());
        }
    }

    private void retirarDinero() {
        CuentaBancaria cuenta = buscarCuenta();
        if (cuenta != null) {
            System.out.print("Ingrese monto a retirar: ");
            double monto = scanner.nextDouble();
            cuenta.retirar(monto);
            System.out.println("Retiro realizado. Nuevo saldo: " + cuenta.getSaldo());
        }
    }

    private void actualizarSaldo() {
        CuentaBancaria cuenta = buscarCuenta();
        if (cuenta != null) {
            cuenta.actualizarSaldo();
            System.out.println("Saldo actualizado. Nuevo saldo: " + cuenta.getSaldo());
        }
    }

    private void mostrarCuentas() {
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas registradas.");
        } else {
            for (CuentaBancaria c : cuentas) {
                c.mostrarDatos();
            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.iniciarMenu();
    }
}