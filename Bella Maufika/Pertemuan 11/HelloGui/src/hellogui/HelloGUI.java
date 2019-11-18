/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogui;

/**
 *
 * @author bella
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HelloGUI extends JFrame {
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGTH = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JPanel panel;        
    
    public HelloGUI(){
        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_WIDTH);        
    }
    
    public static void main(String[] args) {
        JFrame frame;
        
        frame = new JFrame("Ini percobaan HelloGUI Frame");
        frame = new HelloGUI();
                            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
                            //frame.setSize(600, 300);
                            //frame.setLocation(200, 200);
                            //frame.setVisible(true);
                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
                            frame.setVisible(true);
                            frame.setLocationRelativeTo(null);
    }

    private void createTextField() {
        aLabel = new JLabel("Nilai A : ");
        bLabel = new JLabel("Nilai C : ");
        cLabel = new JLabel("Hasil : ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
        }
    
    private void createButton(){
        button = new JButton("Calculate");
        class AddInterestListener implements ActionListener{
            //untuk event klik
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a*b;
                cLabel.setText("Hasil : " + c);
                }   
            }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }

    private void createPanel() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(cLabel);
        add(panel);
        }
}

