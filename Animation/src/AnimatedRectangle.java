import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AnimatedRectangle extends JPanel implements ActionListener{
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setTitle("A Panel with a Rectangle");
         AnimatedRectangle panel = new AnimatedRectangle();
        
         frame.add(panel);
        frame.setVisible(true);

    }
    
        private Point p1;// location of the first rectangle
        private Point  p2;// location of the second rectangle
        private int dx;// amount by which to move horizontal
        private int dy;// amount on which to move vertically
         public AnimatedRectangle(){
            p1= new Point(50,50);
            p2= new Point(60,10);
            dx=10;
            dy=10;

            // set up to animate rectangle every 100ms
            Timer time= new Timer(100,this);
            time.start();

         }

         // draws the panel on the screen
         public void paintComponent(Graphics g){
            super.paintComponent(g); // call the JPanel's version
            g.setColor(Color.RED);
            g.fillRect(p1.x,p1.y,70,30);
            g.setColor(Color.BLUE);
            g.fillRect(p2.x,p2.y,20,80);

         }
         // called at regular intervals by timer to redraw the panel
        @Override
        public void actionPerformed(ActionEvent e) {
            p1.x+=dx;
            p2.y+=dy;

            if(p1.x<=0 || p1.x +70 >=getWidth()){
                dx=-dx;// rectangle 1 has hit left/right edge
            }
            if(p2.y<=0 || p2.y + 80 >= getHeight()){
                dy=-dy;// rectangle has hit op/bottom edge\

            }
            repaint();// instruct the panel to redraw again


        }

    }

