package classes;

public class aviao {

	
		
         String cor;
         String companhia;
         double tamanho;
         Boolean ligado;
         String espa�o;
        
          public void ligar() {
        	 ligado=true;
         }
         public void desligar() {
        	 ligado=false;
         }
         public void decolar() {
        	 if(ligado==true)
        		 System.out.println("Pode come�ar a decolagem");
        	 else
        		 System.out.println("Verifique status do aviao");
         }
         public void status() {
        	 System.out.println("A aviao � da cor "+this.cor);
        	 System.out.println("O tamanho do avi�o � "+this.tamanho);
        	 System.out.println("A empresa do aviao � "+this.companhia);
         }
		
			
			}
		
	


