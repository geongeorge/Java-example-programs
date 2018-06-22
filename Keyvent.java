import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Keyvent" width=500 height =200></applet>*/
public class Keyvent extends Applet implements KeyListener {
	char mychar = 'G';
	public void init() {
		addKeyListener(this);
	}
	public void keyTyped(KeyEvent e) {
		mychar = e.getKeyChar();
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(Character.toString(mychar), 50,50);
	}
}