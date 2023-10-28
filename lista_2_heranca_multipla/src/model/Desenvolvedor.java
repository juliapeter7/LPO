package model;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return 0;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor{" +
                "\nNome= " + getNome() + '\'' +
                "\nSalário= " + getSalario() +
                "\n" + '}';
    }
}
