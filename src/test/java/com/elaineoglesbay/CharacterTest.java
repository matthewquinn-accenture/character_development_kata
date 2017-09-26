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
        character.setHealth("1");
        Assert.assertEquals("Name: Matthew, Health: 1", character.display());
    }
}
