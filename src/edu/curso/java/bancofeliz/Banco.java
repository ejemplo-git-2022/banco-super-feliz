package edu.curso.java.bancofeliz;

public class Banco {
	
	public void extraerDeCuentaBancanria(CuentaBancaria cuentaBancaria, Double monto) {
		System.out.println("Tipo: " + cuentaBancaria.getClass().getName());
		System.out.println(cuentaBancaria);
		cuentaBancaria.extraer(monto);
	}

}
