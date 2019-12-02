import java.util.Scanner;

public class Ex4if{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ("Escribe la calificación en número entero entre 0 y 10:");
		int calificacion = scanner.nextInt();
		
		if(calificacion>=0 && calificacion<=4) {
			System.out.println ("La calificación es Suspenso");
		}
		else if (calificacion==5) {
			System.out.println ("La calificación es Aprobado");
		}
		else if (calificacion==6) {
			System.out.println ("La calificación es Bien");
		}
		else if (calificacion>=7 && calificacion<=8) {
			System.out.println ("La calificación es Notable");
		}
		else if (calificacion>=9 && calificacion<=10) {
			System.out.println ("La calificación es Sobresaliente");
		}
		else {
			System.out.println ("La calificación no es válida");
		}	
	}
}