import java.util.Scanner;

public class Ex4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ("Escribe la calificación en número entero entre 0 y 10:");
		int calificacion = scanner.nextInt();
		
		switch(calificacion){
			case 0:
			System.out.println ("La calificación es Suspenso");
			break;
			case 1:
			System.out.println ("La calificación es Suspenso");
			break;
			case 2:
			System.out.println ("La calificación es Suspenso");
			break;
			case 3:
			System.out.println ("La calificación es Suspenso");
			break;
			case 4:
			System.out.println ("La calificación es Suspenso");
			break;
			case 5:
			System.out.println ("La calificación es Aprobado");
			break;
			case 6:
			System.out.println ("La calificación es Bien");
			break;
			case 7:
			System.out.println ("La calificación es Notable");
			break;
			case 8:
			System.out.println ("La calificación es Notable");
			break;
			case 9:
			System.out.println ("La calificación es Sobresaliente");
			break;
			case 10:
			System.out.println ("La calificación es Sobresaliente");
			break;
			default:
			System.out.println ("La calificación no es válida");
			break;
		}		
	}
}
