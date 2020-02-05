import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		System.out.print("Informe a quantidade de produtos: ");
		int cont= leia.nextInt();
		leia.nextLine();
		String [] produto = new String[cont];
		double [] preco = new double[cont];
		int c=0;
		double soma=0;
		for(c=0;c<cont;c++) {
			System.out.print("Informe o nome do "+(c+1)+"° produto");
			produto [c]= leia.nextLine();
			System.out.print("Informe seu valor: ");
			preco [c]=leia.nextDouble();
			leia.nextLine();
			soma+=preco[c];			
		}
		
		double media = soma/cont;
		System.out.printf("A média de preço é de = %.2f\n", media);
	}

}
