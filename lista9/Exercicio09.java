package lista9;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String args[]) {
		Scanner sc=new
				Scanner(System.in);
		int maior=0;
		int menor=10000000;
		int num1=0;
		while(num1>=0) {System.out.println("Insira o valor");
		num1=sc.nextInt();
		if(num1>maior) maior=num1;
		if(num1<menor && num1>=0) menor=num1;
		}
		System.out.println(menor);
		System.out.println(maior);
		sc.close();
		}



}

