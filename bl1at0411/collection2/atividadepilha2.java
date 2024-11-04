package bl1at0411.collection2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class atividadepilha2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int opcoes;
		String nome;
		Stack<String> livro = new Stack<String>();

		do {
			System.out.println("******************MENU********************");
			System.out.println("*                                        *");
			System.out.println("*  1 - Adicionar um livro na pilha       *");
			System.out.println("*  2 - Listar todos os livros da pilha   *");
			System.out.println("*  3 - Retirar um livro da pilha         *");
			System.out.println("*  0 - O programa deve ser finalizado    *");
			System.out.println("*                                        *");
			System.out.println("******************************************");
			System.out.println("        ENTRE COM A OPÇÃO DESEJADA:      ");

			opcoes = scanner.nextInt();
			scanner.nextLine();

			switch (opcoes) {

			case 1:
				System.out.println("Adicione um livro :");
				nome = scanner.nextLine();
				livro.push(nome);
				System.out.println("Livro adicionado!!");
				break;

			case 2:
				Iterator<String> iterator = livro.iterator();
				System.out.println("Pilha :");
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				break;

			case 3:
				if (livro.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				} else {
					livro.pop();
					System.out.println("Um Livro foi retirado da pilha!");
				}
				break;

			}
		} while (opcoes != 0);
		System.out.println("Programa Finalizado!");
		scanner.close();

	}

}
