package otopacote;
import java.util.Scanner;
public class VolumeOleo {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o valor do raio da lata de �leo");
		double raio=sc.nextDouble();
		System.out.println("Digite a altura da lata de �leo");
		double altura=sc.nextDouble();
		double diametro= raio*2;
		double volume=Math.PI*diametro*altura;
		System.out.println("O volume da lata de �leo � de:" +volume);
	}

}
