package ar.edu.unlam.pb2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.dominio.CajaDeAhorro;

public class TestCajaDeAhorro {

	@Test
	public void queSePuedaDepositar() {
		CajaDeAhorro cuenta = new CajaDeAhorro();
		cuenta.depositar(4000.0);
		Double saldo = cuenta.getSaldo();
		assertEquals(4000.0, saldo, 0.01);
	}

	@Test
	public void queSeCobreLaComisionAPartirDeLaQuintaExtraccion() {
		CajaDeAhorro cuenta = new CajaDeAhorro();
		cuenta.depositar(4000.0);
		for (int i = 0; i < 6; i++) {
			cuenta.extraer(200.0);
		}
		Double saldo = cuenta.getSaldo();
		assertEquals(2794.0, saldo, 0.01);
	}

	@Test
	public void queNoSePuedaExtraerUnImporteMayorAlSaldo() {
		CajaDeAhorro cuenta = new CajaDeAhorro();
		cuenta.depositar(4000.0);
		cuenta.extraer(500.0);
		assertFalse(cuenta.extraer(4000.0));
	}

}
