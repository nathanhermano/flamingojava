package beterraba;
import java.util.Scanner;
public class DifQuadrado {
	public static void main(String args[]){
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o valor da primeira vari�vel");
		double varia=sc.nextDouble();
		System.out.println("Digite o valor da segunda vari�vel");
		double variab=sc.nextDouble();
		double dif=varia-variab;
		double quaddif=dif*dif;
		System.out.println("O resultado do quadrado da diferen�a entre os valores �: "+quaddif);
	}

}
