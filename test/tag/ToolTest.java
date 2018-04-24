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
public class ToolTest {
    
    @Test
    public void testUseTool() {
        //arraange
        Item item = new Tool("", "",20);
        Player player = new Player("", 0, 20);
        int expectedExpResult = 40;
        //Act
        item.use(player);
        //Assert
        assertEquals(expectedExpResult, player.getExperience());
        
    }
}
