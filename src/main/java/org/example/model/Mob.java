package org.example.model;

public class Mob {
    protected String name;

    public Mob(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Привет " + name;
    }
}
