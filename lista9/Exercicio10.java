package lista9;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String args[]) {
		Scanner sc=new
				Scanner(System.in);
		int dividendo, divisor, num	=0;
		System.out.println("Digite o dividendo");
		dividendo=sc.nextInt();
		System.out.println("Divige o divisor");
		divisor=sc.nextInt();
		 while (dividendo > divisor)
         {
             num = num + 1;
             dividendo = dividendo - divisor;}
	System.out.println("O resultado é: "+num);}

}
