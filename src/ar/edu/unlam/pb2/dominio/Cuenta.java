package ar.edu.unlam.pb2.dominio;

public abstract class Cuenta {

	protected Double saldo;

	public Cuenta() {
		super();
		this.saldo = 0.0;
	}

	public void depositar(Double importe) {
		this.saldo += importe;
	}

	public Double getSaldo() {
		return saldo;
	}

	public abstract Boolean extraer(Double importe);

}
