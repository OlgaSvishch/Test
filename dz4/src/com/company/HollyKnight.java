package com.company;

public class HollyKnight extends Knight {

    public double konst;

    public HollyKnight(String name, int health, int attack, double defense, float shild, double konst) {
        super(name, health, attack, defense, shild);
        this.konst = konst;
    }

        @Override
        public double takeDamage(ArenaFighter arenaFighter1, ArenaFighter arenaFighter2) {
            if (random.nextGaussian() > 0.5){
                currenthealth  = arenaFighter1.health - arenaFighter2.attack * arenaFighter1.defense;
                currenthealth = currenthealth + konst;}
            else currenthealth = arenaFighter1.health;
            return currenthealth;

    }


}
