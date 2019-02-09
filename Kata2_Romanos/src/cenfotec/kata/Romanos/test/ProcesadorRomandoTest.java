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
	
	@Test
	public void pruebaDos() {
		ProcesadorRomano PR = new ProcesadorRomano();
		assertEquals(16, PR.logicaRomanosaNumeros("XVI"));
	}

	@Test
	public void pruebaTres() {
		ProcesadorRomano PR = new ProcesadorRomano();
		assertEquals(8, PR.logicaRomanosaNumeros("VIII"));
	}
}
