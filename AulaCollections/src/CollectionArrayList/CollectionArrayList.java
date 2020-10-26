package CollectionArrayList;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

public class CollectionArrayList {
	public static void main(String[] args) {
		Collection<String> lista = new ArrayList<String>();
		//List<String> lista = new ArrayList<String>();
		
		// M�todo add adiciona um elemento a lista.
		lista.add("Manoel");
		lista.add("Joaquim");
		lista.add("Maria"); 
		
		
		// M�todo .isEmpty()
		// Verifica se algum campo dentro da lista est� vazio
		if(lista.isEmpty()) {
			System.out.println("Lista vazia...");
		} else {
			System.out.println("Lista: "+lista);
		}
		
		// M�todo remove - remove um item da lista
		lista.remove("Joaquim");
		System.out.println("Lista: "+lista);
		
		// M�todo clear - remove todos os itens da lista
		lista.clear();
		System.out.println("Lista: "+lista);
		
		lista.add("OhJuliana");
		lista.add("Fabr�cia");
		lista.add("Charlota");
		
		// M�todo contains - verifica se o elemento enviado como argumento est� contido na lista.
		System.out.println("Cont�m Fabr�cia? "+lista.contains("Fabr�cia"));
	
		Collection<String> lista2 = Arrays.asList("Juliana","Manuela");
		lista.addAll(lista2);
		System.out.println("Lista de nomes: "+lista);
		
		// Percorrer elementos de uma ArrayList
		System.out.println("\nPercorrendo uma lista:");
		for(String nome : lista) {
			System.out.println("Nome: "+nome);
		}
		
	}
}
