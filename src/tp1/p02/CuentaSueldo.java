package tp1.p02;

import tp1.p01.CuentaBancaria;

public class CuentaSueldo extends CuentaBancaria {

    // Atributos

    private int legajo;
    private String institucion;
    private String beneficios;
    private long cbu;
    private double tope;

    // Constructores

    public CuentaSueldo() {
        super();
        this.tope = 15000.0;
    }

    public CuentaSueldo(long cbu) {
        super();
        this.cbu = cbu;
        this.tope = 15000.0;
    }

    // Getters y Setters

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public long getCbu() {
        return cbu;
    }

    public void setCbu(long cbu) {
        this.cbu = cbu;
    }

    public double getTope() {
        return tope;
    }

    public void setTope(double tope) {
        this.tope = tope;
    }

    // Metodos

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= getSaldo() && monto <= tope) {
            setSaldo(getSaldo() - monto);
            System.out.println("Retiro exitoso. Saldo actual: " + getSaldo());
        } else {
            System.out.println("No se puede retirar ese monto (excede saldo o tope).");
        }
    }

    public void transferir(double monto, long cbuDestino) {
        if (monto > 0 && monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
            System.out.println("Transferencia a CBU " + cbuDestino + " realizada. Saldo final: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente para transferir.");
        }
    }

    public void transferir(double monto, String aliasDestino) {
        if (monto > 0 && monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
            System.out.println("Transferencia a alias " + aliasDestino + " realizada. Saldo final: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente para transferir.");
        }
    }

}
