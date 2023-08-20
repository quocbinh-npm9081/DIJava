package org.example;

import org.example.Interfaces.Engine;

public class MotorBike {
    private String accessory;//phụ tùng
    private Engine engine;

    public MotorBike(String accessory, Engine engine) {
        this.accessory = accessory;
        this.engine = engine;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }



}
