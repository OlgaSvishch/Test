package com.company;

abstract class ArenaFighter {
    public String name;
    public int health;
    public int attack;
    public double defense;
    public double currenthealth;

    public ArenaFighter(String name, int health, int attack,
                        double defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;

    }

    public void attackArenaFighter(ArenaFighter arenaFighter) {}


    public double takeDamage(ArenaFighter arenaFighter1, ArenaFighter arenaFighter2) {return currenthealth;}


    public int getAttack() {return attack;}

    public String getName() {
        return name;
    }

    public float getHealth() {
        return health;
    }
}


