package Revisão;
import java.lang.Math;
import java.util.Scanner;

public class Exercício2
{
	public static void main (String args[]) 
	{
	Scanner opa = new Scanner(System.in);
	
	float altura;
	float peso;
	float imc;
	
	System.out.println ("Entre com seu peso: ");
	peso = opa.nextFloat();
	
	System.out.println ("Entre com sua altura: ");
	altura = opa.nextFloat();
	
	imc = (float) Math.pow (altura,2)/peso;
	
	if (imc<18.5) 
	{
		System.out.println ("Você esta abaixo do peso");
	}
	else if (imc>=18.5 && imc<25) 
	{
		System.out.println ("Você esta no peso normal");
	}
	else if (imc>=25 && imc<30) 
	{
		System.out.println ("Você esta acima do peso");
	}
	else if (imc>30) 
	{
		System.out.println ("Você esta Obeso");
	}
		
	}
}
