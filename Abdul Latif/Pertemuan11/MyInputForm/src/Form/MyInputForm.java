/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;
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
    private JButton button;
    private JPanel panel;

    public MyInputForm() {
        createTextField();
        createButton();
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
    
    public void createButton(){
        button = new JButton("Calculate");
        class AddInterestListener implements ActionListener{
            public void actionPermormed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil: "+c);
            }
        }
    }
    
    
}
