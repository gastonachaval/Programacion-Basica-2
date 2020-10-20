package ar.edu.unlam.pb2.dominio;

public class CuentaSueldo extends Cuenta {

	public Boolean extraer(Double importe) {
		Boolean sePudoExtraer=false;
		if (saldo>=importe) {
			saldo-=importe;
			sePudoExtraer=true;
		}
		return sePudoExtraer;
	}

}
