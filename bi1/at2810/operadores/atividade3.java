package bi1.at2810.operadores;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float salBruto, adiNoturno, hExtra, desconto;
		
		System.out.println("Digite o sálario bruto: ");
		salBruto = ler.nextFloat();
		
		System.out.println("Digite o valor do adicional bruto: ");
		adiNoturno = ler.nextFloat();
		
		System.out.println("Digite o valor das horas extras: ");
		hExtra = ler.nextFloat();
		
		System.out.println("Digite o valor dos descontos: ");
		desconto = ler.nextFloat();
		
		System.out.println("Salário liquido: " + (salBruto + adiNoturno + (hExtra * 5) - desconto));
		
		ler.close();
	}

}
