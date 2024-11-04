package bl1at0411.collection2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class atividadefila1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean verdadeFalso = true;
		int opcoes;
		LinkedList<String> fila = new LinkedList<String>();

		while (verdadeFalso) {
			System.out.println("**************MENU****************");
			System.out.println("*                                *");
			System.out.println("*  1 - Adicionar cliente na fila *");
			System.out.println("*  2 - Listar todos os clientes  *");
			System.out.println("*  3 - retirar cliente da fila   *");
			System.out.println("*  0 - Sair                      *");
			System.out.println("*                                *");
			System.out.println("**********************************");
			System.out.println(" ENTRE COM A OPÇÃO DESEJADA: ");

			opcoes = scanner.nextInt();
			scanner.nextLine();

			switch (opcoes) {

			case 1:
				System.out.println("Adicione o cliente :");
				fila.add(scanner.nextLine());
				System.out.println("Cliente adicionado!");
				break;

			case 2:
				Iterator<String> iterator = fila.iterator();
				System.out.println("Fila :");
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					fila.remove();
					System.out.println("O cliente foi chamado!");
				}
				break;

			case 0:
				verdadeFalso = false;
				System.out.println("Programa finalizado!");
				break;
			}
		}
		scanner.close();
	}

}
