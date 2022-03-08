package poo;

public class Paciente {

	String nome = "Naruto Uzumaki";
	int idade = 18;
	int Cpf = 12345678;
	int nquarto = 21;
	String endereco = "Av. Albert Einstein";
	boolean estado;
	
	public void bem() {
		estado =true;
	}
	public void mal() {
		estado = false;
	}
	
	public void situacao() {
		if(estado == true) {
			System.out.println("Paciente Ganhou Alta");
		}else {
			System.out.println("Paciente precisa de Cirurgia");
		}
	}
	public void ficha() {
		System.out.println("Nome: "+nome);
		System.out.println("idade: "+idade);
		System.out.println("CPF: "+Cpf);
		System.out.println("Endereço: "+endereco);
		System.out.println("Número do Quarto: "+nquarto);
		
	}
	
}
