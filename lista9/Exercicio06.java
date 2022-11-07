package lista9;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String args[]) {
		Scanner sc=new
				Scanner(System.in);
		int contador=0;
		int soma=0;
		int num=0;
		while(num>=0) {System.out.println("Digite um número");
		num=sc.nextInt();
		if(num>0) {contador++; soma+=num;}
		}
		int media=soma/contador;
		System.out.println("Total de valores lidos: "+contador);
		System.out.println("Total da soma: "+soma);
		System.out.println("Total da média: "+media);
		sc.close();
	}

}
