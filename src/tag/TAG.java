/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag;

/**
 *
 * @author Tweny
 */
public class TAG {

    
    public static void main(String[] args) {
        Controller c = new Controller();
        TUI tui = new TUI();
        Room startroom = c.mapGen();
        Player p = c.playerGen(startroom);
        tui.gameStart(p);
        //c.move(p, tui, c);   
        c.askUser(p, tui);
    }
    
}