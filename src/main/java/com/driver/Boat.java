package com.driver;

public class Boat implements WaterVehicle{

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int capacity;
    public Boat(String name, int cap){
        setName(name);
        setCapacity(cap);
    }
    @Override
    public String getVehicleName() {
        return getName();
    }

    @Override
    public int getVehicleCapacity() {
        return getCapacity();
    }
}
