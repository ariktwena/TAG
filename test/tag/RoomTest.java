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
public class RoomTest {

    @Test
    public void testConectRoomWithSouthRoom() {
        Room startRoom = new Room("startRoom", "Vi starter her");
        Room south = new Room("south", "Vi slutter her");
        startRoom.setSouth(south);
        south.setNorth(startRoom);
        assertEquals("south", startRoom.getSouth().getRoomName());
        //assertEquals("startRoom", south.getNorth().getDescription());

    }
    
     @Test
    public void testConectRoomWithSouthAndThenNorthRoom() {
        Room startRoom = new Room("startRoom", "Vi starter her");
        Room south = new Room("south", "Vi slutter her");
        startRoom.setSouth(south);
        south.setNorth(startRoom);
        //assertEquals("south", startRoom.getSouth().getDescription());
        assertEquals("startRoom", south.getNorth().getRoomName());

    }

}
