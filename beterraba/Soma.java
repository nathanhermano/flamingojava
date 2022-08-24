package beterraba;

import java.util.Scanner;

public class Soma {

public static void main(String[] args)
{
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite dois números para serem somados:");
	int numero1=sc.nextInt();
	int numero2=sc.nextInt();
	int soma=numero1+numero2;
	System.out.println("A soma dos números é:" +soma);
}

}