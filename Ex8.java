package com.softtek.java.academy.exercises;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		boolean seguir=false;
		
		do {
			System.out.println ("Primer n�mero:");
			int numero1 = scanner.nextInt();
			System.out.println ("Segundo n�mero:");
			int numero2 = scanner.nextInt();
			System.out.println ("La suma de los n�meros es " + (numero1+numero2));
			System.out.println ("Desea otra suma (Y/N)?");
			String respuesta = scanner.next();
				if(!respuesta.equals("N")) {
					seguir=true;			
				}
				else {
					seguir=false;
				}
		}while(seguir==true);
		
	}
}
