package collection;

import java.util.ArrayList;
import java.util.List;

public class ListProduto {

	public static void main(String[] args) {
		
		
		
		List<String> lista = new ArrayList<>();
		
		System.out.println(lista);
		
		lista.add("Galaxy S10+");
		lista.add("Samsung A52s");
		lista.add("Galaxy S20 FE");
		lista.add("Samsung J7 Prime");
		System.out.println(lista);
		
		lista.set(3, "Samsung A72");
		
		lista.remove(0);
		System.out.println(lista);
		
		lista.clear();
		System.out.println(lista);
		
		
		
		
	}

}
