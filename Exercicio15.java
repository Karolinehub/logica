/* Faça um programa que receba o salário bruto de um funcionário e, usando a tabela a seguir, calcule e mostre o valor a receber. 
 * Sabe-se que este é composto pelo salário bruto acrescido de gratificação e descontado o imposto de 7% sobre o salário.
 * Salário até 350 reais - 100 gratificação, salário de 351 a 600 - gratificação 75, salário de 601 a 900 - gratificação 50, acima de 901 - gratificação de 35. */

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		//escreva seu código aqui
		 System.out.print("Salário bruto: R$ ");
		 double salario = input.nextDouble();
		 double grat;
		 if (salario <= 350) grat = 100;
		 else if (salario <= 600) grat = 75;
		 else if (salario <= 900) grat = 50;
		 else grat = 35;
		 double liquido = (salario + grat) - (0.07 * salario);
		 System.out.println("Valor a receber: R$ " + liquido);
		
		input.close();
	}
}