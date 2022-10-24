package lista7;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String args[]) {
	Scanner sc=new
			Scanner(System.in);
	System.out.println("Digite o primeiro valor");
	int privalor=sc.nextInt();
	System.out.println("Digite o segundo valor");
	int segvalor=sc.nextInt();
	System.out.println("Digite o terceiro valor");
	int tervalor=sc.nextInt();
	if(privalor>segvalor && privalor>tervalor) {System.out.println("O maior valor é o: " +privalor);}
	else if(segvalor>privalor && segvalor>tervalor) {System.out.println("O maior valor é o: " +segvalor);}
	if(tervalor>privalor && tervalor>segvalor) {System.out.println("O maior valor é o: " +tervalor);}
	sc.close();
	}

}
