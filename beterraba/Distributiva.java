package beterraba;
import java.util.Scanner;
public class Distributiva {
	public static void main(String args[]){
	Scanner sc = new
			Scanner(System.in);
	System.out.println("Digite o primeiro o n�mero");
	int numero1=sc.nextInt();
	System.out.println("Digite o segundo n�mero");
	int numero2=sc.nextInt();
	System.out.println("Digite o terceiro n�mero");
	int numero3=sc.nextInt();
	System.out.println("Digite o quarto n�mero");
	int numero4=sc.nextInt();
	int somaa1=numero1+numero2;
	int somaa2=numero1+numero3;
	int somaa3=numero1+numero4;
	int somab1=numero2+numero3;
	int somab2=numero2+numero4;
	int somac1=numero3+numero4;
	int multa1=numero1*numero2;
	int multa2=numero1*numero3;
	int multa3=numero1*numero4;
	int multb1=numero2*numero3;
	int multb2=numero2*numero4;
	int multc1=numero3*numero4;
	System.out.println("Distributivas de soma 1� com 2�: " +somaa1+ "\nDistributiva de soma 1� com 3�: " +somaa2+ "\nDistributiva de soma 1� com 4�: " +somaa3+
			"\nDistributiva de soma 2� com 3�: " +somab1+ "\nDistributiva de soma 2� com 4�: " +somab2+ "\nDistributiva de soma 3� com 4�: " +somac1);
	System.out.println("Distributivas de multiplica��o 1� com 2�: " +multa1+ "\nDistributiva de multiplica��o 1� com 3�: " +multa2+ "\nDistributiva de multiplica��o 1� com 4�: " +multa3+
			"\nDistributiva de multiplica��o 2� com 3�: " +multb1+ "\nDistributiva de multiplica��o 2� com 4�: " +multb2+ "\nDistributiva de multiplica��o 3� com 4�: " +multc1);
	}
}
