
import javax.swing.*;

public class UseRectPanel {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setTitle("A Panel with a Rectangle");
         AnimatedRectangle panel = new AnimatedRectangle();
        
         frame.add(panel);
        frame.setVisible(true);

    }
    
    
}
