package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        // return the name
    }

    @Override
    public int getVehicleCapacity() {
        // return the capacity
    }
}
