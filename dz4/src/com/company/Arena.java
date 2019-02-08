package com.company;

public class Arena {


    public void fight(ArenaFighter arenaFighter1, ArenaFighter arenaFighter2) {
        int rounds = 0;
        double healthfighter1 = arenaFighter1.getHealth();
        double healthfighter2 = arenaFighter2.getHealth();

        while (healthfighter1 > 0 && healthfighter2 > 0 && rounds < 10) {
            rounds++;
             healthfighter1 = arenaFighter1.takeDamage(arenaFighter1, arenaFighter2);
             healthfighter2 = arenaFighter2.takeDamage(arenaFighter1, arenaFighter2);

        }
        if (healthfighter1 <= 0)
        {
            System.out.println("Выиграл" + arenaFighter2.getName() + " погиб " + arenaFighter1.getName() + " в " + rounds + "раунде.");}

        else if (healthfighter2 <= 0)
        {
            System.out.println("Выиграл" + arenaFighter1.getName() + " погиб " + arenaFighter2.getName() + " в " + rounds + "раунде.");}

        else if (healthfighter1 < 0 && healthfighter2 < 0)
        {
            System.out.println("Погибли оба бойца.");}

        else if (rounds >= 10 && healthfighter1 > healthfighter2)
        {
            System.out.println("В 10 раунде выиграл" + arenaFighter1.getName() ); }

        else
        {
            System.out.println("В 10 раунде выиграл" + arenaFighter2.getName());}

    }}