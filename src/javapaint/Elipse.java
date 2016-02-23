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
public class Elipse extends Desenho
{
    int x0;
    int y0;
    int x1;
    int y1;
    Graphics t;
    
    public Elipse(int x0, int y0, int x1, int y1, Graphics t, Color c)
    {
        this.t = t;
        this.t.setColor(c);
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }
    
    public void Desenha()
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
            t.drawOval(x, y, w, h);
    }
}
