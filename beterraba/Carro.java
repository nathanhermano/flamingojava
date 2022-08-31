package otopacote;
import java.util.Scanner;
public class Carro {

	public static void main(String[] args) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o custo de fábrica do carro");
		double custocarro=sc.nextDouble();
		double pdistribuidor=28*custocarro/100;
		double impostos=45*custocarro/100;
		double carroconsumidor=custocarro+pdistribuidor+impostos;
		System.out.println("O custo do carro para o consumidor é de:" +carroconsumidor);

	}

}