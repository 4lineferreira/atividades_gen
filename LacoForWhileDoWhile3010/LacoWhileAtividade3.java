package LacoForWhileDoWhile3010;

import java.util.Scanner;

public class LacoWhileAtividade3 {

	public static void main(String[] args) {

		int contadorMenor = 0, idade, contadorMaior = 0;
		Boolean continuar = true;

		Scanner scanner = new Scanner(System.in);

		while (continuar) {
			System.out.println("Digite uma idade: ");
			idade = scanner.nextInt();

			if (idade < 0) {
				continuar = false;
				
			} if(idade <=21) {
				contadorMenor++;
			} if (idade > 50) {
				contadorMaior++;
			}
		} System.out.println("idade até 25: " + contadorMenor);
		System.out.println("idade até 25: " + contadorMaior);
	} 

}
