package ar.edu.unlam.pb2.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import ar.edu.unlam.pb2.dominio.CuentaSueldo;

public class TestCuentaSueldo {

	@Test
	public void queSePuedaDepositar() {
		CuentaSueldo cuenta = new CuentaSueldo();
		cuenta.depositar(4000.0);
		Double saldo = cuenta.getSaldo();
		assertEquals(4000.0, saldo, 0.01);
	}

	@Test
	public void queSePuedaExtraer() {
		CuentaSueldo cuenta = new CuentaSueldo();
		cuenta.depositar(4000.0);
		cuenta.extraer(500.0);
		Double saldo = cuenta.getSaldo();
		assertEquals(3500.0, saldo, 0.01);
	}

	@Test
	public void queNoSePuedaExtraerUnImporteMayorAlSaldo() {
		CuentaSueldo cuenta = new CuentaSueldo();
		cuenta.depositar(4000.0);
		cuenta.extraer(500.0);
		assertFalse(cuenta.extraer(4000.0));
	}

}
