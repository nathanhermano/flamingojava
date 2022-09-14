package lista05;
import java.util.Scanner;
public class Exercicio02 {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite um número");
		float numero=sc.nextFloat();
		if (numero >=0) {System.out.println("Este número é positivo");	
		}else {System.out.println("Este número é negativo");
		}
	}

}
