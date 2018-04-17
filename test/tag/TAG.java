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
public class TAG {

    @Test
    public void testWest(){
        Room C4 = new Room("C4","Start");
        Room C3 = new Room("C3","Slut");
        C4.setWest(C3);
        Player p = new Player();
        p.setCurrentRoom(C4);
        Controller c = new Controller();
        c.moveNew(p,4);
        assertEquals("Slut", p.getCurrentRoom().getDescription());
    }
    
    @Test
    public void testEast(){
        Room C4 = new Room("C4","Start");
        Room C5 = new Room("C5","Slut");
        C4.setEast(C5);
        Player p = new Player();
        p.setCurrentRoom(C4);
        Controller c = new Controller();
        c.moveNew(p,2);
        assertEquals("Slut", p.getCurrentRoom().getDescription());
    }
    
     @Test
    public void testNorth(){
        Room C4 = new Room("C4","Start");
        Room B4 = new Room("B4","Slut");
        C4.setNorth(B4);
        Player p = new Player();
        p.setCurrentRoom(C4);
        Controller c = new Controller();
        c.moveNew(p,1);
        assertEquals("Slut", p.getCurrentRoom().getDescription());
    }
    
     @Test
    public void testSouth(){
        Room C4 = new Room("C4","Start");
        Room D4 = new Room("D4","Slut");
        C4.setSouth(D4);
        Player p = new Player();
        p.setCurrentRoom(C4);
        Controller c = new Controller();
        c.moveNew(p,3);
        assertEquals("Slut", p.getCurrentRoom().getDescription());
    }
    
    @Test
    public void testNoSouth(){
        Room A2 = new Room("A2","Start");
        Room B2 = new Room("B2","Slut");
        //A2.setSouth(B2);
        Player p = new Player();
        p.setCurrentRoom(A2);
        Controller c = new Controller();
        c.moveNew(p,3);
        assertNull(p.getCurrentRoom());
    }
}
