package com.matthewquinn.model.charactertypes;


import org.junit.Assert;
import org.junit.Test;

public class PeasantTest {

    @Test
    public void shouldHaveAttackOf3() {
        Peasant player1 = new Peasant("Matthew");
        Peasant player2 = new Peasant("Elaine");

        player1.attack(player2);

        Assert.assertEquals(97, player2.getHealth(), 0);
    }
}
