package otopacote;
import java.util.Scanner;
public class Salario {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Insira o sal�rio atual");
		double salario=sc.nextDouble();
		System.out.println("Insira o valor percentual para o reajuste");
		double percentual=sc.nextDouble();
		double psalario=percentual*salario/100;
		double atualsalario=psalario+salario;
		System.out.println("O sal�rio com reajuste ser�:" +atualsalario);
	}

}
