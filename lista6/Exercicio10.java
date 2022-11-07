package lista6;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String args[]) {
		Scanner sc=new
				Scanner(System.in);
		System.out.println("Digite um valor entre 1 e 9");
		int valor=sc.nextInt();
		if(valor>=1 && valor<=9) {System.out.println("Valor dentro da faixa permitida");}
		else {System.out.println("Valor fora da faixa permitida");}
		}
	}


