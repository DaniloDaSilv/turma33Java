package lista4;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um
		 *n�mero igual a zero. No final, mostre a soma dos n�meros
		 *digitados.(DO...WHILE)
		 */
		
		Scanner leia = new Scanner(System.in);
		int num = 0;
		int somaNum = 0;
		
		do {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			somaNum+=num;
		}while(num != 0);
		
		System.out.println("A soma dos numeors �:" + somaNum);
		
		
		
	}

}
