package otopacote;
import java.util.Scanner;
public class Eleicao {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o n�mero de eleitores do munic�pio");
		double municipes=sc.nextDouble();
		System.out.println("Digite o n�mero de votos brancos");
		double vbrancos=sc.nextDouble();
		System.out.println("Digite o n�mero de votos nulos");
		double vnulos=sc.nextDouble();
		System.out.println("Digite o n�mero de votos v�lidos");
		double vvalidos=sc.nextDouble();
		double pbrancos=vbrancos/municipes*100;
		System.out.println("O percentual de votos brancos � de:" +pbrancos);
		double pnulos=vnulos/municipes*100;
		System.out.println("O percentual de votos nulos � de:" +pnulos);
		double pvalidos=vvalidos/municipes*100;
		System.out.println("O percentual de votos v�lidos � de:" +pvalidos);
			
	}

}