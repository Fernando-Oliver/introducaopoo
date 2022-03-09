package poliformismo;

public class Exercicio2 {

public static void main(String[] args) {
		
		Cachorro2 x= new Cachorro2();
		Cavalo2 y = new Cavalo2();
        Preguica2 z = new Preguica2();
		
        System.out.println("Espécie: Cavalo");
        System.out.print("Nome: "); 
        x.nome();
        System.out.print("idade: ");
        x.idade();
        System.out.print("Som: ");
        x.emitirsom();
        System.out.print("ação: ");
        x.acao();
 
        System.out.println("Espécie: Bicho-Preguiça");
        System.out.print("Nome: "); 
        y.nome();
        System.out.print("idade: ");
        y.idade();
        System.out.print("Som: ");
        y.emitirsom();
        System.out.print("ação: ");
        y.acao();
    
        System.out.println("Espécie: Cachorro");
        System.out.print("Nome: "); 
        z.nome();
        System.out.print("idade: ");
        z.idade();
        System.out.print("Som: ");
        z.emitirsom();
        System.out.print("ação: ");
        z.acao();

	}

}
