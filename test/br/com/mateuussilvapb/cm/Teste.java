package br.com.mateuussilvapb.cm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void testarSeIgualADois() {

		int a = 1 + 1;

		/*
		 * 'assertEquals' é um método que recebe dois parâmetros. O primeiro parâmetro é
		 * o que o desenvolvedor espera como resultado. Já o segundo é o retorno de
		 * alguma função, variável ou algo do tipo.
		 */
		assertEquals(2, a);

		/*
		 * Como o teste ainda não estava implementado, por padrão, a classe mandou que o
		 * teste falhasse
		 */
		// fail("Not yet implemented");
	}

	@Test
	void testarSeIgualATres() {

		int x = 2 + 10 - 9;

		assertEquals(3, x);
	}

}
