package model;

public class Item {
    private int codItem;
    private double desconto;
    private int quantidade_itens;
    private Pedido pedido;
    private Produto produto;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    //metodos
    public double calcularTotal() {
        return quantidade_itens * produto.getPreco_unitario();
    }
}
