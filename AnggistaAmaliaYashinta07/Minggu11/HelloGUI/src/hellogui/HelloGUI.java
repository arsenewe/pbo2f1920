package hellogui;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class HelloGUI extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 400;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JLabel dLabel;
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
     private void createTextField() {
        aLabel = new JLabel("Nilai A:");
        bLabel = new JLabel("Nilai C:");
        cLabel = new JLabel("Hasil x :");
        dLabel = new JLabel("Hasil + : ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    private void createButton() {
            button = new JButton("Perkalian");
            class AddInterestListener implements ActionListener{
                @Override
                public void actionPerformed(ActionEvent event){
                    int a = Integer.valueOf(aField.getText());
                    int b = Integer.valueOf(bField.getText());
                    int c = a*b;
                    
                    cLabel.setText("Hasil : "+c);
                    
                }
            }
            ActionListener listener = new AddInterestListener();
            button.addActionListener(listener);
    }
    private void createButton1() {
            button = new JButton("Penjumlahan");
            class AddInterestListener implements ActionListener{
                @Override
                public void actionPerformed(ActionEvent event){
                    int a = Integer.valueOf(aField.getText());
                    int b = Integer.valueOf(bField.getText());
                   
                    int d = a+b;
                   
                    dLabel.setText("Hasli + :"+d);
                }
            }
            ActionListener listener = new AddInterestListener();
            button.addActionListener(listener);
    }

    private void createPanel() {
            panel= new JPanel();
            panel.add(aLabel);
            panel.add(aField);
            panel.add(bLabel);
            panel.add(bField);
            panel.add(button);
            panel.add(cLabel);
            panel.add(dLabel);
            add(panel);
    }
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
  
        JFrame frame = new HelloGUI();
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);
                        
    }
   
    
}
