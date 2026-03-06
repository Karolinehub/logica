// Escrever um programa que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos.

import java.util.Scanner; 

public class Exercicio1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);   
		 
		 int x, y; // primeiro número e segundo número 
		 int soma, subt, div, mult; // operações  
		 
		 System.out.print("Digite o primeiro número:" );   
		 x = input.nextInt();   
		 System.out.print("Digite o segundo número:" );   
		 y = input.nextInt();   
		 
		 //escreva seu código aqui
		 soma = x + y;
		 subt = x - y;
		 mult = x * y;
		 div = y != 0 ? x / y : 0; // cuidado com divisão por zero
		 System.out.println("Soma: " + soma);
		 System.out.println("Subtração: " + subt);
		 System.out.println("Multiplicação: " + mult);
		 if (y != 0)
			 System.out.println("Divisão: " + div);
		 else
			 System.out.println("Divisão: não é possível dividir por zero");
		 input.close();
	}
}