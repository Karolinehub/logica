// Faça um programa que receba um número inteiro entre 1 e 12 e informe o mês correspondente (1 = janeiro, 2 = fevereiro),

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		 //escreva seu código aqui		 System.out.print("Digite um número (1-12): ");
		 int mes = input.nextInt();
		 String nome;
		 switch (mes) {
		 case 1: nome = "janeiro"; break;
		 case 2: nome = "fevereiro"; break;
		 case 3: nome = "março"; break;
		 case 4: nome = "abril"; break;
		 case 5: nome = "maio"; break;
		 case 6: nome = "junho"; break;
		 case 7: nome = "julho"; break;
		 case 8: nome = "agosto"; break;
		 case 9: nome = "setembro"; break;
		 case 10: nome = "outubro"; break;
		 case 11: nome = "novembro"; break;
		 case 12: nome = "dezembro"; break;
		 default: nome = "inválido"; break;
		 }
		 System.out.println("Mês: " + nome);		
		input.close();
	}
}