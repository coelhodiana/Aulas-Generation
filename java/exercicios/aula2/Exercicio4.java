package Aula2LacoRepeticao;

import java.util.*;

public class Exercicio4 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.println("Escreva um n�mero: ");
		n = ler.nextInt();
		
		if(n%2 == 0)
		{
			System.out.println("O n�mero "+n+" � par \n" + "A raiz quadrada �: "+Math.sqrt(Math.pow(n, 2)));
		}
		else
		{
			System.out.printf("O n�mero "+n+ " � impar \n" + "O quadrado �: "+Math.pow(n,2));
		}
	}
}
