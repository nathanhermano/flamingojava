package lista05;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o ano de seu nascimento");
		int nascimento=sc.nextInt();
		System.out.println("Digite o ano atual");
		int anoatual=sc.nextInt();
		int idade=anoatual-nascimento;
		if(idade >=18) {System.out.println("� obrigat�rio votar!");
		}else if(idade >=16) {System.out.println("O voto � opcional");
		}else {System.out.println("N�o � obrigatorio votar");
		}
	}

}
