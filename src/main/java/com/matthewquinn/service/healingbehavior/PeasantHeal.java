package com.matthewquinn.service.healingbehavior;


import com.matthewquinn.service.basebehavior.HealBehavior;

public class PeasantHeal implements HealBehavior {
    @Override
    public Integer heal() {
        return 20;
    }
}
