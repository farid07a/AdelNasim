/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author faridPC
 */
public class EgyTextField extends JTextField{
        private boolean mouseOver=false;

    public EgyTextField() {
        setBorder(new EmptyBorder(20, 3, 10, 3));
        setSelectionColor(new Color(76, 204, 255));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mouseOver=true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseOver=false;
                        repaint();
            }
        });
        
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                
            }

            @Override
            public void focusLost(FocusEvent e) {
                
            
            }
        });
        
       
        
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2=(Graphics2D) g;
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        int width=getWidth();
        int height= getHeight();
        if (mouseOver) {
            g2.setColor(Color.CYAN);
        }else g2.setColor(new Color(150, 150, 150));
        
        g2.fillRect(0, height-2, width, 1);
        g2.dispose();
        
        
        
    }
        
    
    
}
