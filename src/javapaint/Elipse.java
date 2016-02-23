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
public class Elipse 
{
    public Elipse(int x0, int y0, int x1, int y1, Graphics t, Color c)
    {
        
        
        
            int x, y;
            int w, h;
            
            if(x0 > x1)
            {
                x = x1;
                w = x0 - x1;
            }
            else
            {
                x = x0;
                w = x1 - x0;
            }
            if (y0 > y1)
            {
                y = y1;
                h = y0 - y1;
            }
            else
            {
                y = y0;
                h = y1 - y0;
            }
            t.setColor(c);
            t.drawOval(x, y, w, h);
    }
}
