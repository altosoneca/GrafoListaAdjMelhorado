import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class Grafo {
	Map<String, LinkedList<String>> vetor;
	public int tempo = 0;

	public Grafo(int n) {
		vetor = new HashMap<String, LinkedList<String>>(n);
	}

	public void addAresta(String indice, String destino) {
		LinkedList<String> list = new LinkedList<String>();
		if (vetor.containsKey(indice)) {
			list = vetor.get(indice);
		}
		list.push(destino);
		vetor.put(indice, list);
	}

	public void showSucessores() {
		for (String vertice : vetor.keySet()) {
			System.out.print("Sucessores do vértice " + vertice + ": ");
			for (String adjacentes : vetor.get(vertice)) {
				System.out.print(adjacentes + " ");
			}
			System.out.println();
		}
	}

	public boolean arcoExiste(String a, String b) {
		return vetor.get(a).contains(b) || vetor.get(b).contains(a);

	}

	public Map<String, LinkedList<String>> getVetor() {
		return vetor;
	}

}
