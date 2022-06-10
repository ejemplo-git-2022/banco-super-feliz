package edu.curso.java.bancofeliz;

public class CuentaCorriente extends CuentaBancaria implements Producto {

	private Double limiteExtra;

	public CuentaCorriente(Long numeroDeCuenta, Double saldo, Double limiteExtra) {
		super(numeroDeCuenta, saldo);
		this.limiteExtra = limiteExtra;
	}
	
	public Double getLimiteExtra() {
		return limiteExtra;
	}

	public void setLimiteExtra(Double limiteExtra) {
		this.limiteExtra = limiteExtra;
	}
	
	@Override
	public void extraer(Double monto) {
		Double saldoActual = super.getSaldo() + limiteExtra;
		if(saldoActual - monto >= 0) {
			saldoActual = saldoActual - monto;
			super.setSaldo(saldoActual);
		} else {
			System.out.println("No tenes + plata en la cuenta: " + super.getNumeroDeCuenta());
		}
	}

	@Override
	public Double calcularCostoDeVenta() {
		// TODO Auto-generated method stub
		return 2000.0;
	}

	
}
