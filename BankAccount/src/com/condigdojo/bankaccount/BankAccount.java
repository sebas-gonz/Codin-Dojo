package com.condigdojo.bankaccount;

import java.util.Random;

public class BankAccount {
	private String numerodecuenta = "";
	private double saldocorrient;
	private double saldoahorros;
	
	private static int cuentas;
	private static double dineroalmacenado;
	
	public BankAccount() {
		setNumerodecuenta(numeroAleatorio());
		
		cuentas++;
	}
	
	private String numeroAleatorio() {
		Random numero = new Random();
		for(int i = 0; i < 10; i++) {
		setNumerodecuenta( getNumerodecuenta() + String.valueOf(numero.nextInt(10 + 1)));
		}
		return getNumerodecuenta();
	}
	
	public double dineroTotal() {
		return getSaldo() + getSaldoahorros();
	}
	
	public static double dineroAlmacenadoTotal() {
		return dineroalmacenado;
		
	}
	public static void setDineroAlmacenado(double dinero) {
		dineroalmacenado = dinero;
	}
	
	public void depositar(double dinero) {
		setSaldo(getSaldo() + dinero);
		setDineroAlmacenado(dineroAlmacenadoTotal() + dinero);
		
	}
	
	public void ahorrar(double dinero) {
		setSaldoahorros(getSaldoahorros() + dinero);
		setDineroAlmacenado(dineroAlmacenadoTotal() + dinero);
	}
	
	public void retirar(double dinero) {
		if(getSaldo() < dinero) {
			System.out.println("No hay fondos suficientes");
		}
		else {
			
			setSaldo(getSaldo() - dinero);
			System.out.println("se han retirado: "+ dinero+"$");
			setDineroAlmacenado(dineroAlmacenadoTotal() - dinero);
		}
		
	}
	public void retirarAhorros(double dinero) {
		if(getSaldoahorros() < dinero) {
			System.out.println("No hay ahorros suficientes");
		}
		else {
			setSaldoahorros(getSaldoahorros() - dinero);
			System.out.println("se han retirado: "+ dinero+"$");
			setDineroAlmacenado(dineroAlmacenadoTotal() - dinero);
		}
		
	}
	
	public static int numeroCuentas() {	
		return cuentas;
	}
	
	public String getNumerodecuenta() {
		return numerodecuenta;
	}
	public void setNumerodecuenta(String numerodecuenta) {
		this.numerodecuenta = numerodecuenta;
	}
	public double getSaldo() {
		return saldocorrient;
	}
	public void setSaldo(double saldo) {
		this.saldocorrient = saldo;
	}
	public double getSaldoahorros() {
		return saldoahorros;
	}
	public void setSaldoahorros(double saldoahorros) {
		this.saldoahorros = saldoahorros;
	}
	
	
}
