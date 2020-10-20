package ar.edu.unlam.pb2.dominio;

public class CajaDeAhorro extends Cuenta {

	private static Integer cantidadDeExtraccionesRealizadas;
	private final Double COMISION_EXTRACCION = 6.0;

	public CajaDeAhorro() {
		super();
		CajaDeAhorro.cantidadDeExtraccionesRealizadas = 0;
	}

	@Override
	public Boolean extraer(Double importe) {
		Boolean sePudoExtraer = false;
		if (cantidadDeExtraccionesRealizadas < 5 && saldo >= importe) {
			saldo -= importe;
			cantidadDeExtraccionesRealizadas++;
			sePudoExtraer = true;
		} else if (cantidadDeExtraccionesRealizadas >= 5 && saldo + COMISION_EXTRACCION >= importe) {
			saldo -= importe + COMISION_EXTRACCION;
			sePudoExtraer = true;
		}
		return sePudoExtraer;
	}

}
