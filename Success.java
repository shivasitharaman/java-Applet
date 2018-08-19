import javax.swing.*;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Point;
import java.util.Random;
import java.awt.*;
import java.awt.geom.*;
public class Success extends JFrame{
	int width=500;
    int height=500;

	 public Success(){
	        JPanel panel=new JPanel();
	        getContentPane().add(panel);
	        setSize(450,450);

	        JButton button =new JButton("press");
	        panel.add(button);
	        setSize(width,height);
	          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          setResizable(false);
	          setLocationRelativeTo(null);
	          setVisible(true);
	    }

	    public void paint(Graphics g) {
	        Graphics2D g2 = (Graphics2D) g;
	        Line2D lin = new Line2D.Float(100, 100, 250, 260);
	        g2.draw(lin);
	        drawCircleByCenter(g, width/2, height/2, width/2);
	         Random r = new Random();
	         Point center = new Point();
	         center.x=r.nextInt(width/2);
	         center.y=r.nextInt(width/2);
	         drawCircleByCenter(g, center.x, center.y, width/15);
	         g.drawRect (10, 10, 200, 200);
	    }
	    void drawCircleByCenter(Graphics g, int x, int y, int radius){
	         g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
	     }

	    public static void main(String []args){
	    	Success s=new Success();
	        s.setVisible(true);
	    }
}
