package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fornecedor {
    private int cnpj;
    private String contato;
    private String nome;
    private List<Fornecimento> fornecimentos = new ArrayList<>();

    public Fornecedor(int cnpj, String contato, String nome) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
    }

    public void novoFornecimento(Produto produto, Date data, int quantidade) {
        Fornecimento fornecimento = new Fornecimento(produto, data, quantidade);
        fornecimentos.add(fornecimento);
        produto.adicionarEstoque(quantidade);
    }

    public List<Fornecimento> getFornecimentos() {
        return fornecimentos;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
