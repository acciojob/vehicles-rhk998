package com.driver;

public class boat implements WaterVehicle {
    private String name;
    private int capacity;

    public boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        // return the name
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
