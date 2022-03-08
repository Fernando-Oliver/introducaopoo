package poo;

public class Patinete {

	
		
		String cor = "Preto";
		int bateria = 60;
		int velocidade = 55;
        boolean estado;
		
       public void inteiro() {
    	   estado = true;
       }
       public void danificado() {
    	   estado = false;
       }
       
       public void aviso() {
    	   if(estado == true) {
    		   System.out.println("Patinete em condições de Passeio..");
    	   }
    	   else {
    		   System.out.println("Patinete Quebrado");
    	   }
       }
       public void mostra() {
			System.out.println("A Cor é: "+cor);
			System.out.println("Esta com a carga em: "+bateria+"%");
			System.out.println("Velocidade Atingida "+velocidade+"KM/H");
		}
        
	}


