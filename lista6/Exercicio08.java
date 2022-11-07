package lista6;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Escreva o primeiro número inteiro");
		int primeiro=sc.nextInt();
		System.out.println("Escreva o segundo número inteiro");
		int segundo=sc.nextInt();
		System.out.println("Escreva o terceiro número inteiro");
		int terceiro=sc.nextInt();
		System.out.println("Escreva o quarto número inteiro");
		int quarto=sc.nextInt();
		System.out.println("Escreva o quinto número inteiro");
		int quinto=sc.nextInt();
		if (primeiro>segundo && primeiro>terceiro && primeiro>quarto && primeiro>quinto) {System.out.println(+primeiro);}
		else if (primeiro<segundo && primeiro<terceiro && primeiro<quarto && primeiro<quinto) {System.out.println(+primeiro);}
		if (segundo>primeiro && segundo>terceiro && segundo>quarto && segundo>quinto) {System.out.println(+segundo);}
		else if (segundo<primeiro && segundo<terceiro && segundo<quarto && segundo<quinto) {System.out.println(+segundo);}
		if (terceiro>primeiro && terceiro>segundo && terceiro>quarto && terceiro>quinto) {System.out.println(+terceiro);}
		else if (terceiro<primeiro && terceiro<segundo && terceiro<quarto && terceiro<quinto) {System.out.println(+terceiro);}
		if (quarto>primeiro && quarto>segundo && quarto>terceiro && quarto>quinto) {System.out.println(+quarto);}
		else if (quarto<primeiro && quarto<segundo && quarto<terceiro && quarto<quinto) {System.out.println(+quarto);}
		if (quinto>primeiro && quinto>segundo && quinto>terceiro && quinto>quarto) {System.out.println(+quinto);}
		else if (quinto<primeiro && quinto<segundo && quinto<terceiro && quinto<quarto) {System.out.println(+quinto);}
		
	}

}
