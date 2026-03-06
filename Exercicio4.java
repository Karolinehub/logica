// Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
// No final informar o nome do aluno e a sua média (aritmética).

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		 //escreva seu código aqui
		 System.out.print("Nome do aluno: ");
		 String nome = input.nextLine();
		 System.out.print("Nota 1: ");
		 double n1 = input.nextDouble();
		 System.out.print("Nota 2: ");
		 double n2 = input.nextDouble();
		 System.out.print("Nota 3: ");
		 double n3 = input.nextDouble();
		 double media = (n1 + n2 + n3) / 3.0;
		 System.out.println("Aluno: " + nome);
		 System.out.println("Média: " + media);
		
		input.close();
	}
}
