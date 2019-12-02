package com.softtek.java.academy.exercises;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println ("Cuantas lineas el triángulo (Entre 1 y 10)?");
		int lineas = scanner.nextInt();
		String pino="";
		for(int i=0;i<lineas;i++) {
			pino+="*";
		}		
		System.out.println(pino);
		for(int i=lineas;i>1;i--) {
			pino=pino.substring(0,i-1);
			System.out.println(pino);
		}
		
	}
}
