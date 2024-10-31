package bi1.at2810.operadores;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
			
		float n1, n2, n3, n4, produto1, produto2, diferenca;
		
		System.out.println("N1: ");
		n1 = ler.nextFloat();
		
		System.out.println("N2: ");
		n2 = ler.nextFloat();
		
		System.out.println("N3: ");
		n3 = ler.nextFloat();
		
		System.out.println("N4: ");
		n4 = ler.nextFloat();
		
		produto1 = (n1 * n2);
		produto2 = (n3 * n4);
		diferenca = produto1 - produto2;
		
		System.out.println(" A diferença do produto 1 para o produto 2 é de: " + diferenca);
		
		
		ler.close();
		
		
		
				
				
		
		
		
		
		
	}

}
