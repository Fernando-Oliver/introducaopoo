package heranca;

public class Cachorro extends Animal {

	private String correr;
	
	public Cachorro(String Nome, int Idade, String Som) {
		super(Nome, Idade, Som);
		
	}
	public void mostrar() {
		System.out.println("Nome: "+nome);
		System.out.println("idade: "+idade);
		System.out.println("Latido "+som);
		System.out.println(correr);
	}
	

	public  String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	

	

}
