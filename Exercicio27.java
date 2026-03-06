/* Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno.
 * Triângulo Equilátero: possui os 3 lados iguais.
 * Triângulo Isósceles: possui 2 lados iguais.
 * Triângulo Escaleno: possui 3 lados diferentes. */

import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		 //escreva seu código aqui		 System.out.print("Lado 1: ");
		 double a = input.nextDouble();
		 System.out.print("Lado 2: ");
		 double b = input.nextDouble();
		 System.out.print("Lado 3: ");
		 double c = input.nextDouble();
		 if (a == b && b == c) {
			 System.out.println("Equilátero");
		 } else if (a == b || b == c || a == c) {
			 System.out.println("Isósceles");
		 } else {
			 System.out.println("Escaleno");
		 }		
		input.close();
	}
}