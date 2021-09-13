package br.com.exercicio.estoque;

public class SuperProdutos {

	private String nomeP;
	private String validade;
	private int quantidade;
	private int numLote;

	public SuperProdutos(String nomeP, String validade, int quantidade, int numLote) {
		super();
		this.nomeP = nomeP;
		this.validade = validade;
		this.quantidade = quantidade;
		this.numLote = numLote;
	}

	public String getNomeP() {
		return nomeP;
	}

	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return nomeP + " | Validade: " + validade + "| Unidades: " + quantidade + " |  Lote n°: " + numLote;
	}

}
