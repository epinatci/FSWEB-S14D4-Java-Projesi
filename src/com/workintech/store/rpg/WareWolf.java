package com.workintech.store.rpg;

public class WareWolf extends Monster implements Bleedable {

    public WareWolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed() ;
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

}
