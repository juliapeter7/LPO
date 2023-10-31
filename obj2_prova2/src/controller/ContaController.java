package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ContaController {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(100.0, 10, 10.0);
        ContaCorrente cc2 = new ContaCorrente(200.0, 10, 10.0);
        ContaCorrente cc3 = new ContaCorrente(300.0, 10, 10.0);

        ContaPoupanca cp1 = new ContaPoupanca(400);
        ContaPoupanca cp2 = new ContaPoupanca(500);
        ContaPoupanca cp3 = new ContaPoupanca(600);

        Cliente c1 = new Cliente("Ariana Grande", 100, 10.0);
        Cliente c2 = new Cliente("Taylor Swift", 400, 10.0);
        Cliente c3 = new Cliente("Kanye West", 600, 10.0);
        Cliente c4 = new Cliente("Kendrick Lamar", 300, 10.0);
        Cliente c5 = new Cliente("Tyler Okonma", 600, 10.0);
        Cliente c6 = new Cliente("Tupac Shakur", 600, 10.0);

        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);
        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cp3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        List<Conta> contas = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();

        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
        clientes.add(c5);
        clientes.add(c6);

        // 1.b
        System.out.println("\nImprimindo as coleções: ");
        System.out.println(contas);
        System.out.println(clientes);

        // 1.c
        System.out.println("\n Conta antes da movimentação: " + cp1);
        cp1.deposita(1000.0);
        cp1.atualiza(5);
        System.out.println("\n Conta depois da movimentação: " + cp1);

        // 1.d
        System.out.println("\n Conta antes da movimentação: " + cc1);
        cc1.deposita(500.0);
        cc1.saca(400);
        System.out.println("\n Conta depois da movimentação: " + cc1);

        // 1.e
        System.out.println(clientes);

        // 1.f
        clientes.sort(Comparator.comparing(Cliente::getQdeCotas).reversed());
        int maiorNumeroDeCotas = 0;
        for (Cliente cliente : clientes) {
            int numeroDeCotas = cliente.getQdeCotas();
            if (numeroDeCotas > maiorNumeroDeCotas) {
                maiorNumeroDeCotas = numeroDeCotas;
            }
        }
        System.out.println("Associados com o maior número de cotas (" + maiorNumeroDeCotas + "):");
        for (Cliente cliente : clientes) {
            if (cliente.getQdeCotas() == maiorNumeroDeCotas) {
                System.out.println("Nome: " + cliente.getNome() + ", Número de Cotas: " + cliente.getQdeCotas());
            }
        }

        //1.g
        contas.sort(Comparator.comparing(Conta::getSaldo));
        System.out.println(contas);
        System.out.println(clientes);

        double maiorSaldo = 0;
        for (Conta conta : contas) {
            double saldo = conta.getSaldo();
            if (saldo > maiorSaldo) {
                maiorSaldo = saldo;
            }
        }

        System.out.println("Contas com o maior saldo bancário: ");
        for (Conta conta : contas) {
            if (conta.getSaldo() == maiorSaldo) {
                System.out.println("Saldo: " + conta.getSaldo());
            }
        }




    }
}
