package com;

/**
 * Created by isa on 3/24/15.
 */
public class Automobile {

    private AutomobileType type;
    private Integer numberOfWheels;

    public Automobile() {
    }

    public Automobile(AutomobileType type, Integer numberOfWheels) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    public AutomobileType getType() {
        return type;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setType(AutomobileType type) {
        this.type = type;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}