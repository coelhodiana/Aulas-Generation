/*2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
package Aula3LacoRepeticao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int i, num, par=0, impar=0;
		for(i=1;i<=10;i++)
		{
			System.out.println(i+". Escreva um n�mero aleat�rio: ");
			num = read.nextInt();
			
			if(num%2 == 0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		}
		System.out.println("Quantidade de n�meros pares: "+par);
		System.out.println("Quantidade de n�meros �mpares: "+impar);
	}
}
