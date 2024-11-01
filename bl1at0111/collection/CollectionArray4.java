package bl1at0111.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class CollectionArray4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		HashSet<Integer> numList = new HashSet<Integer>();

		System.out.println("Digite o número que você deseja encontrar:");
		int buscar = scanner.nextInt();

		Collections.addAll(numList, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);

		if (numList.contains(buscar)) {

			System.out.println("O número " + buscar + " foi localizado!");
		} else {
			System.out.println("O número " + buscar + " não foi localizado");
		}
		scanner.close();
	}

}
