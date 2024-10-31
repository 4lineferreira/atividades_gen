package AT2910.lacoCondicional;

import java.util.Scanner;

public class LacoCondicionalif_atividade2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num;
		String resultado;

		System.out.println("Digite um número: ");
		num = ler.nextInt();

		if (num % 2 == 0) {
			resultado = "par";
		} else {
			resultado = "impar";
		}

		if (num > 0) {
			System.out.println(" O número " + num + " é positivo e " + resultado);
		} else {
			System.out.println(" O número " + num + " é negativo e " +  resultado);
		}
		ler.close();

	}
}
