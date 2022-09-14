package lista05;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		float pvalor=sc.nextFloat();
		System.out.println("Digite o segundo valor");
		float svalor=sc.nextFloat();
		if (pvalor>svalor) {System.out.println("O maior valor digitado é o: "+pvalor);
		}else if (pvalor<svalor) {System.out.println("O maior valor digitado é o: "+svalor);
		}else {System.out.println("Os valores não podem ser iguais");}
	}

}
