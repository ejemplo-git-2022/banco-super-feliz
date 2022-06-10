package edu.curso.java.bancofeliz;

public class CuentaBancaria {
	
	private Long numeroDeCuenta;
	private Double saldo;
	
	public CuentaBancaria() {
		
	}
	
	public CuentaBancaria(Long numeroDeCuenta, Double saldo) {
		super();
		this.numeroDeCuenta = numeroDeCuenta;
		this.saldo = saldo;
	}

	public void extraer(Double monto) {
		saldo = saldo - monto;
	}

	public Long getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numeroDeCuenta=" + numeroDeCuenta + ", saldo=" + saldo + "]";
	}

	public void setNumeroDeCuenta(Long numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
