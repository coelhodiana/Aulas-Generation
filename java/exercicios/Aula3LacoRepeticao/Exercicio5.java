/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
package Aula3LacoRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String args[]) { 
		Scanner read = new Scanner(System.in);
		int i=0,num=1,soma=0;
		
		do
		{
			System.out.println("Digite um n�mero: ");
			num = read.nextInt();
			soma = soma+num;
			i++;
		}while(num!=0);
		System.out.println("Soma dos n�meros digitados: "+soma);
	}
}
