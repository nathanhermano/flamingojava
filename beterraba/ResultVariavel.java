package beterraba;
import java.util.Scanner;
public class ResultVariavel {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o valor da primeira variável");
		int vara=sc.nextInt();
		System.out.println("Digite o valor da segunda variável");
		int varb=sc.nextInt();
		System.out.println("Digite o valor da terceira variável");
		int varc=sc.nextInt();
		System.out.println("Digite o valor da quarta variável");
		int vard=sc.nextInt();
		int P=vara/varc;
		int S=varb+vard;
		System.out.println("Produto do primeiro com o terceiro: " +P);
		System.out.println("Soma do segundo com o quarto: "+S);
	}

}
