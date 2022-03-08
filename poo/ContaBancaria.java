package poo;

public class ContaBancaria {

	int nConta =212;
	double saldo = 3500 ;
	boolean verificar;
	
	public void saldopositivo() {
		verificar = true;
	}
	public void saldonegativo() {
		verificar =false;
	}
	public void situacao() {
		if(verificar == true) {
			System.out.println("Dados da Conta");
		}
		else {
			System.out.println("Conta Negativa");
			System.out.println("Devedor");
			saldo = -2000;
		}
	}
	public void dados() {
		System.out.println("Número da conta: "+nConta);
		System.out.println("Saldo: "+saldo);
	}
}
