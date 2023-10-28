package controller;

import model.*;

import java.text.NumberFormat;
import java.util.List;
import java.util.ArrayList;

public class FuncionarioController {
    private static double folha_com_bonus = 0.0;
    private static double folha_sem_bonus = 0.0;
    private static double cinco_porcento = 0.0;

    // construtores padrão e parametrizado
    public static void main(String[] args) {
        DesenvolvedorSenior dev1 = new DesenvolvedorSenior("julia", 5000);
        DesenvolvedorSenior dev2 = new DesenvolvedorSenior();
        GerenteDesenvolvimento ger1 = new GerenteDesenvolvimento("joao", 10000);
        GerenteGeral ger2 = new GerenteGeral();

        dev2.setNome("ana");
        dev2.setSalario(5000);
        ger2.setNome("antonio");
        ger2.setSalario(10000);

        // imprimindo os primeiros objetos
        System.out.println("\nDados dos funcionarios: ");
        System.out.println("Nome do desenvolvedor: " + dev1.getNome() + "\nSalario do desenvolvedor: " + dev1.getSalario());
        System.out.println("Nome do desenvolvedor: " + dev2.getNome() + "\nSalario do desenvolvedor: " + dev2.getSalario());
        System.out.println("Nome do gerente: " + ger1.getNome() + "\nSalario do gerente: " + ger1.getSalario());
        System.out.println("Nome do gerente: " + ger2.getNome() + "\nSalario do gerente: " + ger2.getSalario());

        // alterando o valor dos atributos

        dev1.setSalario(3500.00);
        dev2.setSalario(3500.00);
        ger1.setSalario(4500.00);
        ger2.setSalario(6500.00);

        //imprimindo com os valores alterados
        System.out.println("\nDados dos funcionarios com valores alterados: ");
        System.out.println("Nome do desenvolvedor: " + dev1.getNome() + "\nSalario do desenvolvedor: " + dev1.getSalario());
        System.out.println("Nome do desenvolvedor: " + dev2.getNome() + "\nSalario do desenvolvedor: " + dev2.getSalario());
        System.out.println("Nome do gerente: " + ger1.getNome() + "\nSalario do gerente: " + ger1.getSalario());
        System.out.println("Nome do gerente: " + ger2.getNome() + "\nSalario do gerente: " + ger2.getSalario());
        //imprimindo o bonus
        System.out.println("\nDados dos funcionarios com bonus: ");
        System.out.println("Nome do desenvolvedor: " + dev1.getNome() + "\nSalario do desenvolvedor: " + dev1.getSalario() + "\nBonus do desenvolvedor: " + dev1.getBonus());
        System.out.println("Nome do desenvolvedor: " + dev2.getNome() + "\nSalario do desenvolvedor: " + dev2.getSalario() + "\nBonus do desenvolvedor: " + dev2.getBonus());
        System.out.println("Nome do gerente: " + ger1.getNome() + "\nSalario do gerente: " + ger1.getSalario() + "\nBonus do gerente: " + ger1.getBonus());
        System.out.println("Nome do gerente: " + ger2.getNome() + "\nSalario do gerente: " + ger2.getSalario() + "\nBonus do gerente: " + ger2.getBonus());

        /* questões:
            1: Não foi possível, pois a classe é abstrata sendo impossível criar instâncias de classes abstratas.
            2: Deve-se inserir as regras de negócios nas classes de modelo
         */

        //2
        Desenvolvedor dev3 = new DesenvolvedorSenior("nataly", 3500.00);
        Desenvolvedor dev4 = new DesenvolvedorSenior("fernanda", 3500.00);
        Desenvolvedor dev5 = new DesenvolvedorSenior("mariana", 3500.00);
        Desenvolvedor dev6 = new DesenvolvedorSenior("ricardo", 3500.00);
        Desenvolvedor dev7 = new DesenvolvedorPleno("juliana", 2500.00);
        Desenvolvedor dev8 = new DesenvolvedorPleno("renata", 2500.00);
        Desenvolvedor dev9 = new DesenvolvedorPleno("eduardo", 2500.00);
        Desenvolvedor dev10 = new DesenvolvedorPleno("roberta", 2500.00);
        Desenvolvedor dev11 = new DesenvolvedorPleno("bruno", 2500.00);
        Desenvolvedor dev12 = new DesenvolvedorPleno("carolina", 2500.00);
        Desenvolvedor dev13 = new DesenvolvedorJunior("camila", 1800.00);
        Desenvolvedor dev14 = new DesenvolvedorJunior("rafael", 1800.00);
        Desenvolvedor dev15 = new DesenvolvedorJunior("amanda", 1800.00);
        Desenvolvedor dev16 = new DesenvolvedorJunior("daniel", 1800.00);
        Desenvolvedor dev17 = new DesenvolvedorJunior("lucas", 1800.00);
        Desenvolvedor dev18 = new DesenvolvedorJunior("marcelo", 1800.00);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(ger1);
        funcionarios.add(ger2);
        funcionarios.add(dev1);
        funcionarios.add(dev2);
        funcionarios.add(dev3);
        funcionarios.add(dev4);
        funcionarios.add(dev5);
        funcionarios.add(dev6);
        funcionarios.add(dev7);
        funcionarios.add(dev8);
        funcionarios.add(dev9);
        funcionarios.add(dev10);
        funcionarios.add(dev11);
        funcionarios.add(dev12);
        funcionarios.add(dev13);
        funcionarios.add(dev14);
        funcionarios.add(dev15);
        funcionarios.add(dev16);
        funcionarios.add(dev17);
        funcionarios.add(dev18);

        funcionarios.forEach(f -> {
            folha_com_bonus += f.getSalario() + f.getBonus();
        });
        System.out.println("Folha de pagamento com bonus: " + folha_com_bonus); // com bonus

        funcionarios.forEach(f -> {
            folha_sem_bonus += f.getSalario();
        });
        System.out.println("Folha de pagamento sem bonus: " + folha_sem_bonus); // sem

        System.out.print("\nSalário bruto");
        funcionarios.forEach(f -> {
            double salarioBruto = f.getSalario() + f.getBonus();
            System.out.println("\nfuncionario: " + f.getNome());
            System.out.println("salario= " + f.getSalario());
            System.out.println("bonus= " + f.getBonus());
            System.out.println("salario bruto= " + salarioBruto);
        });

// Reajuste de 5%
        cinco_porcento = 0.0;
        funcionarios.forEach(f -> {
            double salarioReajustado = f.getSalario() + (f.getSalario() * 0.05);
            f.setSalario(salarioReajustado);
            cinco_porcento += salarioReajustado + f.getBonus();
        });
        System.out.println("\nCom reajuste de 5%: " + cinco_porcento);
    }
}
