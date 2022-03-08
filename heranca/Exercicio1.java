package heranca;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Cachorro x= new Cachorro("Shitzu", 2, "auauaau");
		Cavalo y = new Cavalo("Pé de Pano",3,"iiirrrrí");
        Preguica z = new Preguica("Flecha", 5, "não tem");
		
        x.setCorrer("vion");;
		x.mostrar();
		y.setCorrer("pocotopocoto");
		y.mostrar();
		z.setSubiunaarvore("tictic");
		z.mostrar();

	}

}
