package com.senati.eti;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float num1 = 0, num2 = 0;
		
		System.out.print("Primer n�mero...: ");
		num1 = sc.nextFloat();
		
		System.out.print("Segundo n�mero...: ");
		num2 = sc.nextFloat();
		
		System.out.println("N�meros Ingresados");
		System.out.println("------------------");
		System.out.println("N�mero 1...:" + num1);
		System.out.println("N�mero 2...:" + num2);
	}

}
