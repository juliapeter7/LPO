package model;

public class ContaCorrente extends Conta implements Associado {
    private int qdeCotas;
    private double valorCota;

    public ContaCorrente(double saldo, int qdeCotas, double valorCota) {
        super(saldo);
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
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
        return "\nConta Corrente\n{" +
                "Saldo= " + getSaldo() +
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
