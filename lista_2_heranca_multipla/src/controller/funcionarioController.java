package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class funcionarioController {
    public static void main(String[] args) {
        //1.a
        Desenvolvedor dev1 = new Desenvolvedor("julia", 9000);
        Desenvolvedor dev2 = new Desenvolvedor("nataly", 10000);
        Desenvolvedor dev3 = new Desenvolvedor("mel", 8000);
        Desenvolvedor dev4 = new Desenvolvedor("fred", 7000);
        Desenvolvedor dev5 = new Desenvolvedor("bolt", 6000);
        Desenvolvedor dev6 = new Desenvolvedor("camila", 5000);
        System.out.print(dev1 + "," +  dev2 + "," + dev3 + "," + dev4 + "," + dev5 + "," + dev6);

        Gerente ger1 = new Gerente("billie", 3000, "a1", 100);
        Gerente ger2 = new Gerente("shawn", 3100, "a2", 200);
        Gerente ger3 = new Gerente("ariana", 3200, "a3", 300);
        Gerente ger4 = new Gerente("rihanna", 3300, "a4", 400);
        Gerente ger5 = new Gerente("beyonce", 3400, "a5", 500);
        Gerente ger6 = new Gerente("harry", 3500, "a6", 600);

        Cliente c1 = new Cliente("nicki", "minaj", "b1", 700);
        Cliente c2 = new Cliente("kanye", "west", "b2", 800);
        Cliente c3 = new Cliente("frank", "ocean", "b3", 900);
        Cliente c4 = new Cliente("tyler", "okonma", "b4", 1000);
        Cliente c5 = new Cliente("kendrick", "lamar", "b5", 1100);
        Cliente c6 = new Cliente("tupac", "shakur", "b6", 1200);

        //1.b
        List <Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(dev1);
        funcionarios.add(dev2);
        funcionarios.add(dev3);
        funcionarios.add(dev4);
        funcionarios.add(dev5);
        funcionarios.add(dev6);
        funcionarios.add(ger1);
        funcionarios.add(ger2);
        funcionarios.add(ger3);
        funcionarios.add(ger4);
        funcionarios.add(ger5);
        funcionarios.add(ger6);

        System.out.println(funcionarios);

        List <Investidor> investidores = new ArrayList<>();
        investidores.add(c1);
        investidores.add(c2);
        investidores.add(c3);
        investidores.add(c4);
        investidores.add(c5);
        investidores.add(c6);
        investidores.add(ger1);
        investidores.add(ger2);
        investidores.add(ger3);
        investidores.add(ger4);
        investidores.add(ger5);
        investidores.add(ger6);

        //1.c
        funcionarios.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println("Funcionarios ordem decrescente salário: " + funcionarios);

        investidores.sort(Comparator.comparing(Investidor::getQuantidade).reversed());
        System.out.println("Quantidade de ações dos clientes: ");
        investidores.forEach(i -> {
            if(i instanceof Cliente) {
                System.out.print(i);
            }
        });

        System.out.println("Investidores: " + investidores);

        // 1.d
        System.out.print("\nmaior salário: ");
        Funcionario fmaior_salario = Collections.max(funcionarios, Comparator.comparing(Funcionario::getSalario));
        funcionarios.forEach(f -> {
            if(f.getSalario() >= fmaior_salario.getSalario()) {
                System.out.print(f);
            }
        });
        System.out.print("\nmaior quantidade de ações: ");
        Investidor maior_qntd_acoes = Collections.max(investidores, Comparator.comparing(Investidor::getQuantidade));
        investidores.forEach(i -> {
            if(i.getQuantidade() >= maior_qntd_acoes.getQuantidade()) {
                System.out.print(i);
            }
        });
    }
}