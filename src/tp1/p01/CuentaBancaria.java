package tp1.p01;

public class CuentaBancaria {

    // Atributos
    
    private static long ultimoNumeroCuenta = 100000;
    private long numeroCuenta;
    private long dni;
    private double saldo;
    private double interesAnual;

    // Constructores

    public CuentaBancaria() {
        this.numeroCuenta = ++ultimoNumeroCuenta;
        this.dni = 0;
        this.saldo = 0.0;
        this.interesAnual = 0.0;
    }

    public CuentaBancaria(long dni, double saldo, double interesAnual) {
        this.numeroCuenta = ++ultimoNumeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interesAnual = interesAnual;
    }

    // Getters y setters

    public static long getUltimoNumeroCuenta() {
        return ultimoNumeroCuenta;
    }

    public static void setUltimoNumeroCuenta(long ultimoNumeroCuenta) {
        CuentaBancaria.ultimoNumeroCuenta = ultimoNumeroCuenta;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    // Métodos

    public void actualizarSaldo() {
        double interesDiario = interesAnual / 365.0 / 100.0;
        saldo += saldo * interesDiario;
    }

    public void ingresar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
    }

    public void mostrarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
        System.out.println("Interés anual: " + interesAnual + "%");
    }
    
}