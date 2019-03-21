package br.com.fatec;

import java.util.ArrayList;

public class Sistema {

	public static void main(String[] args) {

		ArrayList<Pessoa> clientes;
		Leitor l = new LeitorXML();
		clientes = l.Ler();

		for (Pessoa pessoa : clientes) {
			Pagamento p;

			if (pessoa.getNumeroBoleto() == null) {
				p = new PagamentoCartao(pessoa);
			} else {
				p = new PagamentoBoleto(pessoa);
			}

			System.out.println(p.Montar());
		}
	}
}
