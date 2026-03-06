// Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). 
// O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 //escreva seu código aqui	 	 System.out.print("Cotação do dólar: ");
	 	 double cotacao = input.nextDouble();
	 	 System.out.print("Quantidade de dólares: ");
	 	 double dolares = input.nextDouble();
	 	 double reais = cotacao * dolares;
	 	 System.out.println("Valor em reais: R$ " + reais);
		 input.close();
	}
}
