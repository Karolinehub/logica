//Escrever um programa para determinar o consumo médio de um automóvel, 
//sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto. 

import  java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double ConsumoMedio;
		double kmi; // distância inicial
		double kmf; //distância final
		double litros;
		double kmtotal;

		 //escreva seu código aqui
		 System.out.print("Distância inicial (km): ");
		 kmi = input.nextDouble();
		 System.out.print("Distância final (km): ");
		 kmf = input.nextDouble();
		 System.out.print("Total de litros consumidos: ");
		 litros = input.nextDouble();
		 kmtotal = kmf - kmi;
		 if (litros != 0) {
			 ConsumoMedio = kmtotal / litros;
			 System.out.println("Consumo médio: " + ConsumoMedio + " km/l");
		 } else {
			 System.out.println("Litros não pode ser zero");
		 }

		input.close();
	}
}
