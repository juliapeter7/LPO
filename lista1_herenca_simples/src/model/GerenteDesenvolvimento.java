package model;

public class GerenteDesenvolvimento extends Gerente{
    public GerenteDesenvolvimento() {
    }

    public GerenteDesenvolvimento(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public double getBonus() {
        return 0.20 * getSalario(); // bonus de 20%
    }
}
