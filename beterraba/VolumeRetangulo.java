package beterraba;
import java.util.Scanner;
public class VolumeRetangulo {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o valor do comprimento do Retangulo");
		double comprimento=sc.nextDouble();
		System.out.println("Digite o valor da largura do Retangulo");
		double largura=sc.nextDouble();
		System.out.println("Digite o valor da altura do Retangulo");
		double altura=sc.nextDouble();
		double volume=comprimento*largura*altura;
		System.out.println("O volume da caixa retangular é de: "+volume);
	}

}
