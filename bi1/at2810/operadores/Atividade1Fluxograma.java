package bi1.at2810.operadores;

import java.util.Scanner;

public class Atividade1Fluxograma {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); //entrada de dados
		
		float salario, abono, novoSalario; //dados
		
		System.out.println("digite o seu sálario: ");
		salario = ler.nextFloat();
		
		System.out.println("Qual é o valor do seu abono? ");
		abono = ler.nextFloat();
		
		System.out.println("Seu novo salário é: " + (salario + abono)); 
		
		
	}

}
