package beterraba;
import java.util.Scanner;
public class ConversaoDolar {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o valor da cota��o do real");
		double cotacao=sc.nextDouble();
		System.out.println("Digite a quantia em real que voc� possui");
		double quantia=sc.nextDouble();
		double conversao=quantia*cotacao;
		System.out.println("O valor total da quantia de reais convertidos em dolar �: "+conversao);
	}

}
