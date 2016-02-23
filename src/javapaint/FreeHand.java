/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapaint;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author pedrecal
 */
public class FreeHand 
{
    public FreeHand(int x, int y, Graphics t, Color c)
    {
        t.setColor(c);
        
        t.drawLine(x, y, x+1, y+1);
        System.out.println(x);
        System.out.println(y);
        
    }
}
