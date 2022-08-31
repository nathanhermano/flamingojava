package otopacote;
import java.util.Scanner;
public class FahToCel {

	public static void main(String[] args) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite um valor em Fahrenheit para ser convertido para Celsius");
		double tempfah=sc.nextDouble();
		double FahToCel=(tempfah-32)*5/9;
		System.out.println("A temperatura em graus Celsius é de:" +FahToCel);
	}

}
