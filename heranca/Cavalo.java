package heranca;

public class Cavalo extends Animal{

	private String correr;
	
	public Cavalo(String Nome, int Idade, String Som) {
		super(Nome, Idade, Som);
		
	}
	public void mostrar() {
		System.out.println("Nome: "+nome);
		System.out.println("idade: "+idade);
		System.out.println("som "+som);
		System.out.println(correr);
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	

}
