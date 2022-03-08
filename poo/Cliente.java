package poo;

public class Cliente {

           private String nome, email, endereco;
	       private long ntelefone,cep,cpf, ncasa;
	       private boolean dados = false;
	
	 public Cliente(String Nome, String Email, String Endereco, long Ntelefone, long Cep, long Cpf, long Ncasa) {
		 
		 this.dados = true;
		 this.nome = Nome;
		 this.cpf = Cpf;
		 this.cep = Cep;
		 this.ncasa = Ncasa;
		 this.endereco = Endereco;
		 this.email = Email;
		 this.ntelefone = Ntelefone;
		 
	}
	 public void inserido() {
		 this.dados = true;
	 }
	 public void ninserido() {
		 this.dados = false;
	 }
	public void inserir() {
		 
		 if(this.dados == true) {
			 System.out.println("Mostrar dados do cliente");
		 }else
			 System.out.println("Cadastro N�o Encontrado");
	 }
	 
	 public void cadastro() {
		 System.out.println("Nome: "+this.nome);
		 System.out.println("CPF: "+this.cpf);
		 System.out.println("Cep: "+this.cep);
		 System.out.println("Endere�o: "+this.endereco);
		 System.out.println("N�mero da Residencia: "+this.ncasa);
		 System.out.println("Email: "+this.email);
		 System.out.println("N�mero para Contato: "+this.ntelefone);
	 }
}
