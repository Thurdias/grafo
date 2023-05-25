//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class Grafo {
	// Propriedades da classe
	int quantidadeDeVertices = 0;
	int[][] matrizDeAdjascencias = null;
	
	// Método construtor da classe
	public Grafo(int quantidadeDeVertices) {
		matrizDeAdjascencias = new int[quantidadeDeVertices][quantidadeDeVertices];
	}
	
	// Métodos da classe
	public void definirConexoes() throws Exception{
//		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < (matrizDeAdjascencias.length -1); i++) {
			for(int j = (i+1); j < matrizDeAdjascencias.length; j++) {
				System.out.print("Digite <S> se " + i + " for adjascente a " + j + ": ");
				String variavel = ((((int) (10*Math.random())) < 8) ? "S" : "N");
//				if(leitor.readLine().equalsIgnoreCase("S")) {
				if(variavel.equalsIgnoreCase("S")) {
					matrizDeAdjascencias[i][j] = 1;
					matrizDeAdjascencias[j][i] = 1;
				}
			}
 		}
	}
	
	public void imprimirConexoes() {
		for(int i = 0; i< matrizDeAdjascencias.length; i++) {
			System.out.print(i + ":\t ");
			for (int j = 0; j < matrizDeAdjascencias.length; j++){
				if (matrizDeAdjascencias[i][j] == 1) {
					System.out.print(j + "\t");
				}
			}
			System.out.println();
		}
	}
	
	public String getVerticeMaisPopular() {
		String retorno = "";
		int maior = -1;
		int contador = 0;
		
		for(int i = 0; i < matrizDeAdjascencias.length; i++) {
			contador = 0;
			for(int j=0; j < matrizDeAdjascencias.length; j++) {
				if(matrizDeAdjascencias[i][j] == 1) {
					contador++;
				}
			}
			if(contador >= maior) {
				maior = contador;
			}
		}
		
		for(int i = 0; i < matrizDeAdjascencias.length; i++) {
			contador = 0;
			for(int j=0; j < matrizDeAdjascencias.length; j++) {
				if(matrizDeAdjascencias[i][j] == 1) {
					contador++;
				}
			}
			if(contador == maior) {
				retorno += i + ", ";
			}
			
		}
		return retorno.substring(0, retorno.length() - 2) + " com " + maior +" conexões !" ;
	}
}
