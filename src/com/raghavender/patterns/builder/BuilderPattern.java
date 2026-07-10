package com.raghavender.patterns.builder;

public class BuilderPattern {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("Seagate","Kingston").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();

        System.out.println(computer);
    }
}
