import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.applet;
/*<applet code="Keyevent" width=500 height =200></applet>*/
public class Keyevent extends Applet implements KeyListener {
	char mychar = 'G';
	public void init() {
		addKeyListener(this);
	}
	public void start(){};
	public void stop(){};
	public void destroy(){};
	public void keyTyped(KeyEvent ke) {
		mychar = ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(Character.toString(mychar), 50,50);
	}
}