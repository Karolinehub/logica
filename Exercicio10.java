// Criar um programa que leia pelo teclado um valor inteiro e diga se é par ou ímpar.

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		//escreva seu código aqui
		 System.out.print("Digite um inteiro: ");
		 int valor = input.nextInt();
		 if (valor % 2 == 0)
			 System.out.println(valor + " é par");
		 else
			 System.out.println(valor + " é ímpar");
		
		input.close();
	}
}