package br.com.mateuussilvapb.cm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void testarSeIgualADois() {

		int a = 1 + 1;

		/*
		 * 'assertEquals' � um m�todo que recebe dois par�metros. O primeiro par�metro �
		 * o que o desenvolvedor espera como resultado. J� o segundo � o retorno de
		 * alguma fun��o, vari�vel ou algo do tipo.
		 */
		assertEquals(2, a);

		/*
		 * Como o teste ainda n�o estava implementado, por padr�o, a classe mandou que o
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
