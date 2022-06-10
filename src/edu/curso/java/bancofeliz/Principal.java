package edu.curso.java.bancofeliz;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//CuentaBancaria cuentaBancaria1 = new CuentaBancaria(100, 10000.0);
		
		CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(4507L, 10000.0);
		
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente(4508L, 15000.0, 10000.0);
		
		Banco banco1 = new Banco();
		banco1.extraerDeCuentaBancanria(cuentaCorriente1, 2000.0);
		banco1.extraerDeCuentaBancanria(cajaDeAhorro1, 5000.0);
		
		
		
	}

}
