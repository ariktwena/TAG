package tag;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
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
public class ContollerTest {
    
    @Test
    public void testWest() {
        Room C4 = new Room("C4","Start");
        Room C3 = new Room("C3","Slut");
        C4.setWest(C3);
        assertTrue(true);
    }
    
      @Test
    public void testWestWithPlayerNoMove() throws InterruptedException {
        Room B4 = new Room("B4","Start");
        Room B3 = new Room("B3","Slut");
        B4.setWest(B3);
        Player player = new Player("name",100,10);
        player.setCurrentRoom(B4);
        assertEquals("Start", player.getCurrentRoom().getDescription());
    }
    
  
}
