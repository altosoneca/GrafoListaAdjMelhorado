
public class main {

	public static void main(String[] args) {
			Grafo G = new Grafo(4);
		G.addAresta("a", "b");
		G.addAresta("b", "c");
		G.addAresta("b", "d");
		G.addAresta("a", "c");
		G.addAresta("c", "b");
		G.addAresta("d", "a");
		
	}

}
