package br.com.mateuussilvapb.cm.visao;

import java.util.Scanner;

import br.com.mateuussilvapb.cm.excecao.ExplosaoException;
import br.com.mateuussilvapb.cm.modelo.Tabuleiro;

public class TabuleiroConsole {
	
	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);
	
	public TabuleiroConsole(Tabuleiro tab) {
		this.tabuleiro = tab;
		
		executarJogo();
	}

	private void executarJogo() {
		try {
			boolean continuar = true;
			while (continuar) {
				cicloDoJogo();
				System.out.println("Outra partida? (S/n)");
				String resposta = entrada.nextLine();
				if ("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}			
		} catch (Exception e) {
			System.out.println("Obrigado por jogar!");
		} finally {
			entrada.close();
		}
		
	}

	private void cicloDoJogo() {
		try {
			
			while (!tabuleiro.objetivoAlcancado()) {
				
			}
			
			System.out.println("Você ganho!");
		} catch (ExplosaoException e) {
			System.out.println("Você perdeu!");

		}
	}
}
