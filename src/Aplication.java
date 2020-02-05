import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		System.out.print("Informe a quantidade de altura(s)");
		int contador=leia.nextInt();
	    int c=0;
		double soma=0;
	    double altura [] = new double [contador];
		for (c =0;c<=contador-1;c++){
		System.out.print("Informe a "+(c+1)+"° altura: ");
		altura [c]=leia.nextDouble();
		soma += altura[c];}
		double media=soma/contador;
		System.out.printf("A média de altura das pessoas é de: %.2f\n",media);
	
	
	}
	}
		