package model;

public class DesenvolvedorJunior extends Desenvolvedor {
    public DesenvolvedorJunior() {
    }

    public DesenvolvedorJunior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return 0.05 * getSalario(); // bonus de 5%
    }
}
