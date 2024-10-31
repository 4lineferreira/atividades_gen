package bloco1.AT2910.lacoCondicional;

import java.util.Scanner;

public class LacoCondicionalSwitch_atividade7 {
	public static void main(String[] args) {

		float numero1, numero2;
		int codigoOperacao;
		String operacao;
		float resultado;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um número: ");
		numero1 = ler.nextInt();

		System.out.println("Digite outro número: ");
		numero2 = ler.nextInt();

		System.out.println("Escolha uma operação sendo : \n[1] SOMA \t[2] SUBTRAÇÃO \n[3] DIVISÃO \t[4] MULTIPICAÇÃO ");
		codigoOperacao = ler.nextInt();

		switch (codigoOperacao) {
		case 1:
			resultado = (numero1 + numero2);
			operacao = " + ";
			break;

		case 2:
			resultado = (numero1 - numero2);
			operacao = " - ";
			break;

		case 3:
			resultado = (numero1 / numero2);
			operacao = " / ";
			break;

		case 4:
			resultado = (numero1 * numero2);
			operacao = " x ";
			break;

		default:
			System.out.println("Digite uma operação valida");
			return;
		}

		System.out.println(numero1 + operacao + numero2 + " = " + resultado);

	}
}
