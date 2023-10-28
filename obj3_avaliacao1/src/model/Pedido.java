package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private static List<Pedido> vendasRealizadas = new ArrayList<>();

    private int numero;
    private Date data;
    private List<Item> itens = new ArrayList<>();

    public Pedido(int numero, Date data) {
        this.numero = numero;
        this.data = data;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.calcularTotal();
        }
        return total;
    }

    public static List<Pedido> getVendasRealizadas() {
        return vendasRealizadas;
    }

    public int getNumero() {
        return numero;
    }

    public Date getData() {
        return data;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void debitarEstoque() {
        for (Item item : itens) {
            Produto produto = item.getProduto();
            int quantidadeVendida = item.getQuantidade_itens();
            produto.adicionarEstoque(-quantidadeVendida); // Deduz a quantidade vendida do estoque
        }
    }
}
