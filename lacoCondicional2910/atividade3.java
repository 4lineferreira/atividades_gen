package lacoCondicional2910;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade;
		String doador, resultado;
		boolean primeiraDoacao;

		System.out.println("Digite o nome do doador: ");
		doador = ler.next();

		System.out.println("Digite a idade do doador: ");
		idade = ler.nextInt();
		
			if (idade < 18 || idade > 69){
				System.out.println("Você não está apto para doação.");
				return;
			}else System.out.println("Primeira doação? \n[true] sim \\n[false] não ");
			primeiraDoacao = ler.hasNext();
	        }

}
