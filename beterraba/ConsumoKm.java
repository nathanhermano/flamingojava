package otopacote;
import java.util.Scanner;
public class ConsumoKm {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite quanto tempo durou a viagem");
		double tempo=sc.nextDouble();
		System.out.println("Informe a velocidade m�dia");
		double velocidade=sc.nextDouble();
		double distancia=tempo*velocidade;
		double litrosusados=distancia/12;
		System.out.println("Velocidade m�dia:" +velocidade);
		System.out.println("Tempo gasto na viagem:" +tempo);
		System.out.println("Dist�ncia percorrida:" +distancia);
		System.out.println("Litros Usados:" +litrosusados);
	}

}
