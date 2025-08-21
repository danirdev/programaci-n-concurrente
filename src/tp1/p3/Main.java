package tp1.p3;

public class Main {
    public static void main(String[] args) {
        // --- Crear una cuenta bancaria común ---
        CuentaBancaria cuenta1 = new CuentaBancaria(12345678L, 50000, 20); // dni, saldo, interés
        System.out.println("---- Datos Cuenta Bancaria ----");
        cuenta1.mostrarDatos();

        cuenta1.actualizarSaldo(); // aplica interés diario
        System.out.println("\nDespués de aplicar interés diario:");
        cuenta1.mostrarDatos();

        cuenta1.ingresar(2000);
        System.out.println("\nDespués de ingresar $2000:");
        cuenta1.mostrarDatos();

        cuenta1.retirar(10000);
        System.out.println("\nDespués de retirar $10000:");
        cuenta1.mostrarDatos();

        // --- Crear una cuenta sueldo ---
        CuentaSueldo cuentaSueldo = new CuentaSueldo(87654321L, 30000, 15, 123456789012345678L);
        System.out.println("\n---- Datos Cuenta Sueldo ----");
        cuentaSueldo.mostrarDatos();

        // Probar retirar dentro del tope
        System.out.println("\nDespués de retirar $12000 (válido, dentro del tope):");
        cuentaSueldo.retirar(12000);
        cuentaSueldo.mostrarDatos();

        // Probar retirar más del tope
        System.out.println("\nIntento de retirar $20000 (debería fallar):");
        cuentaSueldo.retirar(20000);
        cuentaSueldo.mostrarDatos();
        System.out.println("");

        // Transferencia por CBU
        System.out.println("Transferencia por CBU");
        cuentaSueldo.transferir(5000, 987654321012345678L);
        System.out.println("");

        // Transferencia por Alias
        System.out.println("Transferencia por alias");
        cuentaSueldo.transferir(2000, "mi.alias.sueldo");
        System.out.println("");

        // Pagar un servicio
        cuentaSueldo.pagarServicio();
        System.out.println("");

        // Cambiar alias
        cuentaSueldo.cambiarAlias("nuevo.alias.banco");
        System.out.println("");

        // Transferencia de alto monto
        cuentaSueldo.transferenciaAltoMonto(150000); // debería fallar, no hay tanto saldo
        cuentaSueldo.transferenciaAltoMonto(10000);  // debería fallar, no es alto monto

        // Ingreso extra para poder hacer transferencia de alto monto
        cuentaSueldo.ingresar(150000);
        System.out.println("\nDespués de ingresar $150000:");
        cuentaSueldo.mostrarDatos();

        // Transferencia de alto monto exitosa
        System.out.println("\nTransferencia de alto monto (éxito esperado):");
        cuentaSueldo.transferenciaAltoMonto(120000);
    }
}