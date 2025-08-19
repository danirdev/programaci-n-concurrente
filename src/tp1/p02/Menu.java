package tp1.p02;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<CuentaSueldo> cuentas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void iniciarMenu() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ CUENTA SUELDO ---");
            System.out.println("1. Crear nueva cuenta sueldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Transferir por CBU");
            System.out.println("4. Transferir por Alias");
            System.out.println("5. Mostrar todas las cuentas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    retirarDinero();
                    break;
                case 3:
                    transferirCBU();
                    break;
                case 4:
                    transferirAlias();
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
        System.out.print("Ingrese legajo: ");
        int legajo = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer
        System.out.print("Ingrese institución: ");
        String institucion = scanner.nextLine();
        System.out.print("Ingrese beneficios: ");
        String beneficios = scanner.nextLine();
        System.out.print("Ingrese CBU (18 dígitos): ");
        long cbu = scanner.nextLong();

        CuentaSueldo cuenta = new CuentaSueldo(cbu);
        cuenta.setDni(dni);
        cuenta.setSaldo(saldo);
        cuenta.setInteresAnual(interes);
        cuenta.setLegajo(legajo);
        cuenta.setInstitucion(institucion);
        cuenta.setBeneficios(beneficios);

        cuentas.add(cuenta);
        System.out.println("Cuenta sueldo creada.");
        cuenta.mostrarDatos();
        System.out.println("Legajo: " + cuenta.getLegajo());
        System.out.println("Institución: " + cuenta.getInstitucion());
        System.out.println("Beneficios: " + cuenta.getBeneficios());
        System.out.println("CBU: " + cuenta.getCbu());
        System.out.println("Tope: " + cuenta.getTope());
    }

    private CuentaSueldo buscarCuenta() {
        System.out.print("Ingrese número de cuenta: ");
        long numCuenta = scanner.nextLong();
        for (CuentaSueldo c : cuentas) {
            if (c.getNumeroCuenta() == numCuenta) {
                return c;
            }
        }
        System.out.println("Cuenta no encontrada.");
        return null;
    }

    private void retirarDinero() {
        CuentaSueldo cuenta = buscarCuenta();
        if (cuenta != null) {
            System.out.print("Ingrese monto a retirar: ");
            double monto = scanner.nextDouble();
            cuenta.retirar(monto);
        }
    }

    private void transferirCBU() {
        CuentaSueldo cuenta = buscarCuenta();
        if (cuenta != null) {
            System.out.print("Ingrese monto a transferir: ");
            double monto = scanner.nextDouble();
            System.out.print("Ingrese CBU destino: ");
            long cbuDestino = scanner.nextLong();
            cuenta.transferir(monto, cbuDestino);
        }
    }

    private void transferirAlias() {
        CuentaSueldo cuenta = buscarCuenta();
        if (cuenta != null) {
            System.out.print("Ingrese monto a transferir: ");
            double monto = scanner.nextDouble();
            scanner.nextLine(); // limpiar buffer
            System.out.print("Ingrese alias destino: ");
            String aliasDestino = scanner.nextLine();
            cuenta.transferir(monto, aliasDestino);
        }
    }

    private void mostrarCuentas() {
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas sueldo registradas.");
        } else {
            for (CuentaSueldo c : cuentas) {
                c.mostrarDatos();
                System.out.println("Legajo: " + c.getLegajo());
                System.out.println("Institución: " + c.getInstitucion());
                System.out.println("Beneficios: " + c.getBeneficios());
                System.out.println("CBU: " + c.getCbu());
                System.out.println("Tope: " + c.getTope());
                System.out.println("-----------------------------");
            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.iniciarMenu();
    }
}