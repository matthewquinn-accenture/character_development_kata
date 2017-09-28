package com.matthewquinn.model.charactertypes;


import com.matthewquinn.model.basecharacter.DndCharacter;
import com.matthewquinn.service.attackbehavior.PeasantAttack;
import com.matthewquinn.service.healingbehavior.PeasantHeal;

public class Peasant extends DndCharacter {
    public Peasant(String name) {
        super(name);
        setAttackBehavior(new PeasantAttack());
        setHealBehavior(new PeasantHeal());
    }

    @Override
    public void display() {
        System.out.println("I'm a Peasant!");
    }
}
