package beterraba;

import java.util.Scanner;

public class Subtra��o {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite dois n�meros para serem subtra�dos");
		int numero1=sc.nextInt();
		int numero2=sc.nextInt();
		int subtracao=numero1-numero2;
		System.out.println("A subtra��o dos n�meros � igual a: " +subtracao);
	}
}
