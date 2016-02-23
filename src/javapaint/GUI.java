/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javafx.scene.input.MouseDragEvent;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

/**
 *
 * @author pedrecal
 */
public class GUI extends javax.swing.JFrame {

    int mouseX, mouseY;
    int mouseX_released, mouseY_released;
    int mouseX_dragged, mouseY_dragged;
    int firstX, firstY;
    boolean mouseDragged;
    boolean firstClick;
    JPanel panel;
    Graphics g;
    Color c;
    String tipo;
    
    public GUI() {
        initComponents();
        
        tipo = null;
        firstClick = false;
        
        addMouseListener(myMouseAdapter);
        addMouseMotionListener(myMouseAdapter);
        
        panel = new JPanel();
        panel.setSize(600, 600);
        this.add(panel);
        panel.setVisible(true);
        panel.setBackground(Color.WHITE);
        
        g = panel.getGraphics();
    }
    
    MouseAdapter myMouseAdapter = new MouseAdapter() 
    {
            public void mousePressed(MouseEvent e)
            {
                mouseX = e.getX();
                mouseY = e.getY() - 47;
                mouseDragged = false;
                if (tipo == "free hand")
                    new FreeHand(mouseX, mouseY, g, c);                
                
            }
            
            public void mouseDragged(MouseEvent e)
            {
                mouseX_dragged = e.getX() - 2;
                mouseY_dragged = e.getY() - 46;
                mouseDragged = true;
                
                if (tipo == "free hand")
                    new FreeHand(mouseX_dragged, mouseY_dragged, g, c);
                else if(tipo == "borracha")
                    new Ereaser(mouseX_dragged, mouseY_dragged, panel);
            }
            
            public void mouseReleased(MouseEvent e)
            {
                mouseX_released = e.getX();
                mouseY_released = e.getY() - 47;
                if(mouseDragged)
                {
                    if(tipo == "reta")
                        new Line(mouseX, mouseY, mouseX_released, mouseY_released, g, c);
                    else if(tipo == "retangulo")
                        new Rectangle(mouseX, mouseY, mouseX_released, mouseY_released, g, c);
                    else if(tipo == "elipse")
                        new Elipse(mouseX, mouseY, mouseX_dragged, mouseY_dragged, g, c);
                    else
                        System.out.println("Nenhuma opção selecionada");
                    mouseDragged = false;
                }
            }
    };
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        linhaMenu = new javax.swing.JMenuItem();
        retaMenu = new javax.swing.JMenuItem();
        recMenu = new javax.swing.JMenuItem();
        circMenu = new javax.swing.JMenuItem();
        borrachaMenu = new javax.swing.JMenuItem();
        colorM = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Ferramentas");

        linhaMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        linhaMenu.setText("Linha Livre");
        linhaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linhaMenuActionPerformed(evt);
            }
        });
        jMenu1.add(linhaMenu);

        retaMenu.setText("Reta");
        retaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retaMenuActionPerformed(evt);
            }
        });
        jMenu1.add(retaMenu);

        recMenu.setText("Retangulo");
        recMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recMenuActionPerformed(evt);
            }
        });
        jMenu1.add(recMenu);

        circMenu.setText("Círculo");
        circMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circMenuActionPerformed(evt);
            }
        });
        jMenu1.add(circMenu);

        borrachaMenu.setText("Borracha");
        borrachaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrachaMenuActionPerformed(evt);
            }
        });
        jMenu1.add(borrachaMenu);

        jMenuBar1.add(jMenu1);

        colorM.setText("Editar");

        jMenuItem1.setText("Cor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        colorM.add(jMenuItem1);

        jMenuItem2.setText("Limpar tela");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        colorM.add(jMenuItem2);

        jMenuBar1.add(colorM);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void linhaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linhaMenuActionPerformed
        tipo = "free hand";
    }//GEN-LAST:event_linhaMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        c = JColorChooser.showDialog(rootPane, null, Color.BLACK);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        panel.repaint();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void retaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retaMenuActionPerformed
        tipo = "reta";
    }//GEN-LAST:event_retaMenuActionPerformed

    private void recMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recMenuActionPerformed
        tipo = "retangulo";
    }//GEN-LAST:event_recMenuActionPerformed

    private void circMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circMenuActionPerformed
        tipo = "elipse";
    }//GEN-LAST:event_circMenuActionPerformed

    private void borrachaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrachaMenuActionPerformed
        tipo = "borracha";
    }//GEN-LAST:event_borrachaMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem borrachaMenu;
    private javax.swing.JMenuItem circMenu;
    private javax.swing.JMenu colorM;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem linhaMenu;
    private javax.swing.JMenuItem recMenu;
    private javax.swing.JMenuItem retaMenu;
    // End of variables declaration//GEN-END:variables
}
