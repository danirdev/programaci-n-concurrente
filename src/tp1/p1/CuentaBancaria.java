package tp1.p1;

public class CuentaBancaria {
	private static int contadorCuentas = 100001;
	
	private int numCuenta;
	private int dni;
	private double saldoActual;
	private double interesAnual;

	public CuentaBancaria() {
		super();
		this.numCuenta = contadorCuentas ++;
		this.dni = 0;
		this.saldoActual = 0.0;
		this.interesAnual = 0.0;
	}

	public CuentaBancaria(int dni, double saldoActual, double interesAnual) {
		super();
		this.numCuenta = contadorCuentas ++;
		this.dni = dni;
		this.saldoActual = saldoActual;
		this.interesAnual = interesAnual;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public double getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numCuenta=" + numCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual
				+ ", interesAnual=" + interesAnual + "]\n";
	}
	
}