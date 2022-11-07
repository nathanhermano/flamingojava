package lista10;



import java.util.Scanner;



public class Exercicio08 {

public static void main(String args[]) {

Scanner sc=new

Scanner(System.in);

System.out.println("Digite o número da base");

double B=sc.nextDouble();

System.out.println("Digite o número do expoente");

double E=sc.nextDouble();

double potencia=Math.pow(B, E);

System.out.println("A potência resulta em: "+potencia);

sc.close();



}



}