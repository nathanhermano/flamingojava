	package lista6;
	
	import java.util.Scanner;
	
	public class Exercicio12 {
		public static void main(String args[]) {
			Scanner sc=new
					Scanner(System.in);
			System.out.println("Digite o nome");
			var nome=sc.next();
			System.out.println("Digite o sexo");
			var sexo=sc.next();
			if(sexo.equalsIgnoreCase("Masculino")) {System.out.println("IImo Sr." +nome);}
			else if (sexo.equalsIgnoreCase("Feminino")) {System.out.println("IIma Sra." +nome);}
		}
	
	}