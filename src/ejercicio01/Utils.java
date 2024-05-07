package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	public static double readDouble(Scanner sc){
		double res = 0;
		
		System.out.println("Introduzca un double");
		try {
			res = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("El valor introducido no es de tipo double");
		} finally {
			sc.nextLine();
		}
		
		return res;
	}
	
	public static int readInt(Scanner sc) {
		int res = 0;
		
		System.out.println("Introduzca un entero");
		try {
			res = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("El valor introducido no es de tipo double");
		} finally {
			sc.nextLine();
		}
		
		return res;
	}
}
