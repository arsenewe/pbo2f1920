package ManajemenLayout;
import javax.swing.JFrame;
public class LayoutGui {
    public static void main(String debby[]) {
        JFrame frame = new Border();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JFrame frame2 = new Grid();
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
        
        JFrame frame3 = new Box();
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setVisible(true);
    }
}