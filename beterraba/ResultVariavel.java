package beterraba;
import java.util.Scanner;
public class ResultVariavel {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o valor da primeira vari�vel");
		int vara=sc.nextInt();
		System.out.println("Digite o valor da segunda vari�vel");
		int varb=sc.nextInt();
		System.out.println("Digite o valor da terceira vari�vel");
		int varc=sc.nextInt();
		System.out.println("Digite o valor da quarta vari�vel");
		int vard=sc.nextInt();
		int P=vara/varc;
		int S=varb+vard;
		System.out.println("Produto do primeiro com o terceiro: " +P);
		System.out.println("Soma do segundo com o quarto: "+S);
	}

}
