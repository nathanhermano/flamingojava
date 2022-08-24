package beterraba;

import java.util.Scanner;

public class Multiplicação 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite dois números que serão multiplicados");
	int numero1=sc.nextInt();
	int numero2=sc.nextInt();
	int multiplicacao=numero1*numero2;
	System.out.println("A multiplicação dos números resulta em: " +multiplicacao);
	
	}
}
