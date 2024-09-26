package br.edu.ifs.Atividade_04;

public class Produto {
    private String nome;
    private String descricao;
    private int quantidade;
    private double preco;
    private String validade;

    public Produto(String nome, String descricao, int quantidade, double preco, String validade) {
        this.nome = nome;
        this.setDescricao(descricao);
        this.quantidade = quantidade;
        this.setPreco(preco);
        this.setValidade(validade);
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void reduzirEstoque(int quantidade) {
        this.quantidade -= quantidade;
    }

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
