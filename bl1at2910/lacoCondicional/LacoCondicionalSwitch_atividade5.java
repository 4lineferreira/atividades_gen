package bl1at2910.lacoCondicional;

import java.util.Scanner;

public class LacoCondicionalSwitch_atividade5 {

	public static void main(String[] args) {
		
		 int codigoProduto, qnt;
		 String produto;
		 double precoUnidade, total;
		 		 
		 Scanner ler = new Scanner(System.in);
		 
		 System.out.println("Digite o código do produto de : ");
		 codigoProduto = ler.nextInt();
		 
		 System.out.println("Digite a quantidade : ");
		 qnt = ler.nextInt();
		 		 
		 switch (codigoProduto) {
		 case 1:
			 produto = "Cachorro quente";
			 precoUnidade = 10.00;
			 break;
		
		 case 2:
			 produto = "X-Salada";
			 precoUnidade = 15.00;
			 break;
			 
		 case 3:
			 produto = "X-Bacon";
			 precoUnidade = 18.00;
			 break;
			 
		 case 4:
			 produto = "Bauru";
			 precoUnidade = 12.00;
			 break;
			 
		 case 5:
			 produto = "refrigerante";
			 precoUnidade = 8.00;
			 break;
			 
		 case 6:
			 produto = "Suco de Laranja";
			 precoUnidade = 13.00;
			 break;	 
			 
		
			 default:
				 System.out.println(" Digite válido entre 1 e 6 ");
				 ler.close();
				 return; 
			 }
		 
		 total = qnt * precoUnidade;
		 
		 System.out.println("\nProduto: " + produto + "\nValor total: " + total);
		 
		 ler.close();

	}

}
