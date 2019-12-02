/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helogui;

/**
 *
 * @author hokyt
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class HeloGUI extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JLabel dLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JButton button1;
    private JPanel panel;
    /**
     * @param args the command line arguments
     */
    
    public HeloGUI(){
        createTextField();
        createButton();
        createButton1();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_WIDTH);
    }
    private void createTextField(){
        aLabel = new JLabel("Nilai A : ");
        bLabel = new JLabel("Nilai B : ");
        cLabel = new JLabel("Hasil C : ");
        dLabel = new JLabel("Hasil Penambahan : ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }
    
    private void createButton(){
        button = new JButton("Calculate");
        class AddInterestListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil : " + c);
            }
            
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }
    private void createButton1(){
        button1 = new JButton("Addition");
        class AddInterestListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int d = a + b;
                dLabel.setText("Hasil Penambahan : " + d);
            }
            
        }
        ActionListener listener = new AddInterestListener();
        button1.addActionListener(listener);
    }
    
    private void createPanel(){
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(cLabel);
        panel.add(button1);
        panel.add(dLabel);
        add(panel);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //JFrame frame;
        //frame = new JFrame("Ini percobaan HeloGUI frame");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(600, 300);
//            frame.setLocation(200, 200);
//            frame.setVisible(true);
            
        
        JFrame frame = new HeloGUI();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
            
            
    }
    
}
