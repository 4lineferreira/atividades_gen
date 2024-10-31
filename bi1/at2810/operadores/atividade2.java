package bi1.at2810.operadores;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float n1, n2, n3, n4, media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = ler.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		n3 = ler.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		n4 = ler.nextFloat();
		
		media = (n1 + n2 + n3 + n4) / 4;

		System.out.printf("Média = %.1f%n ", media);
		
	}

}
