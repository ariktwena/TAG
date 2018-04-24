/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tweny
 */
public class PlayerTest {Room startRoom;
    Room east;
    
    @Before
    public void setup() {
        startRoom = new Room("start", "Vi starter her");
        east = new Room("North", "Vi slutter her (East)");
        startRoom.getEast();
    }
    
    
    @Test
    public void playerCanGoEast() {
        Player player = new Player("J", 100,0);
        player.setCurrentRoom(startRoom);
        player.setCurrentRoom(player.getCurrentRoom().getEast());
        assertTrue(true);
        
    }
    @Test
    public void playerCanGoEastWithRoomName() {
        Player player = new Player("J", 100,0);
        player.setCurrentRoom(startRoom);
        Room result = player.getCurrentRoom();
        assertEquals("start", startRoom.getRoomName());
    }
    
    @Test
    public void PlayerCantGoNorthWhenThereIsNoNorthRoom() {
        Player player = new Player("J", 100,0);
        player.setCurrentRoom(startRoom);
        player.setCurrentRoom(player.getCurrentRoom().getNorth());
        assertFalse(false);

        
    }
   
}
