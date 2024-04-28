package com.driver;

public class Boat implements WaterVehicle{

    String name;
    int capacity;
    public Boat(String name, int cap){
        this.name = name;
        this.capacity = cap;
    }
    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}
