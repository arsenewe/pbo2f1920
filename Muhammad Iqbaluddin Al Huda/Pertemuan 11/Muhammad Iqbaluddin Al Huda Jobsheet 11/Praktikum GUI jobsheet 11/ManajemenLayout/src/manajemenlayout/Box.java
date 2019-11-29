/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manajemenlayout;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author IQBAL
 */
public class Box extends JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGT = 200;
    private JPanel panel;

    public Box() {
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));

        add(panel);
        setSize(FRAME_WIDTH, FRAME_HEIGT);
        setTitle("Grid Layout Demo");
    }
}
