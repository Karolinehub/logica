// Faça um programa que receba um valor que foi depositado e exiba o valor com rendimento após um mês. 
// Considere fixo o juro da poupança em 0.70% a. m.

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); 
		 
		 //escreva seu código aqui		 		 System.out.print("Valor depositado: R$ ");
		 double deposito = input.nextDouble();
		 double rendimento = deposito * 0.007;
		 double total = deposito + rendimento;
		 System.out.println("Valor após um mês: R$ " + total);
		input.close();
	}
}