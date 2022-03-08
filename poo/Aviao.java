package poo;

public class Aviao {

	private String nomefabricante;
	private String modelo;
	private int numeromodelo;
	private boolean voar ;
	
	public Aviao(String NomeFabricante, String Modelo, int NumeroModelo) {
		 
		 nomefabricante = NomeFabricante;
		 modelo = Modelo;
		 numeromodelo = NumeroModelo;
		 
	}
	public void liga() {
		System.out.println("Nome do Fabricante: "+nomefabricante);
		 System.out.println("Modelo: "+modelo);
		 System.out.println("Numero do modelo: "+numeromodelo);
		if(voar == true)
			System.out.println("Pronto Para decolar.....:");
		else {
			System.out.println("o Avião esta próximo do Aeroporto");
		}
				
	}
	public void decolar() {
		voar = true;
	}
	public void pousar() {
		voar = false;
	}
	 public void aeroporto() {
		 
		 if(voar==true)
		        System.out.println("o Avião saiu para fazer a Viagem");
			else{
				System.out.println("o avião chegou ao seu Destino");
			}
		}
}
