/* Acrescente as seguintes mensagens à solução da tarefa 14 conforme o caso.
 * Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
 * Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO. */

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		 //escreva seu código aqui
		System.out.print("Digite o número de lados do polígono: ");
		int lados = input.nextInt();

		if (lados < 3) {
			System.out.println("NÃO É UM POLÍGONO");
		} else if (lados == 3) {
			System.out.println("TRIÂNGULO");
		} else if (lados == 4) {
			System.out.println("QUADRADO");
		} else if (lados == 5) {
			System.out.println("PENTÁGONO");
		} else {
			System.out.println("POLÍGONO NÃO IDENTIFICADO");
		}
		input.close();
	}
}