package model;

public class Produto {
    private int codigo_prod;
    private String nome_prod;
    private int estoque;
    private double preco_unitario;
    private Fornecedor fornecedor;

    // metodo baixar estoque
    public void baixarEstoque(int quantidade_itens){
        if (quantidade_itens <= estoque) {
            estoque -= quantidade_itens;
        } else
            System.out.println("Quantidade insuficiente no estoque!");
    }

    public Produto() {
    }

    public Produto(int codigo_prod, String nome_prod, int estoque, double preco_unitario, Fornecedor fornecedor) {
        this.codigo_prod = codigo_prod;
        this.nome_prod = nome_prod;
        this.estoque = estoque;
        this.preco_unitario = preco_unitario;
        this.fornecedor = fornecedor;
    }

    public int getCodigo_prod() {
        return codigo_prod;
    }

    public void setCodigo_prod(int codigo_prod) {
        this.codigo_prod = codigo_prod;
    }

    public String getNome_prod() {
        return nome_prod;
    }

    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
