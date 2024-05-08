package ejercicio02;

/**
 * Clase para guardar toda la informacion relacionada con la hora
 */
public class Hora {
	/**
	 * Variable para guardar la
	 */
	protected int hora;
	protected int minuto;

	public Hora() {
		super();
	}

	public Hora(int hora, int minuto) throws NegativeHourException, NegativeMinuteException {
		super();
		if (hora >= 0) {
			this.hora = hora;
		} else {
			throw new NegativeHourException();
		}
		if (minuto >= 0) {
			this.minuto = minuto;
		} else {
			throw new NegativeMinuteException();
		}
	}

	public void inc() {
		this.minuto++;
		if (minuto == 60) {
			minuto = 0;
			hora++;
		}
	}

	public void setMinutos(int minuto) throws NegativeMinuteException {
		if (minuto >= 0) {
			this.minuto = minuto;
		} else {
			throw new NegativeMinuteException();
		}
	}

	public void setHora(int hora) throws NegativeHourException {

		if (hora >= 0) {
			this.hora = hora;
		} else {
			throw new NegativeHourException();
		}

	}

	@Override
	public String toString() {
		String res = "";

		if (hora < 10) {
			res += "0";
		}

		res += hora;

		if (minuto < 10) {
			res += "0";
		}

		res += ":" + minuto;

		return res;
	}

}