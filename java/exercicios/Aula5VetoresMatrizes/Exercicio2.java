/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.*/
package Aula5VetoresMatrizes;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] num = new int[6];
		int somaPares=0,contImpares=0;
		
		for(int i=0; i<=5; i++) {
			System.out.println("Digite um n�mero: ");
			num[i] = read.nextInt();
		}
		
		System.out.println("\nN�meros pares digitados: ");
		for(int i=0;i<=5;i++) {
			if(num[i]%2==0) {
				System.out.println(num[i]);
				somaPares = somaPares + num[i];
			}
		}
		
		System.out.println("\nSoma dos pares: "+somaPares);
		
		System.out.println("\nN�meros �mpares digitados: ");
		for(int i=0;i<=5;i++) {
			if(num[i]%2!=0) {
				System.out.println(num[i]);
				contImpares++;
			}
		}
		
		System.out.println("\nQuantidade de n�meros �mpares digitados: "+contImpares);
	}
}
