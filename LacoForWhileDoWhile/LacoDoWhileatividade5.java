package LacoForWhileDoWhile;

import java.util.Scanner;

public class LacoDoWhileatividade5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numero;
		boolean autenticador = true;
		int contador = 0;

		do {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();

			if (numero > 0) {
				contador = numero + contador;
			}

			if (numero == 0) {
				autenticador = false;
				System.out.println("A soma dos números positvos: " + contador);
			}

		} while (autenticador);
		scanner.close();

	}

}
