import java.util.Locale;
import java.util.Scanner;

public class Pontua��o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int numeroCompras;
		double ticket;

		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		
		System.out.println("");
		System.out.print("Quantas compras o cliente fez no �ltimo ano? ");
		numeroCompras = sc.nextInt();
		System.out.print("Qual o ticket m�dio? ");
		ticket = sc.nextDouble();
	}

}
