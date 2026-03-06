// Faça um programa que receba um número inteiro entre 1 e 7 e informe o dia da semana correspondente (1 = domingo, 2 = segunda).

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		 //escreva seu código aqui		 System.out.print("Digite um número (1-7): ");
		 int dia = input.nextInt();
		 String nome;
		 switch (dia) {
		 case 1: nome = "domingo"; break;
		 case 2: nome = "segunda"; break;
		 case 3: nome = "terça"; break;
		 case 4: nome = "quarta"; break;
		 case 5: nome = "quinta"; break;
		 case 6: nome = "sexta"; break;
		 case 7: nome = "sábado"; break;
		 default: nome = "inválido"; break;
		 }
		 System.out.println("Dia da semana: " + nome);				
		input.close();
	}
}