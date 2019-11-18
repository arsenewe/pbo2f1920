
package hellogui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGui extends JFrame{
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
    
    public HelloGui(){
        createTextField();
        createButton();
        createButtonPlus();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_WIDTH);
    }
    
    public static void main(String[] args) {
        JFrame frame = new HelloGui();
       
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// program akan berhenti jika ditutup
            frame.setSize(600, 300);//lebar dan tinggi widows
            frame.setLocation(200, 200);//x,y tampilan windows
            
            frame.setVisible(true);// untuk menampilkan frame
    }

    private void createTextField() {
        aLabel = new JLabel("Nilai A : ");
        bLabel = new JLabel("Nilai B : ");
        cLabel = new JLabel("");
        dLabel = new JLabel("");
        
        
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
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a*b;
                cLabel.setText("Hasil perkalian : "+c);
            }
        }
        
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
     }
    
    private void createButtonPlus() {
        button1 = new JButton("Penjumlahan");
        class AddInterestListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a+b;
                dLabel.setText("Hasil penjumlahan : "+c);
            }
        }
        
        ActionListener listener = new AddInterestListener();
        button1.addActionListener(listener);
     }
    

    private void createPanel() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(button1);
        panel.add(cLabel);
        panel.add(dLabel);
        add(panel);
        
    }
    
}
