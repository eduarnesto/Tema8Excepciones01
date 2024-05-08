package ejercicio02;

public class HoraExacta extends Hora {
	private int segundo;

	public HoraExacta(int hora, int minuto, int segundo)
			throws NegativeHourException, NegativeMinuteException, NegativeSecondException {
		super(hora, minuto);
		if (segundo >= 0) {
			this.segundo = segundo;
		} else {
			throw new NegativeSecondException();
		}
	}

	public HoraExacta() {
	}

	public void setSegundos(int segundo) throws NegativeSecondException {
		if (segundo >= 0) {
			this.segundo = segundo;
		} else {
			throw new NegativeSecondException();
		}
	}

	public void inc() {
		segundo++;
		if (segundo == 60) {
			segundo = 0;
			super.inc();
		}
	}

	@Override
	public String toString() {
		String res = "";

		res += super.toString();

		if (segundo < 10) {
			res += "0";
		}

		res += ":" + segundo;

		return res;
	}

}
