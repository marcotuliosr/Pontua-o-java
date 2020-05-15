import java.util.Locale;
import java.util.Scanner;

public class Pontuação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int numeroCompras;  
		int inadimplencia;
		int scCompra = 0;
		double ticket;
		double volumeCompras;
		char tipoPagamento;
		

		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		
		System.out.println("");
		System.out.print("Quantas compras o cliente fez no último ano? ");
		numeroCompras = sc.nextInt();
		System.out.print("Qual o ticket médio? ");
		ticket = sc.nextDouble();
		
		System.out.println("");
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		inadimplencia = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		tipoPagamento = sc.next().charAt(0);
		
		volumeCompras = numeroCompras * ticket;

		if (numeroCompras <= 0) {
			scCompra = 0;
		} else if (volumeCompras <= 3000 && numeroCompras < 2) {
			scCompra = 20;
		} else if (volumeCompras <= 3000 && numeroCompras >= 2) {
			scCompra = 40;
		} else if (volumeCompras > 3000) {
			scCompra = 60;
		}
		

		System.out.println("");
		System.out.printf("Score de volume de compras = %d pontos%n", scCompra);
		
	}

}
