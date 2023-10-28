package model;

public class Cachorro extends Animal {

    public Cachorro() {
    }

    public Cachorro(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.print("\ncachorro desenhado.");
    }

    @Override
    public String toString() {
        return "\ncachorro x=" + x + " \ny=" + y + "]";
    }

}

