package lista05;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		float pvalor=sc.nextFloat();
		System.out.println("Digite o segundo valor");
		float svalor=sc.nextFloat();
		if (pvalor>svalor) {System.out.println("Os valores em ordem crescente s�o: "+pvalor+ "\n"  +svalor);
		}else if (pvalor<svalor) {System.out.println("Os valores em ordem crescente s�o: " +svalor+ "\n" +pvalor);
		}else {System.out.println("Os valores n�o podem ser iguais");
		}
	}

}
