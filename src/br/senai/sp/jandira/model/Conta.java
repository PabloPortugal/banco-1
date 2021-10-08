package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {
	
	
	//sempre q privarmos um atributo,temos q fazer um metodo de acesso 
	
	private  TipoConta tipo;
	public String numero;
	public String numeroAgencia;
	public Cliente titular;
	private  double saldo;
	
	//Método de construção 
	public Conta(String numeroConta) {
		numero = numeroConta;
		}
	
	

	public void setTipo(TipoConta tipo){
	
		this.tipo = tipo;
		
		
	}
	public TipoConta getTipo() {
		
		return  tipo;
		
		
	}
	
	public void setTipo() {
		
		
		
	}
	public void depositar(double valorDeposito) {
	
		System.out.println();
		System.out.println("Efetuando depósito...");
		
		if (valorDeposito > 0) {
			 saldo += valorDeposito;
		System.out.println("Foi depositado" + valorDeposito + "na conta do(a)" + titular );	
	 } else {
	
			System.out.println("Não foi possivel efetuar seu depósito !");	
	 }
		 
}
		public boolean sacar(double valorSaque) {

	if (valorSaque < 0 || saldo < valorSaque) {
			System.out.println("Não foi possivel efetuar o saque! ");
			return false;
		} else {
			saldo -= valorSaque;
		return true;
		}
}
	 
	//Adicionar o valor e o destino 
		
		public void transferir(Conta contaDestino, double valorTransferencia) {
		
			boolean resultado = sacar(valorTransferencia);
	
			if(resultado) {
				contaDestino.depositar(valorTransferencia);
				
			}else {
				System.out.println("Não é possivel realizar a transaferência!");
				
		}
	
 }
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
}
		

