package Revis�o;

import java.util.Scanner;

public class Exerc�cio1
{
	public static void main (String args[]) 
	{
	try (Scanner ler = new Scanner (System.in))
	{
		double preco,total;
		int opcao;
		 
		 
		 System.out.println("Entre com o pre�o ");
		 preco = ler.nextDouble();
			
		 System.out.println("Escolha uma op��o de pagamento: "
		 		+ "\n1- � vista em dinheiro ou cheque, recebe 20% de desconto \r\n" +
		 		"2 � vista no cart�o de cr�dito, recebe 15% de desconto \r\n" + 
		 		"3 Em duas vezes, pre�o normal de etiqueta sem juros \r\n" + 
		 		"4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%\r\n" + 
		 		" ");
		 
		 opcao = ler.nextInt();
		 switch (opcao)
		 {
		 case 1:
			 total = preco* 0.20;
			 total = preco - total;
			 System.out.println("O seu valor total com 20% de desconto �: " + total);
			 break;
			 
		 case 2:
			 total = preco* 0.15;
			 total = preco - total;
			 System.out.println("O seu valor total com 20% de desconto �: " + total);
			 break;
			 
		 case 3:
			 System.out.println("O seu valor total �: " + (preco/2));
			 break;
			 
		 case 4:
			 total = preco* 0.10;
			 total = preco - total;
			 System.out.println("O seu valor total �: " + (Math.round(total/3)));
			 break;
		  default:
		      System.out.println("Op��o Invalida");
		      break;

		 	}
		}
	}
} 

