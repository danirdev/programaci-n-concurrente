package tp1.p3;

public class CuentaBancaria {
    //Atributos
    private static long contadorCuentas = 100000; // para asignar correlativamente
    private long numeroCuenta;
    private long dni;
    private double saldo;
    private double interesAnual;

    //Constructores
    public CuentaBancaria() {
        this.numeroCuenta = ++contadorCuentas;
        this.dni = 0;
        this.saldo = 0.0;
        this.interesAnual = 0.0;
    }

    public CuentaBancaria(long dni, double saldo, double interesAnual) {
        this.numeroCuenta = ++contadorCuentas;
        this.dni = dni;
        this.saldo = saldo;
        this.interesAnual = interesAnual;
    }


    //Getters y Setters
    public long getNumeroCuenta() { return numeroCuenta; }
    public long getDniCliente() { return dni; }
    public double getSaldo() { return saldo; }
    public double getInteresAnual() { return interesAnual; }

    public static void setContadorCuentas(long contadorCuentas) {
        CuentaBancaria.contadorCuentas = contadorCuentas;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    //Métodos
    public void actualizarSaldo() {
        double interesDiario = interesAnual / 365;
        saldo += saldo * (interesDiario / 100); // porque es porcentaje
    }

    public void ingresar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void mostrarDatos() {
        System.out.println("Cuenta Nº: " + numeroCuenta);
        System.out.println("DNI Cliente: " + dni);
        System.out.printf("Saldo: $%.2f%n", saldo);
        System.out.println("Interés Anual: " + interesAnual + "%");
    }

}