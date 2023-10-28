package model;

public class Cliente implements Associado{
    private String nome;
    private int qdeCotas;
    private double valorCota;

    public Cliente() {
    }

    public Cliente(String nome, int qdeCotas, double valorCota) {
        this.nome = nome;
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQdeCotas() {
        return qdeCotas;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    @Override
    public String toString() {
        double lucro = lucros(qdeCotas, valorCota);
        return "\nCliente\n{" +
                "Nome= '" + nome + '\'' +
                " Qtnd de Cotas= " + qdeCotas +
                " Lucro= " + lucro +
                '}';
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return qdeCotas * valorCota * 0.1;
    }

    @Override
    public double getLucro() {
        return this.qdeCotas * this.valorCota * 0.1;
    }
}
