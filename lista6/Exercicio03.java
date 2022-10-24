package lista6;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o valor da primeira nota");
		float prinota=sc.nextFloat();
		System.out.println("Digite o valor da segunda nota");
		float segnota=sc.nextFloat();
		System.out.println("Digite o valor da terceira nota");
		float ternota=sc.nextFloat();
		System.out.println("Digite o valor da quarta nota");
		float quanota=sc.nextFloat();
		float media=prinota=(segnota+ternota+quanota)/4;
		if(media>=5) {System.out.println("O aluno foi APROVADO com média:" +media);}
		else if(media<5) {System.out.println("O aluno foi REPROVADO com média:" +media);}
		
	}

}