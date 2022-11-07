package lista10;



public class Exercicio07 {

public static void main(String args[]) {



String total="";

int i;

int j;

int n3=3;



for(i=1;i<=15;i++)

{

if(i==1)

{

total+="3 elevado a "+i+" é "+n3+"\n";

i++;

}

n3*=3;

total+="3 elevado a "+i+" é "+n3+"\n";

System.out.println(total);



}

}

}