package ejercicio03;

import java.util.Scanner;

public class Pincipal {
	public static void main(String[] args) {
		String dni;
		String nombre;
		int saldo;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca el DNI");
		dni = sc.nextLine();
		
		System.out.println("Introduzca el nombre");
		nombre = sc.nextLine();
		
		System.out.println("Introduzca el saldo");
		saldo = sc.nextInt();
		sc.nextLine();
	}
	
}
