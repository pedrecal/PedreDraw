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
public class Ereaser 
{
    public Ereaser(int x, int y, JPanel panel)
    {
        panel.repaint(x, y, 40, 40);
    }
}
