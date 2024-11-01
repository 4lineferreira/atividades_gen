package bl1at0111.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionSetIterator3 {
	public static void main(String[] args) {

		Scanner Scanner = new Scanner(System.in);
		HashSet<Integer> numeros = new HashSet<Integer>();
		
		
		for (int i = 1; i < 11; i++) {
			System.out.println("Digite o " + i + "º número ");
			numeros.add(Scanner.nextInt());	
			
		}
		Iterator<Integer> numeroI = numeros.iterator();
		
		System.out.println("Listar dados do Set: ");
		while(numeroI.hasNext()) {
			int numero = numeroI.next();
			System.out.println(numero);
		}
	}
}
