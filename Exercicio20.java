/* Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poder� ou n�o votar este ano 
 * (não é necessário considerar o mês em que ela nasceu). */

import java.util.Scanner;

 public class Exercicio20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		//escreva seu código aqui
		 System.out.print("Ano de nascimento: ");
		 int ano = input.nextInt();
		 int idade = java.time.Year.now().getValue() - ano;
		 if (idade >= 16)
			 System.out.println("Pode votar este ano");
		 else
			 System.out.println("Não pode votar este ano");
		
		input.close();
	}
}