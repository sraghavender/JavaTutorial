package com.raghavender.patterns.builder;

public class Computer {
    private String hdd;
    private String ram;
    private Boolean isGraphicsCardEnabled;
    private Boolean isBluetoothEnabled;


    public String getHDD() {
        return this.hdd;
    }

    public String getRam() {
        return this.ram;
    }

    public boolean getIsGraphicsCardEnabled() {
        return this.isGraphicsCardEnabled;
    }

    public boolean getIsRamEnabled() {
        return this.isBluetoothEnabled;
    }

    @Override
    public String toString() {
       return "HDD:"+this.hdd+","+"RAM:"+this.ram+","+"Graphics:"+this.isGraphicsCardEnabled+","+"Bluetooth:"+this.isBluetoothEnabled;
    }

    public Computer(ComputerBuilder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    public static class ComputerBuilder {
        private String hdd;
        private String ram;
        private Boolean isGraphicsCardEnabled;
        private Boolean isBluetoothEnabled;


        public ComputerBuilder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(Boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(Boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);

        }
    }
}
