package br.com.fatec;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Pessoa {

	@XStreamAlias("nome")
	private String nome;
	
	@XStreamAlias("CPF")
	private String CPF;
	
	@XStreamAlias("bancoRecebimento")
	private String bancoRecebimento;
	
	@XStreamAlias("bancoPagamento")
	private String bancoPagamento;
	
	@XStreamAlias("data")
	private String data;
	
	@XStreamAlias("nomeTitular")
	private String nomeTitular;
	
	@XStreamAlias("numeroCartao")
	private String numeroCartao;
	
	@XStreamAlias("numeroBoleto")
	private String numeroBoleto;
	
	@XStreamAlias("valor")
	private double valor;
	
	@XStreamAlias("parcelas")
	private int parcelas;
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public void setBancoRecebimento(String bancoRecebimento) {
		this.bancoRecebimento = bancoRecebimento;
	}
	public void setBancoPagamento(String bancoPagamento) {
		this.bancoPagamento = bancoPagamento;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public void setNumeroBoleto(String numeroBoleto) {
		this.numeroBoleto = numeroBoleto;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	public String getNome() {
		return nome;
	}
	public String getCPF() {
		return CPF;
	}
	public String getBancoRecebimento() {
		return bancoRecebimento;
	}
	public String getBancoPagamento() {
		return bancoPagamento;
	}
	public String getData() {
		return data;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}

	public double getValor() {
		return valor;
	}
	public int getParcelas() {
		return parcelas;
	}
	public String getNumeroBoleto() {
		return numeroBoleto;
	}

	
}
