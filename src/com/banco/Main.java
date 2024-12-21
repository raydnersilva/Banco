package com.banco;

public class Main {
	public static void main(String[] args) {
		Cliente raydner = new Cliente();
		raydner.setNome("Raydner");
		
		Cliente joao = new Cliente();
		joao.setNome("Joao");
		
		Conta cc = new ContaCorrente(raydner);
		cc.depositar(100);
		cc.imprimirExtrato();
		
		Conta cp = new ContaPoupanca(joao);
		cp.imprimirExtrato();
		
		cc.transferir(30, cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
