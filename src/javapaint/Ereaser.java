/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapaint;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author pedrecal
 */
public class Ereaser extends Desenho
{
    int x;
    int y;
    JPanel panel;
    
    public Ereaser(int x, int y, JPanel panel)
    {
        this.panel = panel;
        panel.repaint(x, y, 40, 40);
        this.x = x;
        this.y = y;
    }
    
    public void Desenha()
    {
        panel.repaint(x, y, 40, 40);
    }
}
