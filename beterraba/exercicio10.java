package beterraba;
import java.util.Scanner;
import java.util.scanner;
public class exercicio10 {
	public static void main(String args[]) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite a quantidade de votos válidos para o candidato A");
		int canda=sc.nextInt();
		System.out.println("Digite a quantidade de votos válidos para o candidato B");
		int candb=sc.nextInt();
		System.out.println("Digite a quantidade de votos válidos para o candidato C");
		int candc=sc.nextInt();
		System.out.println("Digite a quantidade de votos nulos");
		int votnulos=sc.nextInt();
		System.out.println("Digite a quantidade de votos em branco");
		int votbranco=sc.nextInt();
		int totaleleit=canda+candb+candc+votnulos+votbranco;
		double pervalid=(canda+candb+candc)*100/totaleleit;
		double perca=canda*100/totaleleit;
		double percb=candb*100/totaleleit;
		double percc=candc*100/totaleleit;
		double percnulos=votnulos*100/totaleleit;
		double percbranco=votbranco*100/totaleleit;
		System.out.println("Votos válidos para o candidato A: "+canda);
		System.out.println("Votos válidos para o candidato B: "+candb);
		System.out.println("Votos válidos para o candidato C: "+candc);
		System.out.println("Votos em branco: "+votbranco);
		System.out.println("Votos nulos: "+votnulos);
		System.out.println("Total de eleitores: "+totaleleit);
		System.out.println("Percentual de votos válidos: "+pervalid);
		System.out.println("Percentual de votos válidos candidato A: "+perca);
		System.out.println("Percentual de votos válidos candidato B: "+percb);
		System.out.println("Percentual de votos válidos candidato C: "+percb);
		System.out.println("Percentual de votos nulos: "+percnulos);
		System.out.println("Percentual de votos em branco: "+percbranco);
		
		
	}

}
