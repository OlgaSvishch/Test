package com.company;

public class DarkKnight extends Knight {

    public double newcurrenthealth;

    public DarkKnight(String name, int health, int attack, double defense, float shild) {
        super(name, health, attack, defense, shild);
    }

    @Override
    public double takeDamage(ArenaFighter arenaFighter1, ArenaFighter arenaFighter2) {
        if (random.nextGaussian() > 0.5) {
            currenthealth = arenaFighter1.health - arenaFighter2.attack * arenaFighter1.defense;
             newcurrenthealth = currenthealth + currenthealth / 2 ;}
        else newcurrenthealth = arenaFighter1.health;
        return newcurrenthealth;
    }
}
