package com.company;

public class Arena {

    public void fight(Dragon dragon1, Dragon dragon2) {
        int rounds = 0;
        double healthdragon1 = dragon1.getHealth();
        double healthdragon2 = dragon2.getHealth();

        while (healthdragon1 > 0 && healthdragon2 > 0 && rounds < 10) {
            rounds++;
            healthdragon1 = healthdragon1 - dragon1.getDefenseDragon1(dragon1, dragon2);
            healthdragon2 = healthdragon2 - dragon2.getDefenseDragon2(dragon1, dragon2);
        }
            if (healthdragon1 <= 0)
            {
                System.out.println("Выиграл" + dragon2.getName() + " погиб " + dragon1.getName() + " в " + rounds + "раунде.");}

             else if (healthdragon2 <= 0)
            {
                System.out.println("Выиграл" + dragon1.getName() + " погиб " + dragon2.getName() + " в " + rounds + "раунде.");}

             else if (healthdragon1 < 0 && healthdragon2 < 0)
                {
                    System.out.println("Погибли оба дракона.");}

            else if (rounds >= 10 && healthdragon1 > healthdragon2)
            {
                    System.out.println("В 10 раунде выиграл" + dragon1.getName() ); }

                   else
                {
                    System.out.println("В 10 раунде выиграл" + dragon2.getName());}

        }







}
