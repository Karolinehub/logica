// Escreva um programa que entre com um número e o imprima caso seja maior do que 20. 

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 //escreva seu código aqui
		 System.out.print("Digite um número: ");
		 int valor = input.nextInt();
		 if (valor > 20) {
			 System.out.println(valor + " é maior que 20");
		 }

		input.close();
	}
}