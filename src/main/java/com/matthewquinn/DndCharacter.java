package com.matthewquinn;


public class DndCharacter {
    private String name;
    private Integer health;

    public DndCharacter(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public String display() {
        return "Name: " + name + ", Health: " + health.toString();
    }

    public void attack(DndCharacter opponent) {
        opponent.health -= 5;
    }

    public void heal() {
        if ((health + 10) > 100) {
            health = 100;
        } else {
            health += 10;
        }
    }
}
