package com.matthewquinn.model.basecharacter;


import com.matthewquinn.service.basebehavior.AttackBehavior;
import com.matthewquinn.service.basebehavior.HealBehavior;

public class DndCharacter {
    private String name;
    private Integer health;
    private AttackBehavior attackBehavior;
    private HealBehavior healBehavior;

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

    public AttackBehavior getAttackBehavior() {
        return attackBehavior;
    }

    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public HealBehavior getHealBehavior() {
        return healBehavior;
    }

    public void setHealBehavior(HealBehavior healBehavior) {
        this.healBehavior = healBehavior;
    }

    public String display() {
        return "Name: " + name + ", Health: " + health.toString();
    }

    public void attack(DndCharacter opponent) {
        opponent.health -= attackBehavior.attack();
    }

    public void heal() {
        if ((health + healBehavior.heal()) > 100) {
            health = 100;
        } else {
            health += healBehavior.heal();
        }
    }
}
