package lista8;

public class Exercicio07 {
	public static void main(String args[]) {
		int num1=1;
		int num2=0;
		
		for (int contador=0;contador<16;contador++) {num1= num1+num2; num2=num1-num2;
		System.out.println(num1);
		}
	}

}
