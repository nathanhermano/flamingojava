package beterraba;
import java.util.Scanner;
public class Distributiva {
	public static void main(String args[]){
	Scanner sc = new
			Scanner(System.in);
	System.out.println("Digite o primeiro o número");
	int numero1=sc.nextInt();
	System.out.println("Digite o segundo número");
	int numero2=sc.nextInt();
	System.out.println("Digite o terceiro número");
	int numero3=sc.nextInt();
	System.out.println("Digite o quarto número");
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
	System.out.println("Distributivas de soma 1º com 2º: " +somaa1+ "\nDistributiva de soma 1º com 3º: " +somaa2+ "\nDistributiva de soma 1º com 4º: " +somaa3+
			"\nDistributiva de soma 2º com 3º: " +somab1+ "\nDistributiva de soma 2º com 4º: " +somab2+ "\nDistributiva de soma 3º com 4º: " +somac1);
	System.out.println("Distributivas de multiplicação 1º com 2º: " +multa1+ "\nDistributiva de multiplicação 1º com 3º: " +multa2+ "\nDistributiva de multiplicação 1º com 4º: " +multa3+
			"\nDistributiva de multiplicação 2º com 3º: " +multb1+ "\nDistributiva de multiplicação 2º com 4º: " +multb2+ "\nDistributiva de multiplicação 3º com 4º: " +multc1);
	}
}
