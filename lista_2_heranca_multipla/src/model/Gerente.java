package model;

public class Gerente extends Funcionario implements Investidor {

    private String ticker;
    private int quantidade;

    public Gerente() {
    }

    public Gerente(String nome, double salario, String ticker, int quantidade) {
        super(nome, salario);
        this.ticker = ticker;
        this.quantidade = quantidade;
    }

    @Override
    public String getTicker() {
        return ticker;
    }

    @Override
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
    public double getBonus() {
        return this.getSalario() * 0.1;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "\nNome= " + getNome() + '\'' +
                "\nSalário= " + getSalario() +
                "\n" + '}';

    }

}
