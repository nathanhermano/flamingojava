package beterraba;
import java.util.Scanner;
public class DifQuadrado {
	public static void main(String args[]){
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o valor da primeira variável");
		double varia=sc.nextDouble();
		System.out.println("Digite o valor da segunda variável");
		double variab=sc.nextDouble();
		double dif=varia-variab;
		double quaddif=dif*dif;
		System.out.println("O resultado do quadrado da diferença entre os valores é: "+quaddif);
	}

}
