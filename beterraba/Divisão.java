package beterraba;

import java.util.Scanner;

public class Divis�o {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite dois n�meros para serem Divididos");
		double numero1=sc.nextFloat();
		double numero2=sc.nextFloat();
		double divisao=numero1/numero2;
		System.out.println("A divis�o dos n�meros � igual a: " +divisao);
}
}
