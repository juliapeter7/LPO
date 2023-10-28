package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class JogoController {
    public static void main(String[] args) {
        //1.a
        Peixe p1 = new Peixe(1.0, 1.0);
        Peixe p2 = new Peixe(1.0, 1.0);
        Peixe p3 = new Peixe(1.0, 1.0);
        Cachorro c1 = new Cachorro(2.0, 2.0);
        Cachorro c2 = new Cachorro(2.0, 2.0);
        Cachorro c3 = new Cachorro(2.0, 2.0);
        Passaro pas1 = new Passaro(3.0, 3.0);
        Passaro pas2 = new Passaro(3.0, 3.0);
        Passaro pas3 = new Passaro(3.0, 3.0);
        List<Animal> animais = new ArrayList<>();
        animais.add(p1);
        animais.add(p2);
        animais.add(p3);
        animais.add(c1);
        animais.add(c2);
        animais.add(c3);
        animais.add(pas1);
        animais.add(pas2);
        animais.add(pas3);
        System.out.print("(lista:");
        System.out.println(animais);

        //1.b
        System.out.print("\nmovidos para a coordenada x=2.0 e y=2.0");
        animais.forEach(a -> {
            a.mover(2.0, 2.0);
            a.desenhar();
            System.out.print(a);
        });

        //c
        System.out.print("\nmembros da classe cachorro movidos para a coordenada x=8.0 e y=8.0");
        animais.forEach(a -> {
            if(a instanceof Cachorro) {
                a.mover(8.0, 8.0);
                a.desenhar();
                System.out.print(a);
            }
        });

        //d
        System.out.print("\nmembros da classe Peixe e Passaro movidos para a coordenada x=5.0, y=5.0, z=5.0");
        animais.forEach(a -> {
            if(a instanceof Peixe) {
                ((Peixe) a).mover(5.0, 5.0, 5.0);
                a.desenhar();
                System.out.print(a);
            } else if(a instanceof Passaro) {
                if(a instanceof Passaro) {
                    ((Passaro) a).mover(5.0, 5.0, 5.0);
                    a.desenhar();
                    System.out.print(a);
                }
            }
        });

    }
}
