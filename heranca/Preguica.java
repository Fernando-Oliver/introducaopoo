package heranca;

public class Preguica extends Animal {

	private String subiunaarvore;
	
	public Preguica(String Nome, int Idade, String Som) {
		super(Nome, Idade, Som);
		
	}
	public void mostrar() {
		System.out.println("Raça: "+nome);
		System.out.println("idade: "+idade);
		System.out.println("som "+som);
		System.out.println(subiunaarvore);
	}
	public String getSubiunaarvore() {
		return subiunaarvore;
	}

	public void setSubiunaarvore(String subiunaarvore) {
		this.subiunaarvore = subiunaarvore;
	}

}
