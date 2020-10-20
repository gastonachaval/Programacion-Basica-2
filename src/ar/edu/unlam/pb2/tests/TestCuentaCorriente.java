package ar.edu.unlam.pb2.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import ar.edu.unlam.pb2.dominio.CuentaCorriente;

public class TestCuentaCorriente {

	@Test
	public void queSePuedaDepositar() {
		CuentaCorriente cuenta = new CuentaCorriente();
		cuenta.depositar(4000.0);
		Double saldo = cuenta.getSaldo();
		assertEquals(4000.0, saldo, 0.01);
	}

	@Test
	public void queNoSePuedaExtraerUnMontoMayorAlSaldoMasDescubierto() {
		CuentaCorriente cuenta = new CuentaCorriente();
		cuenta.depositar(4000.0);
		assertFalse(cuenta.extraer(4300.0));
	}

	@Test
	public void queFuncioneElDescubierto() {
		CuentaCorriente cuenta = new CuentaCorriente();
		cuenta.depositar(100.0);
		cuenta.extraer(200.0);
		Double saldo = cuenta.getSaldo();
		assertEquals(-105.00, saldo, 0.01);

	}

	@Test
	public void queNoSePuedaUtilizarDescubiertoCuandoSeAgoto() {
		CuentaCorriente cuenta = new CuentaCorriente();
		cuenta.depositar(100.0);
		cuenta.extraer(250.0);
		assertFalse(cuenta.extraer(1.0));

	}

}
