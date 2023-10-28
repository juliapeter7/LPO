package model;

public class Item {
    private int codItem;
    private double desconto;
    private int quantidade_itens;
    private Pedido pedido;
    private Produto produto;

    public Item(int codItem, double desconto, int quantidade_itens, Pedido pedido, Produto produto) {
        this.codItem = codItem;
        this.desconto = desconto;
        this.quantidade_itens = quantidade_itens;
        this.pedido = pedido;
        this.produto = produto;
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getQuantidade_itens() {
        return quantidade_itens;
    }

    public void setQuantidade_itens(int quantidade_itens) {
        this.quantidade_itens = quantidade_itens;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double calcularTotal() {
        return quantidade_itens * produto.getPreco_unitario();
    }
}
