package classes;

import java.util.Scanner;

public class aviaoextensao {
   
	

	public static void main(String[]args) {
		aviao a1 = new aviao ();
		
		{
		Scanner entrada =new Scanner(System.in);
		System.out.println("Digite a cor do avião");
		a1.cor=entrada.nextLine();
	   System.out.println("Digite o tamanhao do avião desejado ");
		a1.tamanho=entrada.nextDouble();
	    System.out.println("Digite a companhia desejada ");
		a1.companhia=entrada.nextLine();
		System.out.println(".");
		a1.espaço=entrada.nextLine();
		a1.status();
		a1.ligar();
		a1.decolar();
	}
}

}