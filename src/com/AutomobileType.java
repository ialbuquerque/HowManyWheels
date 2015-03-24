package com;

/**
 * Created by isa on 3/24/15.
 */
public enum AutomobileType {
    AUTOMOBILE_TYPE_CAR("carro"),
    AUTOMOBILE_TYPE_MOTORCYCLE("moto");

    private final String automobileType;

    public String getAutomobileType() {
        return automobileType;
    }

    AutomobileType(String automobileType) {
        this.automobileType = automobileType;
    }
}