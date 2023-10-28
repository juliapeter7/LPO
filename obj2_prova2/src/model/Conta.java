package model;

public abstract class Conta {
    protected double saldo;

    public void deposita(double valor) {
        saldo += valor;
    }

    public void saca(double valor) {
        double saldoAtual = saldo - valor;
        if (saldoAtual >= -200) {
            saldo -= valor;
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }
    }

    public void atualiza(double taxa) {
        if (taxa > 0) {
            saldo += saldo * (taxa / 100);
        } else {
            System.out.println("\nA taxa deve ser maior que 0\n");
        }
    }

    public Conta() {}

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
