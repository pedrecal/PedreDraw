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
public class Line extends Desenho
{
    int x;
    int y;
    int x1;
    int y1;
    Graphics t;
    
    public Line(int x, int y, int x1, int y1, Graphics t, Color c)
    {
        this.t = t;
        this.t.setColor(c);
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
        System.out.println(x1);
        System.out.println(y1);
    }
    
    public void Desenha()
    {
        t.drawLine(x, y, x1, y1);
    }
}
