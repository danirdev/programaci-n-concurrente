package tp1.p01;

public class CuentaBancaria {

    // Atributos estáticos para el manejo de cuentas
    private static long ultimoNumeroCuenta = 100000;
    private long numeroCuenta;
    private long dni;
    private double saldo;
    private double interesAnual;

    // Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = ++ultimoNumeroCuenta;
        this.dni = 0;
        this.saldo = 0.0;
        this.interesAnual = 0.0;
    }

    // Constructor con DNI, saldo e interés
    public CuentaBancaria(long dni, double saldo, double interesAnual) {
        this.numeroCuenta = ++ultimoNumeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interesAnual = interesAnual;
    }

    // Actualizar saldo aplicando interés diario
    public void actualizarSaldo() {
        double interesDiario = interesAnual / 365.0 / 100.0;
        saldo += saldo * interesDiario;
    }

    // Ingresar dinero
    public void ingresar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    // Retirar dinero
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
    }

    // Mostrar datos de la cuenta
    public void mostrarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
        System.out.println("Interés anual: " + interesAnual + "%");
    }

    // Getters y setters
    public long getNumeroCuenta() { return numeroCuenta; }
    public long getDni() { return dni; }
    public double getSaldo() { return saldo; }
    public double getInteresAnual() { return interesAnual; }
    public void setDni(long dni) { this.dni = dni; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public void setInteresAnual(double interesAnual) { this.interesAnual = interesAnual; }
    
}