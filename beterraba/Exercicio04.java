package lista05;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite a nota da 1� avalia��o");
		float primeira=sc.nextFloat();
		System.out.println("Digite a nota da 2� avalia��o");
		float segunda=sc.nextFloat();
		float media=(primeira+segunda)/2;
		if (media >=6) {System.out.println("Aprovado");
		}else {System.out.println("reprovado");
		}
		System.out.println("M�dia do aluno: "+media);
	}

}
