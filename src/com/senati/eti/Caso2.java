package com.senati.eti;

// Imporando la libreria para lecturas de datos
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// Instancia a la clase Scanner
		// Creado un objeto sc a partir de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declarar la variable y asignar un valor
		int numero = 0;
		
		// Lectura
		System.out.print("Ingrese n�mero: ");
		numero = sc.nextInt(); //Linea de lectura
		
		//Impresi�n
		System.out.println("\nN�mero Ingresado");
		System.out.println("------------------");
		System.out.println("N�mero ....: " + numero);
	}

}





