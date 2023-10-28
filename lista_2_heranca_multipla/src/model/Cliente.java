package model;

public class Cliente implements Investidor {

    private String nome;
    private String sobrenome;

    private String ticker;
    private int quantidade;

    public Cliente() {
    }

    public Cliente(String nome, String sobrenome, String ticker, int quantidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ticker = ticker;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "\nNome= " + nome + '\'' +
                "\nSobrenome= '" + sobrenome + '\'' +
                "\nTicker= " + ticker + '\'' +
                "\nQuantidade= " + quantidade +
                '}';
    }
}