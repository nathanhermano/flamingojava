package otopacote;
import java.util.Scanner;
public class Temperatura {

	public static void main(String[] args) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite uma temperatura em Celsius para ser convertida");
		float tcelsius=sc.nextFloat();
		float conversao=(9*tcelsius+160)/5;
		System.out.println("A temperatura em Graus Fahrenheit é:" +conversao);
	}

}
