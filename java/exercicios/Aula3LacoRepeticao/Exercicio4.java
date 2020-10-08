/*4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o n�mero de pessoas calmas;
 o n�mero de mulheres nervosas;
 o n�mero de homens agressivos;
 o n�mero de outros calmos;
 o n�mero de pessoas nervosas com mais de 40 anos;
o n�mero de pessoas calmas com menos de 18 anos.*/
package Aula3LacoRepeticao;

import java.util.Scanner;

public class Exercicio4
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		int idade, sexo, fp, contpc=0, contmn=0, contha=0, contoc=0, contpnm40=0, contpcm18=0, hab=1;
		
		while(hab<=150)
		{
			System.out.println("Entre com a idade: ");
			idade = read.nextInt();
			while(idade<1 || idade>150)
			{
				System.out.println("Erro: Entre com a idade novamente: ");
				idade = read.nextInt();
			}
			
			System.out.println("Entre com o sexo: ( 1- Feminino / 2- Masculino / 3-N�o-bin�ries )");
			sexo = read.nextInt();
			while(sexo<1 || sexo>3)
			{
				System.out.println("Erro: Entre com o sexo novamente: ( 1- Feminino / 2- Masculino / 3-N�o-bin�ries )");
				sexo = read.nextInt();
			}
				
			System.out.println("Entre com o fatos psicol�gico: ( 1- Calma(o) / 2- Nervosa(o) / 3-Agressiva(o) )");
			fp = read.nextInt();
			while(fp<1 || fp>3)
			{
				System.out.println("Erro: Entre com o fatos psicol�gico novamente: ( 1- Calma(o) / 2- Nervosa(o) / 3-Agressiva(o) )");
				fp = read.nextInt();
			}
			
			if(fp==1)
			{
				contpc++;
			}
			if(sexo==1 && fp==2)
			{
				contmn++;
			}
			if(sexo==2 && fp==3)
			{
				contha++;
			}
			if(sexo==3 && fp==1)
			{
				contoc++;
			}
			if(fp==2 && idade>=40)
			{
				contpnm40++;
			}
			if(fp==1 && idade<18)
			{
				contpcm18++;
			}
			hab++;
		}
		System.out.println("\nN�mero de pessoas calmas: "+contpc);
		System.out.println("\nN�mero de mulheres nervosas: "+contmn);
		System.out.println("\nN�mero de homens agressivos: "+contha);
		System.out.println("\nN�mero de outros calmo: "+contoc);
		System.out.println("\nN�mero de pessoas nervosas com mais de 40 anos: "+contpnm40);
		System.out.println("\nN�mero de pessoas calmas com menos de 18 anoss: "+contpcm18);
	}
}
