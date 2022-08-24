package beterraba;
import java.util.Scanner;

public class Antecessor {
	
	/*1) Solicite um valor do teclado e exiba o seu
	 * Antecessor.*/
	
	public static void main(String[] args)
	{
		Scanner sc = new
				Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero=sc.nextInt();
		int antecessor=numero-1;
		System.out.println("O antecessor do número digitado é: "+antecessor);
		sc.close();
		}

}
