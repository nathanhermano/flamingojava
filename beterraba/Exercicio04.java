package lista05;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite a nota da 1ª avaliação");
		float primeira=sc.nextFloat();
		System.out.println("Digite a nota da 2º avaliação");
		float segunda=sc.nextFloat();
		float media=(primeira+segunda)/2;
		if (media >=6) {System.out.println("Aprovado");
		}else {System.out.println("reprovado");
		}
		System.out.println("Média do aluno: "+media);
	}

}
