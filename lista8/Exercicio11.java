package lista8;

import java.util.Scanner;

public class Exercicio11 {
	public static void main (String args[]) {
		Scanner sc=new
				Scanner(System.in);
		System.out.println("Insira o nome do cômodo");
		String comodo1=sc.next();
		System.out.println("Insira a Largura");
		double largura1=sc.nextDouble();
		System.out.println("Insira o comprimento");
		double comprimento1=sc.nextDouble();
		double area1=comprimento1*largura1;
		System.out.println("A área do "+comodo1+ " é de: " +area1);
		System.out.println("Deseja continuar calculando?");
		System.out.println("1-Sim");
		System.out.println("2-Não");
		int pergunta1=sc.nextInt();
		if(pergunta1==2) {System.out.println("Área total: "+area1);}
		else if(pergunta1==1) {System.out.println("Insira o nome do próximo cômodo:");}
		String comodo2=sc.next();
		System.out.println("Insira a largura");
		double largura2=sc.nextDouble();
		System.out.println("Insira o comprimento");
		double comprimento2=sc.nextDouble();
		double area2=comprimento2*largura2;
		System.out.println("A área do "+comodo2+" é de:" +area2);
		double somatoria=area2+area1;
		System.out.println("Deseja continuar calculando?");
		System.out.println("1-Sim");
		System.out.println("2-Não");
		int pergunta2=sc.nextInt();
		if (pergunta2==2) {System.out.println("A área total da residência é de: "+somatoria);}
		else if(pergunta2==1) {System.out.println("Insira o nome do próximo cômodo:");}
		String comodo3=sc.next();
		System.out.println("Insira a largura");
		double largura3=sc.nextDouble();
		System.out.println("Insira o comprimento");
		double comprimento3=sc.nextDouble();
		double area3=comprimento3*largura3;
		System.out.println("A área do "+comodo3+ " é de: "+area3);
		double somatoria2=area1+area2+area3;
		System.out.println("A área total da residência é de: "+somatoria2);
		sc.close();

		
		
	}

}
