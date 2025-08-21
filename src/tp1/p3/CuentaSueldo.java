package tp1.p3;

public class CuentaSueldo extends CuentaBancaria implements IOperacionesBancarias{
    //Atributos
    private int legajo;
    private String institucion;
    private String beneficios;
    private long cbu;
    private String alias;
    private double tope;

    //Constructores
    public CuentaSueldo() {
        super();
        this.cbu = 0;
        this.tope = 15000;
    }

    public CuentaSueldo(long dni, double saldo, double interes, long cbu) {
        super(dni, saldo, interes);
        this.cbu = cbu;
        this.tope = 15000;
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= getSaldo() && monto <= tope) {
            setSaldo(getSaldo() - monto);
            System.out.println("Extracción de $" + monto + " realizada con éxito.");
        } else {
            System.out.println("Extracción no permitida (excede saldo o tope).");
        }
    }

    public void transferir(double monto, long cbuDestino) {
        if (monto > 0 && monto <= getSaldo()) {
            super.retirar(monto);
            System.out.println("Transferencia de $" + monto + " realizada al CBU " + cbuDestino);
            System.out.println("Saldo final: $" + getSaldo());
        } else {
            System.out.println("No se pudo realizar la transferencia.");
        }
    }

    public void transferir(double monto, String alias) {
        if (monto > 0 && monto <= getSaldo()) {
            super.retirar(monto);
            System.out.println("Transferencia de $" + monto + " realizada al alias " + alias);
            System.out.println("Saldo final: $" + getSaldo());
        } else {
            System.out.println("No se pudo realizar la transferencia.");
        }
    }

    @Override
    public void pagarServicio() {
        if (getSaldo() >= costoServicio) {
            super.retirar(costoServicio);
            System.out.println("Servicio pagado. Nuevo saldo: $" + getSaldo());
        } else {
            System.out.println("Saldo insuficiente para pagar el servicio.");
        }
    }

    @Override
    public void cambiarAlias(String nuevoAlias) {
        this.alias = nuevoAlias;
        System.out.println("Alias cambiado a: " + alias);
    }

    @Override
    public void transferenciaAltoMonto(double monto) {
        if (monto > 100000 && monto <= getSaldo()) {
            super.retirar(monto);
            System.out.println("Transferencia de alto monto realizada. Nuevo saldo: $" + getSaldo());
        } else {
            System.out.println("No se pudo realizar la transferencia de alto monto.");
        }
    }
}