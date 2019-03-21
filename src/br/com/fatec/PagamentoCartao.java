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
			pagamento += "N�mero Cart�o: " + p.getNumeroCartao() + "\n";
			pagamento += "N�mero de Parcelas: " + p.getParcelas() + "\n";
		} else {
			pagamento += "N�mero Cart�o: " +  p.getNumeroCartao() + "\n";
		}

		return pagamento;
	}

}
