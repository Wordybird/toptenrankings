package com.example.user.topten;
import org.junit.*;
import static org.junit.Assert.*;

public class PlayerTest {

    Player player;

    @Before
    public void before() {
        player = new Player ("Johnson", "Thunderbolt", 10);
    }

    @Test
    public void getPlayerNameTest() {
        assertEquals("Johnson", player.getName());
    }

    @Test
    public void getPlayerNickNameTest() {
        assertEquals("Thunderbolt", player.getNickName());
    }

    @Test
    public void getPlayerRankingTest() {
        assertEquals(10, player.getRanking());
    }

    @Test
    public void getFullDetailsTest() {
        assertEquals("Name: Johnson, Nickname: Thunderbolt, Ranking: 10", player.getFullDetails());
    }

}
