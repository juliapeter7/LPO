package model;

import java.util.Date;

public class Fornecimento {
    private Date data;
    private int quantidade;
    private Produto produto;

    public Fornecimento(Produto produto, Date data, int quantidade) {
        this.produto = produto;
        this.data = data;
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
