package org.example.model;

public class Troll extends Monster implements Bleedable,Poisonable{

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed() + getDamage()*poison();
    }


    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @Override
    public double bleed(int level) {
        return 0;
    }

    @Override
    public double poison() {
        return getDamage()*0.3;
    }
}
