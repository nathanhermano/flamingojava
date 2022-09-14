package lista05;
import java.util.Scanner;
public class Exercicio01 {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite um número");
		float numero=sc.nextFloat();
		if (numero >=10) {System.out.println("Maior ou igual a 10");	
		}else {System.out.println("Menor que 10");
		}
	}

}
