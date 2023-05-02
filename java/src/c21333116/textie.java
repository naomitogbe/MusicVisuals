package c21333116;

import processing.core.*;
import processing.core.PApplet;

import java.awt.*;
import javax.swing.*;

public class textie extends JPanel {
    private static final String TEXT = "3D Text";
    private static final int FONT_SIZE = 60;
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Set font and color
        Font font = new Font("Arial", Font.BOLD, FONT_SIZE);
        g2d.setFont(font);
        g2d.setColor(Color.BLUE);
        
        // Apply transformations to create 3D effect
        g2d.translate(20, 80);
        g2d.shear(-0.4, 0);
        g2d.scale(1, 1.5);
        
        // Draw text
        g2d.drawString(TEXT, 0, 0);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("3D Text");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        textie panel = new textie();
        frame.add(panel);
        frame.setVisible(true);
    }
}
