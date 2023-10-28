package model;

public class DesenvolvedorSenior extends Desenvolvedor{
    public DesenvolvedorSenior() {
    }

    public DesenvolvedorSenior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return 0.10 * getSalario(); // bonus de 10%
    }
}
