package exemplos_Afins;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// Vari�veis
		int numero;

		// Entrada de dados
		System.out.print("Digite um numero inteiro:");
		numero = leia.nextInt();

		// Processamento e sa�da
		if ((numero % 2) == 0 && (numero > 1)) {
			System.out.print("Este n�mero � Par e � numero Positivo");
		} else if (numero > 1) {
			System.out.print("Este n�mero � Impar e � numero positivo");
		} else if (numero == 0) {
			System.out.print("Este numero � neutro");
		} else {
			System.out.print("Este numero � negativo");
		}
		leia.close();
	}

}
