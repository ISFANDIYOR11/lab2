package com.company;
import pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Bouffalant p1 = new Bouffalant ("Skot", 3);
        Stunky p2     = new Stunky ("Derec", 1);
        Skuntank p3   = new Skuntank("Stiles",1);
        Oddish p4     = new Oddish ("Leam", 1);
        Gloom p5      = new Gloom ("Lidiya", 2);
        Bellossom p6  = new Bellossom ("Maliya", 3);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}