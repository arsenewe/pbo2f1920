/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogui;

/**
 *
 * @author USER
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGui extends JFrame{
    private static final int FRAME_WIDHT = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JPanel panel;
    
    public HelloGui(){
        createTextField();
        createButton();
        createPanel();
        int FRAME_WIDTH;
        setSize(FRAME_WIDHT, FRAME_WIDHT);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame;
        frame = new HelloGui();
                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//program akan berheti jika ditutup
                            frame.setSize(600, 300);//lebar,tinggi windows
                            frame.setLocation(200,200);//x,y tampilan pada windows
                           //frame.setLocatonRelative(null);//menempatkan frame ditengah-tengah layar
                            frame.setVisible(true);// untuk menampilkan frame
    }

    private void createTextField() {
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai C: ");
        cLabel = new JLabel("Hasil: ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText ("0");
    }

    private void createButton() {
        button = new JButton("Calculate");//untuk membuat tombol "Calculate"
        class AddInterestListener implements ActionListener{
               //untuk event klik
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(aField.getText());//mengambil inputan textbox
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil: " + c);
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
    

