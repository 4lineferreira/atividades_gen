package lacoCondicional2910;

import java.util.Scanner;

public class LacoCondicionalif_atividade1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int a, b, c;

		System.out.println("Digite o valor de A");
		a = ler.nextInt();

		System.out.println("Digite o valor de B");
		b = ler.nextInt();

		System.out.println("Digite o valor de C");
		c = ler.nextInt();

		if ((a + b) > c) {
			System.out.println("A soma de A + B é maior do que C : " + a + "+" + b + "=" + (a + b) + ">" + c);
		} else if ((a + b) == c) {
			System.out.println("A soma de A + B é igual a C : " + a + "+" + b + "=" + (a + b) + "=" + c);
		} else {
			System.out.println("A soma de A + B é menor que C : " + a + "+" + b + "=" + (a + b) + "<" + c);
		}

		ler.close();
	}

}
