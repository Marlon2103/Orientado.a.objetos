package colectionestoqueloja;

import java.util.ArrayList;
import java.util.Collection;

public class estoqueloja {
   public static void main(String args[]) {
	   
	   Collection<String> papelaria = new ArrayList();
	   
	   papelaria.add("Mochila");
	   papelaria.add("Lapiseira");
	   papelaria.add("caneta");
	   papelaria.add("Borracha");
	   papelaria.add("Tinta guache");
	   papelaria.add("Cola");
	   papelaria.add("Lápis");
	   papelaria.add("Papel");
	   
	   System.out.println("Estoque"+papelaria+":\n");
	   papelaria.removeAll(papelaria);
	  
	   
	   if(papelaria.isEmpty())
	   {
		   System.out.println("Estoque está vazio. Favor verificar as compras.\n");
	   }
	   else {
		   System.out.println("Estoque"+papelaria+":");
	   }
	   papelaria.add("Caderno");
	   papelaria.add("Lapiseira");
	   papelaria.add("Bolsa");
	   papelaria.add("Tinta Guache");
	   papelaria.add("Lapis de cor");
	   papelaria.add("Estilete");
	   papelaria.add("Eslatico");
	   papelaria.add("Papel Couchê");
	   if(papelaria.isEmpty())
	   {
		   System.out.println("Estoque vazio. Favor verificar compras. ");
	   }
	   else {
		   System.out.println("Estoque Atualizado");
	   }
	   
	   
	   for(String estoque : papelaria) {
		   System.out.println("\nLista de estoque : "+estoque);
	   }
	 
	   
	   
	   
	   
	   
	   		
   }
}
