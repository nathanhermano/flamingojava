package beterraba;
import java.util.Scanner;

public class Madeira {
	
/*1) Solicite um valor do teclado e exiba o seu
 * sucessor.*/
	
	public static void main(String[] args)
	{
		Scanner sc = new
				Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int numero=sc.nextInt();
		int sucessor=numero+1;
		System.out.println("O sucessor do n�mero digitado �: "+sucessor);
		sc.close();
	}
 
}
