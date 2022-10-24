package lista6;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String args[]) {
		Scanner sc=new
				Scanner(System.in);
		System.out.println("Digite um número inteiro menor ou igual a 3");
		int valor=sc.nextInt();
		if(valor<=3) {System.out.println(valor);}
		else {System.out.println("Valor superior a 3");
		sc.close();
		}
	}

}
