package model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private static List<Produto> produtos = new ArrayList<>();

    private int codigo_prod;
    private String nome_prod;
    private double preco_unitario;
    private int estoque;
    private Fornecedor fornecedor;

    public Produto(int codigo_prod, String nome_prod, double preco_unitario, Fornecedor fornecedor) {
        this.codigo_prod = codigo_prod;
        this.nome_prod = nome_prod;
        this.preco_unitario = preco_unitario;
        this.fornecedor = fornecedor;
        produtos.add(this);
    }

    public static List<Produto> getProdutos() {
        return produtos;
    }

    public int getCodigo_prod() {
        return codigo_prod;
    }

    public String getNome_prod() {
        return nome_prod;
    }

    public double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "\nProduto{" +
                "\nCod do produto: " + codigo_prod +
                "\nNome do produto: '" + nome_prod + '\'' +
                "\nPreço unitário: " + preco_unitario +
                "\nEstoque: " + estoque +
                "\nFornecedor: " + fornecedor.getNome() +
                '}';
    }

    public void adicionarEstoque(int quantidade) {
        estoque += quantidade;
    }
}
