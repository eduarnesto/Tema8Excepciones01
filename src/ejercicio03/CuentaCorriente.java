package ejercicio03;

public class CuentaCorriente {
	/**
	 * Atributo donde guardar el DNI del titular
	 */
	private String dni;
	/**
	 * Atributo donde guardar el nombre del titular
	 */
	private String nombre;
	/**
	 * Atributo donde guardar el saldo del titular
	 */
	private double saldo;

	/**
	 * Constructor con parametros (dni y saldo) de la clase CuentaCorriente
	 * @throws DniException 
	 * @throws SaldoException 
	 */
	public CuentaCorriente(String dni, int saldo) throws DniException, SaldoException {

		if (dni != null && !dni.equals("") && dni.length() == 9) {
			this.dni = dni;
		} else {
			throw new DniException();
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		} else {
			throw new SaldoException();
		}
	}

	/**
	 * Constructor con parametros (dni, nombre y saldo) de la clase CuentaCorriente
	 * @throws DniException 
	 * @throws NombreException 
	 * @throws SaldoException 
	 */
	public CuentaCorriente(String dni, String nombre, int saldo) throws DniException, NombreException, SaldoException {
		super();
		if (dni != null && !dni.equals("") && dni.length() == 9) {
			this.dni = dni;
		} else {
			throw new DniException();
		}
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		} else {
			throw new NombreException();
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		} else {
			throw new SaldoException();
		}
	}

	/**
	 * Método para
	 * 
	 * @param dinero
	 */
	public boolean sacarDinero(double dinero) {
		boolean sacarDinero = false;
		if (this.saldo > dinero) {
			sacarDinero = true;
			this.saldo -= dinero;
		}
		return sacarDinero;
	}

	public void ingresarDinero(double dinero) {
		this.saldo += dinero;
	}

	public void mostrarInformacion() {
		System.out.println(this.dni);
		System.out.println(this.nombre);
		System.out.println(this.saldo);
	}

}