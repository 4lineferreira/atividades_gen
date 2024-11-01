package bl1at0111.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionArray1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cor = new ArrayList<String>();

		for (int i = 1; i < 6; i++) {
			System.out.println("Digite a " + i + " cor");
			cor.add(scanner.next());

		}

		System.out.println("Listar todas as cores :\n");
		for (String cores : cor) {
			System.out.println(cores);

		}
		Collections.sort(cor);
		System.out.println("Ordenar cores: \n");

		for (String cores : cor) {
			System.out.println(cores);
		}
	}
}
