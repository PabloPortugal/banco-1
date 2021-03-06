package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// Cria??o da conta da Maria
		
		Conta contaMaria = new Conta("7845-8");
		contaMaria.titular = "Maria Antonieta";
		contaMaria.numeroAgencia = "4214-9";
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		
		// Cria??o da conta do Pedro
		
		Conta contaPedro = new Conta("6547-6");
		contaPedro.titular = "Pedro Cabral";
		contaPedro.depositar(200); 
		contaPedro.setTipo(TipoConta.POUPANCA); 
		contaPedro.numeroAgencia = "4214-9";
		
		// Cria??o da conta da Ana
		
		Conta contaAna = new Conta("2314-9");
		contaAna.titular = "Ana Gomes";
		contaAna.depositar(2.000); 
		contaAna.setTipo(TipoConta.SALARIO);
		contaAna.numeroAgencia = "4214-9";
		
		
		// Exibir os detalhes das contas
		
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		//Deposiatr 100 reais na conta da Maria 
		contaMaria.depositar(100);
		contaMaria.exibirDetalhes();

		
		// Sacar 300 reais da conta da Maria 
		contaMaria.sacar(300);
		contaMaria.exibirDetalhes();
		
		// Depositar -200 na conta do Pedro
		contaPedro.depositar(-200);
		contaPedro.exibirDetalhes();
		
		//sacar -100 da conta da Maria
		contaMaria.sacar(400);
		contaMaria.exibirDetalhes();
	
		//Transferir 100 reais da conta do Pedro
		//Para conta da Maria 
		
		contaPedro.transferir(contaMaria, -150);
		contaPedro.exibirDetalhes();
		contaMaria.exibirDetalhes();
		
	
	
	}

}
