                  //Handling Keyboard Event

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class events1 extends Applet implements KeyListener
{
String msg;
int x,y;
public void init( ) 
{
addKeyListener(this);
}
public void keyPressed(KeyEvent g)
{
setBackground(Color.gray);
msg="key pressed";
repaint();
}
public void keyTyped(KeyEvent g)
{
setBackground(Color.yellow);
msg="key typed";
msg=(g.getKeyChar()+" is typed");
repaint();
}
public void keyReleased(KeyEvent g)
{
setBackground(Color.cyan);
msg="key released";
msg=(g.getKeyChar()+" is released");
repaint();
}
public void paint(Graphics l)
{
l.drawString(msg,20,40);
}}
/*<applet code="events1.java" width=400 height=600></applet>*/
