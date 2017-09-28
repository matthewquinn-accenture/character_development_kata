package com.elaineoglesbay;

import org.junit.*;


public class CharacterTest {

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

    @Test
    public void shouldAttackOpponent() {
        player1.attack(player2);
        Assert.assertEquals(95, player2.getHealth(),0);
    }
    @Test
    public void shouldAttackOpponentTwice() {
        player1.attack(player2);
        player1.attack(player2);
        Assert.assertEquals(90, player2.getHealth(), 0);
    }

    @Test
    public void shouldHealSelf() {
        player1.setHealth(50);
        player1.heal();
        Assert.assertEquals(60, player1.getHealth(), 0);
    }

    @Test
    public void shouldNotHealIfAtFullHealth() {
        player1.heal();
        Assert.assertEquals(100, player1.getHealth(), 0);
    }

    @Test
    public void shouldNotHaveHealthOver100() {
        player2.attack(player1);
        player1.heal();
        Assert.assertEquals(100, player1.getHealth(), 0);
    }

    private DndCharacter buildDnDCharacter(String name) {
        return new DndCharacter(name);
    }

}
