package br.com.fatec;

public class PagamentoBoleto extends Pagamento{

	public PagamentoBoleto(Pessoa p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ConstruirPagamento() {

		String pagamento = "";
		
		if(p.getNumeroBoleto() != null) {
			pagamento = "Número Boleto: " + p.getNumeroBoleto() + "\n";
		}
		
		return pagamento;
	}

}
