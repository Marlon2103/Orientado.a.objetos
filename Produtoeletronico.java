package classes;

public class Produtoeletronico {
	
    String cor;
    String tipo;
    String tamanho;
    boolean ligado;
    String espaço;
    int valor;
    String cartão;
   
     public void sim() {
   	 ligado=true;
    }
    public void não() {
   	 ligado=false;
    }
    public void testar() {
   	 if(ligado==true)
   		 System.out.println("Por favor testar seu produto !!");
   	 else
   		 System.out.println("Peça ao vendedor que ligue para voçe !!!");
    }
    public void status() {
   	 System.out.println("O produto é da cor "+this.cor);
   	 System.out.println("O tamanho do produto  é "+this.tamanho);
   	 System.out.println("O produto é um  "+this.tipo);
   	 System.out.println("O valor do produto é "+this.valor+"reais");
   	 System.out.println("O tipo de cartão passado é "+this.cartão);
    }
	
		
		
	
}




