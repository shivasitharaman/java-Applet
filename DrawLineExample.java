import java.applet.Applet;
import java.awt.*;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
public class DrawLineExample extends Applet{
     	    
	public void paint(Graphics g) {
		
	    g.fillRoundRect(20,110,60,30,5,5);
		g.drawLine(10,50,10,100);
		g.setColor(Color.red);
		g.fillRect(60,10,30,80);
        g.setColor(Color.green);
        g.setColor(Color.blue);
        g.fillOval(360,25,100,100);
        g.drawArc(100, 30, 80, 80, 0, 180);
        g.fillArc(100, 30, 80, 80, 0, 180);
        g.setColor(Color.orange);
        g.drawRect(100,100,50,50);
        g.fillRect(100,100,50,50);
	}
}
