package lista7;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String args[]) {
		Scanner sc=new
				Scanner(System.in);
		System.out.println("Insira o número empregado");
		int nuempregado=sc.nextInt();
		System.out.println("Digite o ano do nascimento");
		int nascimento=sc.nextInt();
		System.out.println("Digite o ano que o empregado ingressou na empresa");
		int ingresso=sc.nextInt();
		int idade=2022-nascimento;
		int tempocasa=2022-ingresso;
		System.out.println("Idade: "+idade);
		System.out.println("Tempo de casa: "+tempocasa);
		if(idade>=65) {System.out.println("Pela idade o empregado está apto para aposentadoria");}
		else if(tempocasa>=30) {System.out.println("Por tempo de casa empregado está apto para aposentadoria");}
		if(idade>=60 && tempocasa>=25) {System.out.println("Pela idade com tempo minimo de casa o empregado está apto para aposentadoria");}
		sc.close();		
	}

}
