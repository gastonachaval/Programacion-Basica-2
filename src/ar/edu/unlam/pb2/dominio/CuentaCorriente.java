package ar.edu.unlam.pb2.dominio;

public class CuentaCorriente extends Cuenta {

	private Double descubierto;
	private final Double COMISION_POR_DESCUBIERTO = 0.05;

	public CuentaCorriente() {
		super();
		this.descubierto = 150.0;
	}

	@Override
	public Boolean extraer(Double importe) {
		Boolean sePudoExtraer = false;
		if (saldo >= importe) {
			saldo -= importe;
			sePudoExtraer = true;
		} else if (saldo + descubierto >= importe) {
			Double importeExtraidoEnDescubierto = (saldo - importe) * -1;
			descubierto-=importeExtraidoEnDescubierto;
			Double comisionCobradaPorDescubierto = importeExtraidoEnDescubierto * COMISION_POR_DESCUBIERTO;
			saldo -= importe + comisionCobradaPorDescubierto;
			sePudoExtraer = true;
		}
		return sePudoExtraer;
	}

	public Double getDescubierto() {
		return descubierto;
	}

}
