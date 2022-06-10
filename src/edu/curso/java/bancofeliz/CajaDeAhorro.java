package edu.curso.java.bancofeliz;

public class CajaDeAhorro extends CuentaBancaria {

	public CajaDeAhorro(Long numeroDeCuenta, Double saldo) {
		super(numeroDeCuenta, saldo);
	}

	@Override
	public String toString() {
		String texto = super.toString();
		texto = texto + "\nCaja de Ahorro";
		return texto;
	}

	@Override
	public void extraer(Double monto) {
		Double saldoActual = super.getSaldo();
		if(saldoActual - monto >= 0) {
			saldoActual = saldoActual - monto;
			super.setSaldo(saldoActual);
		} else {
			System.out.println("No tenes + plata en la cuenta: " + super.getNumeroDeCuenta());
		}
	}

}
