package teste;

import java.util.ArrayList;
import java.util.Collections;

public class ProgramaFila {

	public static void main(String[] args) {

		// Se utilizar fila aplicando vetor o problema é que quando eu remover o
		// primeiro o restante não anda
		// automático, eu preciso empurrar por exemplo utilizar um for, utilizando muito
		// mais instruções

		/*
		 * ArrayList nome = new ArrayList<>(); nome.add("Rafael"); nome.add("Karina");
		 * nome.add("Julia"); nome.add("Leonardo");
		 * 
		 * String recebeNome = (String) nome.get(0); //O que é casting?
		 * System.out.println(recebeNome);
		 * 
		 * System.out.println(nome);
		 */

		ArrayList<String> nome = new ArrayList<>();
		nome.add("Rafael");
		nome.add("Karina");
		nome.add("Julia");
		nome.add("Leonardo");

		String recebeNome = nome.get(0);
		System.out.println(recebeNome);

		// Maneira de saber quantos itens existem na lista
		System.out.println("Quantidade de posições na lista " + nome.size());

		// Erro IndexOutOfBoundsException, que é a tentativa de acessar uma posição que
		// não existe
		// System.out.println(nome.get(5));

		System.out.println(nome);

		// utilizando o for each para imprimir
		for (String imprimeNome : nome) {
			System.out.println(imprimeNome);
		}

		// Adicionando um nome na posição zero
		nome.add(0, "Paula");
		System.out.println(nome);
		
		nome.add("Paula");//A fila permite elementos duplicados

		// Maneira de saber quantos itens existem na lista
		System.out.println("Quantidade de posições na lista " + nome.size());

		// Removendo o nome na posição zero da lista
		nome.remove(0);
		System.out.println(nome);
		
		// Maneira de saber quantos itens existem na lista
		System.out.println("Quantidade de posições na lista " + nome.size());
		
		// Verificar se um nome existe na lista
		boolean verificarExistencia = nome.contains("Rafael");
		System.out.println("Se retornar true significa que existe, se false não existe. Resultado: " + verificarExistencia);
		
		//Mostrar a lista de maneira ordenada
		Collections.sort(nome);
	}
}
