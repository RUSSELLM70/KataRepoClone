package cenfotec.kata.Romanos.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import cenfotec.kata.Romanos.ProcesadorRomano;

public class ProcesadorRomandoTest {

	@Test
	public void pruebaUno() {
		ProcesadorRomano PR = new ProcesadorRomano();
		assertEquals(60, PR.logicaRomanosaNumeros("LX"));
	}
	
	
}
