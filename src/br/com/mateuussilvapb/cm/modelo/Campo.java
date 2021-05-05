package br.com.mateuussilvapb.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {

	private final int LINHA;
	private final int COLUNA;
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	Campo(int linha, int coluna){
		this.COLUNA = coluna;
		this.LINHA = linha;
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		return 
	}
}
