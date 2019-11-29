/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manajemenlayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author IQBAL
 */
public class Border extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGT = 200;
    private JPanel panel;
    
    public Border(){
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        panel.add(new JButton("1"), BorderLayout.NORTH);
        panel.add(new JButton("2"), BorderLayout.WEST);
        panel.add(new JButton("3"), BorderLayout.CENTER);
        panel.add(new JButton("4"), BorderLayout.EAST);
        panel.add(new JButton("5"), BorderLayout.SOUTH);
        
        add(panel);
        setSize(FRAME_WIDTH, FRAME_HEIGT);
        setTitle("Border Layout Demo");
    }
}
