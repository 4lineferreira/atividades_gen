package b1at3110.vetores;

import java.util.Arrays;
import java.util.Scanner;

public class VetorAtividade1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numero, vetorInteiro[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("Digite o número que você deseja encontrar:");
		numero = scanner.nextInt();

		for (int i = 0; i < vetorInteiro.length; i++) {
			
			if (numero == vetorInteiro[i]) {
				System.out.println(" O número " + numero + " está localizado na posição: " + i);
			}else {
				System.out.println("O número " + numero + " não foi localizado!");
				break;
			}

		}

	}

}
