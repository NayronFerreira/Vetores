import java.util.Scanner;

public class AplicationVetores3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int cont;
		System.out.print("Informe a quantidades de produtos: ");
		cont=leia.nextInt();
		Vetores3 vect []= new Vetores3[cont];
		double soma=0;
		for(int c=0;c<cont;c++) {
			leia.nextLine();
			System.out.print("Informe o nome do produto: ");
			String nome=leia.nextLine();
			System.out.print("Informe o preço do produto: ");
			double preco=leia.nextDouble();
			vect[c]= new Vetores3(nome,preco);
			System.out.print(vect[0].getPreco());
			soma+=vect[c].getPreco();
		}
		
		double media = soma/cont;
		System.out.print("A media dos preços dos produtos é de: "+media);

	}

}
