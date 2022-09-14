package lista05;
import java.util.Scanner;
public class Exercicio03 {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite quantas maçãs foram compradas");
		int maca=sc.nextInt();
		double preco;
		if (maca >=12) {preco=1.00;
		}else {preco=1.30;
		}
		double total=preco*maca;
		System.out.println("O valor total é de: "+total);
			}
}
