package beterraba;
import java.util.Scanner;
public class QuadradoSoma {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o valor da primeira vari�vel");
		int vara=sc.nextInt();
		System.out.println("Digite o valor da segunda vari�vel");
		int varb=sc.nextInt();
		System.out.println("Digite o valor da terceira vari�vel");
		int varc=sc.nextInt();
		int quada=vara*vara;
		int quadb=varb*varb;
		int quadc=varc*varc;
		int resultado=quada+quadb+quadc;
		System.out.println("O resultado final da soma dos quadrados �: "+resultado);
	}

}
