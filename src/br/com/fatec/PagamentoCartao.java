package br.com.fatec;

public class PagamentoCartao extends Pagamento {

	public PagamentoCartao(Pessoa p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ConstruirPagamento() {

		String pagamento = "";

		if (p.getParcelas() != 0) {
			pagamento += "Número Cartão: " + p.getNumeroCartao() + "\n";
			pagamento += "Número de Parcelas: " + p.getParcelas() + "\n";
		} else {
			pagamento += "Número Cartão: " +  p.getNumeroCartao() + "\n";
		}

		return pagamento;
	}

}
