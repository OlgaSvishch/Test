package com.company;
import java.util.Random;

public class Knight extends ArenaFighter{

        float shild;
        Random random;

        public Knight(String name, int health, int attack, double defense, float shild) {
            super(name, health, attack, defense);
            this.shild = shild;
            random = new Random();
        }


    @Override
    public void attackArenaFighter(ArenaFighter arenaFighter)
    {
        int attack = arenaFighter.getAttack ();
    }

        @Override
        public double takeDamage(ArenaFighter arenaFighter1, ArenaFighter arenaFighter2) {
            if (random.nextGaussian() > 0.5)
            currenthealth  = arenaFighter1.health - arenaFighter2.attack * arenaFighter1.defense;
            else currenthealth = arenaFighter1.health;
            return currenthealth;
        }
}
