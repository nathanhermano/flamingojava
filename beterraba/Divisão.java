package beterraba;

import java.util.Scanner;

public class Divis�o {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite dois n�meros para serem Divididos");
		int numero1=sc.nextInt();
		int numero2=sc.nextInt();
		int divisao=numero1/numero2;
		System.out.println("A divis�o dos n�meros � igual a: " +divisao);
}
}
