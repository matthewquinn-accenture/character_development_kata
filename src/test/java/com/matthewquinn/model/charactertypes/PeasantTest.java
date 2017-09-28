package com.matthewquinn.model.charactertypes;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeasantTest {

    private Peasant player1;
    private Peasant player2;

    @Before
    public void setUpPlayers() throws Exception {
        player1 = buildPlayers("Matthew");
        player2 = buildPlayers("Elaine");
    }

    @Test
    public void shouldHaveAttackOf3() {
        player1.attack(player2);

        Assert.assertEquals(97, player2.getHealth(), 0);
    }

    @Test
    public void shouldHaveHealOf20() {
        player1.setHealth(75);
        player1.heal();

        Assert.assertEquals(95, player1.getHealth(), 0);
    }

    private Peasant buildPlayers(String name) {
        return new Peasant(name);
    }
}
