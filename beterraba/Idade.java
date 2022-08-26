package beterraba;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Idade {
	public static void main(String args[])
	{	
		DateTimeFormatter diahj = DateTimeFormatter.ofPattern("dd");
        System.out.println(diahj.format(LocalDateTime.now()));
        
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Digite o ano de seu nascimento");
		int ano=sc.nextInt();
		System.out.println("Digite o mês de seu nascimento");
		int mes=sc.nextInt();
		System.out.println("Digite o dia de seu nascimento");
		int dia=sc.nextInt();
		int contanos=2022-ano;
		int contmeses=8-mes;
		int contdias=25-dia;
		int conttotal=contanos+contmeses+contdias;
		int totanos=contanos*365;
		int totmeses=contmeses*30;
		int total=totanos+totmeses+contdias;
				System.out.println("Você possui um total de dias de vida de:" +total);
	}

}