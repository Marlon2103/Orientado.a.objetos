package classes;

public class aviao {

	
		
         String cor;
         String companhia;
         double tamanho;
         Boolean ligado;
         String espaço;
        
          public void ligar() {
        	 ligado=true;
         }
         public void desligar() {
        	 ligado=false;
         }
         public void decolar() {
        	 if(ligado==true)
        		 System.out.println("Pode começar a decolagem");
        	 else
        		 System.out.println("Verifique status do aviao");
         }
         public void status() {
        	 System.out.println("A aviao é da cor "+this.cor);
        	 System.out.println("O tamanho do avião é "+this.tamanho);
        	 System.out.println("A empresa do aviao é "+this.companhia);
         }
		
			
			}
		
	


