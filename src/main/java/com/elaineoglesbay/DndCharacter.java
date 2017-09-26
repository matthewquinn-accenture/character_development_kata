package com.elaineoglesbay;

/**
 * Created by elaineoglesbay on 9/26/17.
 */
public class DndCharacter {
    private String name;
    private String health;

    public DndCharacter(String name) {
        this.name = name;
        this.health = "100";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String display() {
        return "Name: " + name + ", Health: " + health;
    }
}
