import java.util.Scanner;

public class Operaciones{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ("Escribe el primer numero entero:");
		int num1 = scanner.nextInt();
		
		System.out.println ("Escribe el segundo numero entero:");
		int num2 = scanner.nextInt();
		
		System.out.println("La suma de " + num1 + " + " + num2 +" es = " +(num1+num2));
		System.out.println("La resta de " + num1 + " - " + num2 +" es = " +(num1-num2));
		System.out.println("La multiplicación de " + num1 + " * " + num2 +" es = " +(num1*num2));
		System.out.println("La división de " + num1 + " / " + num2 +" es = " + ((float)num1/num2));
	}
}
