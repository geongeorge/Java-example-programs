import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;
/*<applet code="Actionevent" width=300 height=200></applet>*/
class Actionevent extends Applet implements ActionListener{
    Button b1;
    Label la1;
    String msg ="";
 public void init() {
    b1 = new Button("Hello");
    la1 = new Label("Not CLicked!");
    add(la1);
    add(b1);
    b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae) {
    msg = "Clicked bruh!";
    repaint();
 }
 public void paint(Graphics g) {
    la1.setText(msg);
 }
}