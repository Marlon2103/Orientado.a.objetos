package classes;

import java.util.Scanner;

public class extensaoproduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Produtoeletronico p1 = new  Produtoeletronico ();
		 
		 {
			 Scanner entrada = new Scanner(System.in);
			 System.out.println(" Digite a cor do produto :");
			 p1.cor=entrada.nextLine();
			 System.out.println("Digite o tipo de produto da compra ");
			 p1.tipo=entrada.nextLine();
			 System.out.println("Digite o tamanho do produto :");
			 p1.tamanho=entrada.nextLine();
			
			 System.out.println("Digite o valor há ser pago no produto :");
			 p1.valor=entrada.nextInt();
			 System.out.println("Digite o tipo de cartao Debito ou Credito");
			 p1.cartão=entrada.nextLine();
			 System.out.println("ultima pergunta.");
			 p1.espaço=entrada.nextLine();
			 p1.sim();
			 p1.testar();
			 p1.status();
		 }
	}

}
