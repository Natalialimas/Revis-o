package pacoteTeste;

import java.util.Scanner;

public class Exercício3
	{
	    public static void main(String args[])
	    {

	        Scanner cd = new Scanner(System.in);
	        int num, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;

	        System.out.println("Informe um numero");
	        num = cd.nextInt();

	        while(num >= 0) 
	        {

	            if(num >=0 && num <= 15) 
	            {
	                cont1++;
	            }
	            else if(num >= 26 && num <=50) 
	            {
	                cont2++;
	            }
	            else if(num >=51 && num <=75) 
	            {
	                cont3++;
	            }
	            else if(num >=76 && num <=100)
	            {
	                cont4++;
	            }
	            System.out.println("Informe um numero");
	            num = cd.nextInt();

	        }
	        System.out.println("Numeros entre [0-25]: "+cont1);
	        System.out.println("Numeros entre [26-50]: "+cont2);
	        System.out.println("Numeros entre [51-75]: "+cont3);
	        System.out.println("Numeros entre [76-100]: "+cont4);

	    }

	}

