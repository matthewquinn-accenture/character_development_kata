package com.matthewquinn.model.charactertypes;


import com.matthewquinn.model.basecharacter.DndCharacter;
import com.matthewquinn.service.attacktypes.PeasantAttack;

public class Peasant extends DndCharacter {
    public Peasant(String name) {
        super(name);
        setAttackBehavior(new PeasantAttack());
    }
}
