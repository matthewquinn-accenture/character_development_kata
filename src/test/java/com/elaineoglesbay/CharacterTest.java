package com.elaineoglesbay;

import org.junit.Assert;
import org.junit.Test;

import javax.crypto.AEADBadTagException;

/**
 * Created by elaineoglesbay on 9/26/17.
 */
public class CharacterTest {
    @Test
    public void shouldDisplayCharacterNameAndFullHealth() {
        DndCharacter character = new DndCharacter("Matthew");
        Assert.assertEquals("Name: Matthew, Health: 100", character.display());
    }

    @Test
    public void shouldDisplayCharacterWithOneHealth()  {
        DndCharacter character = new DndCharacter("Matthew");
        character.setHealth(1);
        Assert.assertEquals("Name: Matthew, Health: 1", character.display());
    }

    @Test
    public void shouldAttackOpponent() {
        DndCharacter character1 = new DndCharacter("Elaine");
        DndCharacter character2 = new DndCharacter("Matthew");
        character1.attack(character2);
        Assert.assertEquals(95, character2.getHealth(),0);
    }
    @Test
    public void shouldAttackOpponentTwice() {
        DndCharacter character1 = new DndCharacter("Elaine");
        DndCharacter character2 = new DndCharacter("Matthew");
        character1.attack(character2);
        character1.attack(character2);
        Assert.assertEquals(90, character2.getHealth(), 0);
    }
}
