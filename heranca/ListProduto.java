package collection;

import java.util.ArrayList;
import java.util.List;

public class ListProduto {

	public static void main(String[] args) {
		
		
		
		List<String> lista = new ArrayList<>();
		
		System.out.println(lista);
		
		lista.add("oi");
		lista.add("s");
		lista.add("l");
		lista.add("a");
		System.out.println(lista);
		
		lista.set(3, "A72");
		
		lista.remove(0);
		System.out.println(lista);
		
		lista.clear();
		System.out.println(lista);
		
		
		
		
	}

}
