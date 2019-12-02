package com.softtek.java.academy.exercises;

public class Ex7 {
	public static void main(String[] args){
		int numero=100;
		int suma=0;
	
		for(int i=0;i<numero;i++) {
			if(i%3==0) {
				suma+=i;
			}
		}
		for(int i=0;i<numero;i++) {
			if(i%5==0) {
				suma+=i;
			}
		}
		System.out.println(suma);
	}
}
