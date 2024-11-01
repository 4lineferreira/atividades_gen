package bl1at0111.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsArray2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numero = new ArrayList<Integer>();

		System.out.println("Qual número você encontrar? ");
		int buscar = scanner.nextInt(); // buscar é só pra armazenar

		numero.add(2);
		numero.add(5);
		numero.add(1);
		numero.add(3);
		numero.add(4);
		numero.add(9);
		numero.add(7);
		numero.add(8);
		numero.add(10);
		numero.add(6);

		if (numero.contains(buscar)) {
			System.out.println("O número " + buscar + " está localizado na posição " + numero.indexOf(buscar));
		} else {
			System.out.println("O número " + buscar + " não foi encontrado!");
		}

	}

}
