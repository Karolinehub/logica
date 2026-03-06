// Desenvolva um programa que dado um número, imprima uma das mensagens: é múltiplo de 3 ou não é múltiplo de 3. 

import java.util.Scanner;

public class Exercicio29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		//escreva seu código aqui
		 System.out.print("Digite um número: ");
		 int n = input.nextInt();
		 if (n % 3 == 0)
			 System.out.println("é múltiplo de 3");
		 else
			 System.out.println("não é múltiplo de 3");
		
		input.close();
	}
}