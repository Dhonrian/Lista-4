package br.com.fatec;

public abstract class Pagamento {

	protected Pessoa p;

	public Pagamento(Pessoa p) {
		this.p = p;
	}

	private String Começo() {

		String texto = "";

		texto += "Nome: " + this.p.getNome() + "\n";
		texto += "CPF: " + this.p.getCPF() + "\n";
		texto += "Banco Recebimento: " + this.p.getBancoRecebimento() + "\n";
		texto += "Banco Pagamento: " + this.p.getBancoPagamento() + "\n";
		return texto;
	}

	protected abstract String ConstruirPagamento();

	private String Final() {
		String texto = "";

		texto += "Valor: " + this.p.getValor() + "\n";
		texto += "Data: " + this.p.getData() + "\n";
		return texto;
	}

	public String Montar() {
		return Começo() + ConstruirPagamento() + Final();
	}

}
