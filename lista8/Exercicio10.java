package lista8;

public class Exercicio10 {
	public static void main(String args[]) {
		int soma = 0,cont = 50, par = 0;

        while (cont < 71)
        {
            if (cont % 2 == 0)
            {
                soma = cont + soma;
                par = cont;
                cont++;
            }
            else
            {
                cont++;
            }
        }
        int media=soma/11;
        System.out.println("A soma dos valores é: "+soma);
        System.out.println("A média dos valores é: "+media);
}
}

