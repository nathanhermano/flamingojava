package otopacote;
import java.util.Scanner;
public class Eleicao {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o número de eleitores do município");
		double municipes=sc.nextDouble();
		System.out.println("Digite o número de votos brancos");
		double vbrancos=sc.nextDouble();
		System.out.println("Digite o número de votos nulos");
		double vnulos=sc.nextDouble();
		System.out.println("Digite o número de votos válidos");
		double vvalidos=sc.nextDouble();
		double pbrancos=vbrancos/municipes*100;
		System.out.println("O percentual de votos brancos é de:" +pbrancos);
		double pnulos=vnulos/municipes*100;
		System.out.println("O percentual de votos nulos é de:" +pnulos);
		double pvalidos=vvalidos/municipes*100;
		System.out.println("O percentual de votos válidos é de:" +pvalidos);
			
	}

}