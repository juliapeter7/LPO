package controller;

import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VendaController {
    public static void main(String[] args) {
        //produtos e vendedor
        Produto produto1 = new Produto(1, "mouse", 50,  null);
        Produto produto2 = new Produto(2, "teclado", 45, null);

        Vendedor vendedor = new Vendedor(123, "Ariana Grande", "Rua das flores", "Fragata", "123", "Pelotas", "RS", "A");

        // fornecedores/fornecimento
        Fornecedor fornecedor1 = new Fornecedor(123, "1234", "Yasuo");
        Fornecedor fornecedor2 = new Fornecedor(321, "4321", "Lana del Rey");

        Date dataFornecimento = new Date();
        System.out.println("Estoque do produto 1 antes do fornecimento: " + produto1.getEstoque());
        System.out.println("Estoque do produto 2 antes do fornecimento: " + produto2.getEstoque());
        fornecedor1.novoFornecimento(produto1, new Date(), 100);
        fornecedor2.novoFornecimento(produto2, new Date() ,150);
        System.out.println("Estoque do produto 1 depois do fornecimento: " + produto1.getEstoque());
        System.out.println("Estoque do produto 2 depois do fornecimento: " + produto2.getEstoque());

        System.out.println("\nRelatório de Fornecimentos:");
        for (Fornecedor fornecedor : List.of(fornecedor1, fornecedor2)) {
            System.out.println("Fornecedor: " + fornecedor.getNome());
            for (Fornecimento fornecimento : fornecedor.getFornecimentos()) {
                System.out.println("Produto: " + fornecimento.getProduto().getNome_prod());
                System.out.println("Data do Fornecimento: " + dataFornecimento);
                System.out.println("Quantidade: " + fornecimento.getQuantidade());
                System.out.println("Valor Total: " + fornecimento.getQuantidade() * fornecimento.getProduto().getPreco_unitario());
                System.out.println("\n------------------");
            }
        }
        List <Pedido> vendas = new ArrayList<>();
        Pedido ped1 = new Pedido(10, new Date());
        Item item1 = new Item(1, 10, 10, ped1, produto1);
        Item item2 = new Item(2, 10, 5, ped1, produto2);
        ped1.adicionarItem(item1);
        ped1.adicionarItem(item2);
        vendas.add(ped1);

        Pedido ped2 = new Pedido(11, new Date());
        Item item3 = new Item(3, 10, 15, ped2, produto1);
        Item item4 = new Item(4, 10, 2, ped2, produto2);
        ped2.adicionarItem(item3);
        ped2.adicionarItem(item4);
        vendas.add(ped2);

        // vendas
        System.out.println();
        System.out.println("\n------------------");
        double totalVenda1 = realizarVenda(vendedor, ped1);
        System.out.println("\n------------------");
        double totalVenda2 = realizarVenda(vendedor, ped2);
        System.out.println("\n------------------");


        //exibir o estoque pos venda
        System.out.println("Estoque do produto 1 depois da venda: " + produto1.getEstoque());
        System.out.println("Estoque do produto 2 depois da venda: " + produto2.getEstoque());

        // relatório de vendas
        System.out.println("\nRelatório de Vendas:");
        System.out.println("Venda 1 - Total: " + totalVenda1);
        System.out.println("Venda 2 - Total: " + totalVenda2);
    }

    private static double realizarVenda(Vendedor vendedor, Pedido pedido) {
        double totalPedido = pedido.calcularTotal();
        System.out.println("Numero do pedido: " + pedido.getNumero() + "\nVenda realizada por " + vendedor.getNome() +
                " " +
                "- Total: " + totalPedido +
                "\nItens vendidos:");
        for (Item item : pedido.getItens()) {
            String nomeItem = item.getProduto().getNome_prod();
            int quantidadeItem = item.getQuantidade_itens();
            System.out.println("Item: " + nomeItem + " - Quantidade: " + quantidadeItem);
        }
        pedido.debitarEstoque();
        return totalPedido;
    }

}
