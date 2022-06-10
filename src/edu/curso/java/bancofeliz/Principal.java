package edu.curso.java.bancofeliz;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//CuentaBancaria cuentaBancaria1 = new CuentaBancaria(100, 10000.0);
		
		CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(4507L, 10000.0);
		cajaDeAhorro1.extraer(5000.0);
		System.out.println(cajaDeAhorro1);
		
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente(4508L, 15000.0, 10000.0);
		cuentaCorriente1.extraer(20000.0);
		System.out.println(cuentaCorriente1);
		
		
		
	}

}
