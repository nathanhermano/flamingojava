package beterraba;

import java.util.Scanner;

public class Multiplica��o 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite dois n�meros que ser�o multiplicados");
	int numero1=sc.nextInt();
	int numero2=sc.nextInt();
	int multiplicacao=numero1*numero2;
	System.out.println("A multiplica��o dos n�meros resulta em: " +multiplicacao);
	
	}
}
