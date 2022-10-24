package lista7;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String args[]) {
		Scanner sc=new
				Scanner(System.in);
		System.out.println("Digite o nome do primeiro time");
		var pritime=sc.next();
		System.out.println("Digite quantos gols, marcou o primeiro time");
		int golspri=sc.nextInt();
		System.out.println("Digite o nome do segundo time");
		var segtime=sc.next();
		System.out.println("Digite quantos gols, marcou o segundo time");
		int golsseg=sc.nextInt();
		if(golspri>golsseg) {System.out.println("O vencedor foi o: " +pritime);}
		else if(golsseg>golspri) {System.out.println("O vencedor foi o: " +segtime);}
		if (golspri==golsseg) {System.out.println("A partida terminou Empatada!");}
		sc.close();
		
	}

}
