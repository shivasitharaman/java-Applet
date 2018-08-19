import java.awt.*;
import java.applet.*;
public class image extends Applet{

	Image picture;
	
	public void init() {
		picture=getImage(getDocumentBase(),"bharath.jpg");
	}
	
	public void paint(Graphics g) {
		g.drawImage(picture,30,30,this);
	}
}
