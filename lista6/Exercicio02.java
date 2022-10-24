package lista6;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite um número");
		float prinumero=sc.nextFloat();
		float negativo=prinumero*-1;
		if(prinumero<0) {System.out.println(+negativo);}
	}

}