/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		inteiro totalSegundos, duracaoHoras, duracaoMinutos, duracaoSegundos

		escreva("Digite o tempo de dura��o em segundos: \n")
		leia(totalSegundos)

		duracaoHoras = totalSegundos / 3600
		duracaoMinutos = ((totalSegundos % 3600)/60)
		duracaoSegundos = ((totalSegundos % 3600)%60)
		
		escreva("Dura��o �: ",duracaoHoras,":",duracaoMinutos,":",duracaoSegundos)
*/

package PacoteJava;

import java.util.Scanner;

public class ex3 {
	public static void main(String args[])
	{
		int totalSeg, duracaoHr, duracaoMin, duracaoSeg;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o tempo de dura��o em segundos: ");
		totalSeg = ler.nextInt();
		
		duracaoHr = totalSeg/3600;
		duracaoMin = (totalSeg%3600)/60;
		duracaoSeg = (totalSeg%3600)%60;
		
		System.out.println("Dura��o �: "+ duracaoHr +":" + duracaoMin + ":"+duracaoSeg);
	}
}
