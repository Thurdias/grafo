
public class Principal {
	public static void main(String[] args) throws Exception{
		Grafo grafo = new Grafo(100);
		
		grafo.definirConexoes();
		grafo.imprimirConexoes();
		
		System.out.println("Vértice mais popular: " + grafo.getVerticeMaisPopular());
	}
}
