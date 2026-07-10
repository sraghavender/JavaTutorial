package com.raghavender.basics.enums;

enum Coffee {
    ESPRESSO(1),
    CAPPUCCINO(2),
    AMERICANO(3),
    LATTE(4),
    FLATWHITE(5),
    MACCHIATO(6),
    MOCHA(7);

    final int levelOfDeliciousness;

    Coffee(int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;


    }

    public int getLevelOfDeliciousness() {
        return levelOfDeliciousness;
    }
}

public class EnumDemo1 {

    public static void main(String[] args) {

        Coffee coffee = Coffee.CAPPUCCINO;
        System.out.println("My drink is " + coffee);
        System.out.println("The level of deliciousness of coffee is " + coffee.getLevelOfDeliciousness());

    }
}
