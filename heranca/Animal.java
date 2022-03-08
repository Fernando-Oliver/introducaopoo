package heranca;

public class Animal {

	protected String nome;
	protected int idade;
	protected String som;
	
	public Animal(String Nome, int Idade, String Som) {
		this.nome = Nome;
		this.idade = Idade;
		this.som = Som;
	}

	public void manso() {
		
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
}
