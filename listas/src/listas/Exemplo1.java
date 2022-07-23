package listas;

import java.util.ArrayList;
import java.util.List;

public class Exemplo1 {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Adriano");
		nomes.add("Rebeca");
		nomes.add("Jr");
		System.out.println(nomes);
		nomes.remove(2);
		System.out.println(nomes);
		nomes.remove("Rebeca");
		System.out.println(nomes);
		nomes.add("Rebeca");
		nomes.add("Jr");

		/*for (int i = 0; i < nomes.size(); i++) {
			System.out.println("Nome: "+nomes.get(i));
		}*/
		// FOR APRIMORADO
		/*for (String nome : nomes) {
			System.out.println("Nome: "+nome);
		}*/
		/*nomes.forEach(nome->{
			System.out.println("Nome: "+nome);
		});*/
		//nomes.forEach(nome -> System.out.println("Nome: "+nome));
		nomes.forEach(System.out::println);
	}

}
