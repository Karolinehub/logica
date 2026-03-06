// Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usuário não informará valores iguais.


import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 //escreva seu código aqui		 System.out.print("Primeiro número: ");
		 int n1 = input.nextInt();
		 System.out.print("Segundo número: ");
		 int n2 = input.nextInt();
		 System.out.print("Terceiro número: ");
		 int n3 = input.nextInt();
		 int maior = n1;
		 if (n2 > maior) maior = n2;
		 if (n3 > maior) maior = n3;
		 System.out.println("Maior: " + maior);		
		input.close();

	}
}