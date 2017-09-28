package com.matthewquinn.model.basecharacter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DndCharacterTest {

    private DndCharacter player1;
    private DndCharacter player2;

    @Before
    public void setUpPlayers() throws Exception {
        player1 = buildDnDCharacter("Matthew");
        player2 = buildDnDCharacter("Elaine");
    }

    @Test
    public void shouldDisplayCharacterNameAndFullHealth() {
        Assert.assertEquals("Name: Matthew, Health: 100", player1.display());
    }

    @Test
    public void shouldDisplayCharacterWithOneHealth()  {
        player1.setHealth(1);
        Assert.assertEquals("Name: Matthew, Health: 1", player1.display());
    }

    private DndCharacter buildDnDCharacter(String name) {
        return new DndCharacter(name);
    }

}
