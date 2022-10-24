package lista6;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o primeiro número");
		float prinumero=sc.nextFloat();
		System.out.println("Digite o segundo número");
		float segnumero=sc.nextFloat();
		float primaior=prinumero-segnumero;
		float segmaior=segnumero-prinumero;
		if (prinumero>segnumero) {System.out.println(+primaior);}
		else if (segnumero>prinumero) {System.out.println(+segmaior);}
	}

}
