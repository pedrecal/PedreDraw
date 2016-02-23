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
public class FreeHand extends Desenho
{
    int x;
    int y;
    Graphics t;
    
    public FreeHand(int x, int y, Graphics t, Color c)
    {
        this.t = t;
        this.t.setColor(c);
        this.x = x;
        this.y = y;
        System.out.println(x);
        System.out.println(y);
    }
    
    public void Desenha()
    {
        t.drawLine(x, y, x+1, y+1);
    }
}
