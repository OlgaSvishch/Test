package com.company;

public class Main {

    public static void main(String[] args) {

	Dragon dragon = new Dragon("dragon1", 3000, 100, 0.2, 0b0111);
	Dragon dragon2 = new Dragon("dragon2", 2500, 150, 0.15, 0b0011);
	Dragon dragon3 = new Dragon ("dragon3", 3500, 120,0.3, 0b1110);
	Knight knight = new Knight("knight1", 2500, 120,0.3,10);
	HollyKnight hollyKnight = new HollyKnight("HollyKnight", 3000, 130, 0.2, 7, 200);
	DarkKnight darkKnight = new DarkKnight("DarkKnight", 2500, 135, 0.4, 5);
	Arena arena = new Arena();
	arena.fight(dragon, knight);
	arena.fight(dragon2,hollyKnight);
	arena.fight(dragon3, darkKnight);
	arena.fight(hollyKnight, darkKnight);
	arena.fight(knight, hollyKnight);
    }
}
