package ManajemenLayout;;
import javax.swing.JFrame;

/**
 *
 * @author Windows
 */
public class LayoutGUI {
    public static void main(String debby[]) {
        JFrame frame = new Border();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JFrame frame2 = new Grid();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JFrame frame3 = new Box();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
       
    }
}