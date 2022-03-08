package poo;

public class Funcionario {
	
	public String nome ;
	public String cargo;
	public double salario;
	public long rg;
	public long cpf;
	public boolean trabalhou;
	
	public Funcionario(String Nome, String Cargo, double Salario, long Rg, long Cpf) {
		 
		
		 this.nome = Nome;
		 this.rg = Rg;
		 this.cpf = Cpf;
		 this.cargo = Cargo;
		 this.salario= Salario;
		 
		 
	}
	public void trabalha() {
	     this.trabalhou =true;	
	}
	public void falta() {
		this.trabalhou = false;
	}
	public void receber() {
		if(trabalhou == true) {
			System.out.println("Dados do Funcionário:");
		}
		else {
			System.out.println("funcionário Faltou");
			salario = 0;
			System.out.println("Não receberá Salário e Será demitido");
		}
		
	}
	
	
	public void holherite() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Cargo: "+this.cargo);
		System.out.println("Salário "+ this.salario);
		System.out.println("RG "+this.rg);
		System.out.println("CPF: "+this.cpf);
	}
}
