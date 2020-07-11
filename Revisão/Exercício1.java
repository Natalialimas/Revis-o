package Revisão;

import java.util.Scanner;

public class Exercício1
{
	public static void main (String args[]) 
	{
	try (Scanner ler = new Scanner (System.in))
	{
		double preco,total;
		int opcao;
		 
		 
		 System.out.println("Entre com o preço ");
		 preco = ler.nextDouble();
			
		 System.out.println("Escolha uma opção de pagamento: "
		 		+ "\n1- À vista em dinheiro ou cheque, recebe 20% de desconto \r\n" +
		 		"2 À vista no cartão de crédito, recebe 15% de desconto \r\n" + 
		 		"3 Em duas vezes, preço normal de etiqueta sem juros \r\n" + 
		 		"4 Em três vezes, preço normal de etiqueta mais juros de 10%\r\n" + 
		 		" ");
		 
		 opcao = ler.nextInt();
		 switch (opcao)
		 {
		 case 1:
			 total = preco* 0.20;
			 total = preco - total;
			 System.out.println("O seu valor total com 20% de desconto é: " + total);
			 break;
			 
		 case 2:
			 total = preco* 0.15;
			 total = preco - total;
			 System.out.println("O seu valor total com 20% de desconto é: " + total);
			 break;
			 
		 case 3:
			 System.out.println("O seu valor total é: " + (preco/2));
			 break;
			 
		 case 4:
			 total = preco* 0.10;
			 total = preco - total;
			 System.out.println("O seu valor total é: " + (Math.round(total/3)));
			 break;
		  default:
		      System.out.println("Opção Invalida");
		      break;

		 	}
		}
	}
} 

