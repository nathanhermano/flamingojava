package lista6;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Insira o valor da primeira nota");
		int prinota=sc.nextInt();
		System.out.println("Insira o valor da segunda nota");
		int segnota=sc.nextInt();
		System.out.println("Insira o valor da terceira nota");
		int ternota=sc.nextInt();
		System.out.println("Insira o valor da quarta nota");
		int quanota=sc.nextInt();
		int media=(prinota+segnota+ternota+quanota)/4;
		if (media>=7) {System.out.println("Aluno aprovado! Nota: "+media);}
		else {System.out.println("Digite o valor da nota do exame:");}
		int exame=sc.nextInt();
		int mediaexame=(media+exame)/2;
		if (mediaexame>=5) {System.out.println("Aluno aprovado com nota do exame! Nota: " +mediaexame);}
		else {System.out.println("Aluno reprovado! Nota: " +mediaexame);}
		
		}

	}
