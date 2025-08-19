package tp1.p1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		DoubleLinkedList<CuentaBancaria> listaCuentas = new DoubleLinkedList<CuentaBancaria>();

		int opcion;
		do {
			System.out.println("----- MENU ------");
			System.out.println("1. Actualizar saldo");
			System.out.println("2. Agregar saldo");
			System.out.println("3. Retirar saldo");
			System.out.println("4. Buscar cuenta");
			System.out.println("5. Mostrar lista cuenta");
			System.out.println("6. Agregar cuenta");
			System.out.println("7. Salir ");
			opcion = Helper.getInteger("Seleccione una opcion: ");

			switch (opcion) {
			case 1:
				actualizarSaldo(listaCuentas);
				// actualizarTodoSaldo(listaCuentas);
				break;
			case 2:
				agregarSaldo(listaCuentas);
				break;
			case 3:
				retirarSaldo(listaCuentas);
				break;
			case 4:
				buscarCuenta(listaCuentas);
				break;
			case 5:
				System.out.println("-- Lista Cuentas Bancarias-- ");
				System.out.println(listaCuentas);
				break;
			case 6:
				System.out.println("--- Agregar Cuenta ---");
				agregarCuenta(listaCuentas, teclado);
				break;
			case 7:
				System.out.println("Fin del programa");
				break;

			default:
				System.out.println("La opcion ingresada no existe...");
				break;
			}

		} while (opcion != 7);
	}

	public static void retirarSaldo(DoubleLinkedList<CuentaBancaria> listaCuentas) {
		int numCuentaBuscar = Helper.getInteger("Ingrese el N° de cuenta: ");
		boolean respueta = false;
		for (CuentaBancaria cuentaBancaria : listaCuentas) {
			if (numCuentaBuscar == cuentaBancaria.getNumCuenta()) {
				System.out.println("Cuenta Bancaria Existente: " + cuentaBancaria);
				respueta = true;
				double nuevoSaldo = Helper.getDouble("Ingrese el saldo a retirar: ");
				if (nuevoSaldo > 0 && nuevoSaldo <= cuentaBancaria.getSaldoActual()) {
					cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() - nuevoSaldo);
					System.out.println("Se retiro: $ " + nuevoSaldo);
				} else {
					System.out.println("La cunta no posee esa cantidad");
					System.out.println("Se cancela la operacion.... ");
				}
			}

		}
		if (respueta == false) {
			System.out.println("La cuenta no existe");
		}
	}

	public static void agregarSaldo(DoubleLinkedList<CuentaBancaria> listaCuentas) {
		int numCuentaBuscar = Helper.getInteger("Ingrese el N° de cuenta: ");
		boolean respueta = false;
		for (CuentaBancaria cuentaBancaria : listaCuentas) {
			if (numCuentaBuscar == cuentaBancaria.getNumCuenta()) {
				System.out.println("Cuenta Bancaria Existente: " + cuentaBancaria);
				respueta = true;
				double nuevoSaldo = Helper.getDouble("Ingrese el saldo a agregar: ");
				if (nuevoSaldo > 0) {
					cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() + nuevoSaldo);
					System.out.println("Se agrego el saldo: " + nuevoSaldo + " a la cuenta");
				} else {
					System.out.println("El saldo tiene que ser positivo");
					System.out.println("Se cancela la operacion.... ");
				}
			}

		}
		if (respueta == false) {
			System.out.println("La cuenta no existe");
		}
	}

	public static void actualizarTodoSaldo(DoubleLinkedList<CuentaBancaria> listaCuentas) {
		for (CuentaBancaria cuentaBancaria : listaCuentas) {
			double interesDiario = (cuentaBancaria.getInteresAnual() / 100) / 365;
			cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() + interesDiario);
			System.out.println("Se actuzalizo el saldo de la cuenta");
		}
	}

	public static void actualizarSaldo(DoubleLinkedList<CuentaBancaria> listaCuentas) {
		int numCuentaBuscar = Helper.getInteger("Ingrese el N° de cuenta: ");
		boolean respueta = false;
		for (CuentaBancaria cuentaBancaria : listaCuentas) {
			if (numCuentaBuscar == cuentaBancaria.getNumCuenta()) {
				System.out.println("Cuenta Bancaria Existente: " + cuentaBancaria);
				respueta = true;
				double interesDiario = (cuentaBancaria.getInteresAnual() / 100) / 365;
				cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() + interesDiario);
				System.out.println("Se actuzalizo el saldo de la cuenta");
			}

		}
		if (respueta == false) {
			System.out.println("La cuenta no existe");
		}
	}

	public static void buscarCuenta(DoubleLinkedList<CuentaBancaria> listaCuentas) {
		int numCuentaBuscar = Helper.getInteger("Ingrese el N° de cuenta: ");
		boolean respueta = false;
		for (CuentaBancaria cuentaBancaria : listaCuentas) {
			if (numCuentaBuscar == cuentaBancaria.getNumCuenta()) {
				System.out.println("Se encontro la cuenta: " + cuentaBancaria);
				respueta = true;
			}

		}
		if (respueta == false) {
			System.out.println("La cuenta no existe");
		}
	}

	public static void agregarCuenta(DoubleLinkedList<CuentaBancaria> listaCuentas, Scanner teclado) {

		CuentaBancaria nueva = crearCuenta(teclado);
		listaCuentas.addLast(nueva);
		System.out.println("Se agrego una nueva cuenta");
	}

	public static CuentaBancaria crearCuenta(Scanner teclado) {
		CuentaBancaria nuevaCuenta = new CuentaBancaria();

		int dni = Helper.getInteger("Ingrese el DNI: ");
		double saldo = Helper.getDouble("Ingrese el saldo: ");
		double interes = Helper.getDouble("Ingrese el interes(%): ");

		nuevaCuenta = new CuentaBancaria(dni, saldo, interes);

		return nuevaCuenta;
	}

}