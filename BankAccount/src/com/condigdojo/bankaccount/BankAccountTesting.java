package com.condigdojo.bankaccount;

public class BankAccountTesting {

	public static void main(String[] args) {
		BankAccount cuenta1 = new BankAccount();
		
		cuenta1.depositar(100.0);
		
		cuenta1.ahorrar(250.0);
		
		System.out.println(cuenta1.getSaldo());
		
		System.out.println(cuenta1.getSaldoahorros());
		
		cuenta1.retirar(25.0);
		
		System.out.println(cuenta1.getSaldo());
		
		cuenta1.retirar(100.0);
		
		cuenta1.retirarAhorros(300.0);
		
		System.out.println(BankAccount.dineroAlmacenadoTotal());
		
		System.out.println(cuenta1.dineroTotal());

	}

}
