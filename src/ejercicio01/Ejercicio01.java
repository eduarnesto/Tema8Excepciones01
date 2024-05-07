package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		double numDouble;
		int numInt;
		Scanner sc = new Scanner (System.in);
		
		numDouble = Utils.readDouble(sc);
		numInt = Utils.readInt(sc);
		
		System.out.println(numDouble);
		System.out.println(numInt);
	}
}
