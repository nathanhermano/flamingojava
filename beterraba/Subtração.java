package beterraba;

import java.util.Scanner;

public class Subtração {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite dois números para serem subtraídos");
		int numero1=sc.nextInt();
		int numero2=sc.nextInt();
		int subtracao=numero1-numero2;
		System.out.println("A subtração dos números é igual a: " +subtracao);
	}
}
