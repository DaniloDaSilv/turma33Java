package lista5;

import java.util.Scanner;

public class Ex1Vect {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de
		 * uma atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a
		 * apresente.
		 */
		Scanner leia = new Scanner(System.in);

		int[] pontos = new int[5];
		int maior = 0;
		System.out.println("Qual a maior nota");

		for (int x = 0; x < 5; x++) {
			System.out.print("Digite o valor da nota: ");
			pontos[x] = leia.nextInt();

		}

		for (int x = 0; x < 5; x++) {
			if (maior < pontos[x]) {
				maior = pontos[x];
			}
		}
		System.out.println("\nA maior nota � " + maior);

	}

}
