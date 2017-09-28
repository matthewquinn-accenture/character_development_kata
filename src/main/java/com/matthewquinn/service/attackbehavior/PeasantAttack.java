package com.matthewquinn.service.attackbehavior;


import com.matthewquinn.service.basebehavior.AttackBehavior;

public class PeasantAttack implements AttackBehavior {

    @Override
    public Integer attack() {
        return 3;
    }
}
