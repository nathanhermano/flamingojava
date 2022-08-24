package beterraba;

import java.util.Scanner;

public class Divisão {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite dois números para serem Divididos");
		double numero1=sc.nextFloat();
		double numero2=sc.nextFloat();
		double divisao=numero1/numero2;
		System.out.println("A divisão dos números é igual a: " +divisao);
}
}
