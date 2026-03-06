/* Faça um programa que receba o salário de um funcionário chamado Carlos. Sabe-se que outro funcionário, João, tem salário equivalente a um terço do salário de Carlos. 
 * Carlos aplicará seu salário integralmente na caderneta de poupança, que rende 2% ao mês, e João aplicará seu salário integralmente no fundo de renda fixa, que rende 5% ao mês. 
 * O programa deverá calcular e mostrar a quantidade de meses necessários para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos. */

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		//escreva seu código aqui
		 System.out.print("Salário de Carlos: R$ ");
		 double carlos = input.nextDouble();
		 double joao = carlos / 3.0;
		 int meses = 0;
		 while (joao < carlos) {
			 carlos *= 1.02;
			 joao *= 1.05;
			 meses++;
		 }
		 System.out.println("Meses necessários: " + meses);
		
		input.close();
	}
}