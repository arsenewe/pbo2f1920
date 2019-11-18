/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author A S U S
 */
public class MyInputForm extends JFrame{
    private static final int FRAME_WIDTH = 600, FRAME_HEIGHT=200;
    private JLabel aLabel, bLabel, cLabel;
    private JTextField aField, bField;
    private JButton button, button2;
    private JPanel panel;

    public MyInputForm() {
        createTextField();
        createButton();
        createButton2();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_WIDTH);
    }
    
    private void createTextField(){
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai C: ");
        cLabel = new JLabel("Hasil: ");
        
        final int FIELD_WIDTH=10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }
    
    private void createButton(){
        button = new JButton("Calculate");
        class AddInterestListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil: "+c);
            }
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }
    
    private void createButton2(){
        button2 = new JButton("Sum");
        class AddInterestListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a + b;
                cLabel.setText("Hasil: "+c);
            }
        }
        ActionListener listener = new AddInterestListener();
        button2.addActionListener(listener);
    }
    
    private void createPanel(){
        panel=new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(button2);
        panel.add(cLabel);
        add(panel);
    }
    
    public static void main(String args[]){
        JFrame frame = new MyInputForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
