package classes;

public class Produtoeletronico {
	
    String cor;
    String tipo;
    String tamanho;
    boolean ligado;
    String espa�o;
    int valor;
    String cart�o;
   
     public void sim() {
   	 ligado=true;
    }
    public void n�o() {
   	 ligado=false;
    }
    public void testar() {
   	 if(ligado==true)
   		 System.out.println("Por favor testar seu produto !!");
   	 else
   		 System.out.println("Pe�a ao vendedor que ligue para vo�e !!!");
    }
    public void status() {
   	 System.out.println("O produto � da cor "+this.cor);
   	 System.out.println("O tamanho do produto  � "+this.tamanho);
   	 System.out.println("O produto � um  "+this.tipo);
   	 System.out.println("O valor do produto � "+this.valor+"reais");
   	 System.out.println("O tipo de cart�o passado � "+this.cart�o);
    }
	
		
		
	
}




