package b1at3110.vetores;

import java.util.Scanner;

public class vetoratividade2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int i, vetorInteiro[] = new int[10];
		String guardarPar = " ", guardarImpar = " ";
		float soma=0;

		for (i = 0; i < vetorInteiro.length; i++) {
			System.out.println("Digite um número: ");
			vetorInteiro[i] = scanner.nextInt();

		}
		for (i = 1; i < vetorInteiro.length; i += 2) {
			guardarImpar += vetorInteiro[i];

		}
		for (i = 0; i < vetorInteiro.length; i++) {
			if (vetorInteiro[i] % 2 == 0) {
				guardarPar += vetorInteiro[i];
			}

		}
		for (i = 0; i < vetorInteiro.length; i++) {
			soma += vetorInteiro[i];
		}

		float media = (soma /vetorInteiro.length);

		System.out.println("\nElemento nos índeces impares: " + guardarImpar);
		System.out.println("\nElementos pares :" + guardarPar);
		System.out.println("\nSoma: " + soma);
		System.out.println("\nMédia:"+ media);

	}

}
