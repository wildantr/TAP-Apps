/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelbg;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author danz
 */
public class panelbg_home extends JPanel {

    private Image img;

    public panelbg_home() {
        img = new ImageIcon(getClass().getResource("/panelbg/ayam.jpg")).getImage();
    }

    @Override
    protected void paintComponent(Graphics grap) {
        super.paintComponent(grap);
        Graphics2D gd = (Graphics2D) grap.create();
        gd.drawImage(img, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }

}
