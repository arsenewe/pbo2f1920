package hellogui;
  
import javax.swing.*;
public class HelloGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //JFrame frame;
        JFrame MyInputFrom;
    //frame = new JFrame(" ini percobaan HelloHui Frame"); 
        JFrame frame = new MyInputFrom();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//program akan berhenti jika ditutup
        //frame.setSize(600, 300); //lebar, tinggi windows
        //frame.setLocation(200, 200); //x,y tampilan pada windows 
        //frame.setLocationRelationRelativeTo(null); //menempatkan frame ditengah" layar
        frame.setVisible(true); //untuk menampilkan frame
        frame.setLocationRelativeTo(null);       
    }
    
}
