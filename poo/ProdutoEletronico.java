package poo;

public class ProdutoEletronico {

	public String nome = "Galaxy";
	public String tipo = "S10";
	public int valor = 3500;
	public boolean compra = true;
	
	public void levou() {
		if (compra = true) {
			
		}
	}
		public void deixou() {
			if(compra = false) {
				
			}
		}
		
		public void comprou() {
			if(compra==true) {
				System.out.println("levou o produto:");
				System.out.println("Nome do Aparelho: "+this.nome);
				System.out.println("Tipo: "+this.tipo);
				System.out.println("Valors "+ this.valor);
			}
			else {
				System.out.println("Não levou nada");
			}
		}
		
	
}
