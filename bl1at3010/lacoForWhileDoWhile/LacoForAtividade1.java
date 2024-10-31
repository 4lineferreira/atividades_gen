package bl1at3010.lacoForWhileDoWhile;

import java.util.Scanner;

public class LacoForAtividade1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numero1, numero2;

		System.out.println("+++++++++++++++ Digite o primeiro número: +++++++++++++++");
		numero1 = scanner.nextInt();

		System.out.println("++++++++++++++++ Digite o ultimo número: +++++++++++++++");
		numero2 = scanner.nextInt();

		if (numero1 >= numero2) {
			System.out.println("O primeiro número deve ser menor que o segundo número");
			System.out.println("+++++++++++++++++++Tente novamente+++++++++++++++++++");
		} else {

			for (int i = numero1; i <= numero2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println( + i + " é multiplo de 5 e 3: ");
				}
			}

		}

	}

}
