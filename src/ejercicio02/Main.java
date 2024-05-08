package ejercicio02;

public class Main {

	public static void main(String[] args) {
		HoraExacta hora = new HoraExacta();

		try {
			hora.setHora(-2);
		} catch (NegativeHourException e) {
			e.printStackTrace();
		}
		
		try {
			hora.setMinutos(-3);
		} catch (NegativeMinuteException e) {
			e.printStackTrace();
		}
		
		try {
			hora.setSegundos(-3);
		} catch (NegativeSecondException e) {
			e.printStackTrace();
		}
	}

}
