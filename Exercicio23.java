/*
 Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
 * Calcular e imprimir o seguinte:
 * Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área.
 * Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
 * Se o número de lados for igual a 5 escrever PENTÁGONO. 
*/

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//escreva seu código aqui
		 System.out.print("Número de lados: ");
		 int lados = input.nextInt();
		 System.out.print("Medida do lado (cm): ");
		 double lado = input.nextDouble();
		 if (lados == 3) {
			 double area = (lado * lado * Math.sqrt(3)) / 4;
			 System.out.println("TRIÂNGULO área=" + area);
		 } else if (lados == 4) {
			 double area = lado * lado;
			 System.out.println("QUADRADO área=" + area);
		 } else if (lados == 5) {
			 System.out.println("PENTÁGONO");
		 } else {
			 System.out.println("Polígono não tratado");
		 }
		
		input.close();
	}
}