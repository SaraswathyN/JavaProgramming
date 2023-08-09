                       //Handling Mouse Event
 
import java.applet.*;
import java.awt.*;
public class events extends Applet implements MouseListener ,MouseMotionListener{
int x,y;
String s;
public void init(){
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent g)
{
setBackground(Color.orange);
s="mouse clicked";
repaint();
}
public void mousePressed(MouseEvent g)
{
setBackground(Color.gray);
x=g.getX();
y=g.getY( );
s="pressing";
repaint();
}
public void mouseReleased(MouseEvent g)
{
setBackground(Color.green);
s="released";
repaint();
}
public void mouseMoved(MouseEvent g)
{
setBackground(Color.cyan);
x=g.getX();
y=g.getY( );
s="*";
showStatus("Mouse moving at "  +x+ "," +y );
repaint();
}
public void mouseDragged(MouseEvent g)
{
setBackground(Color.yellow);
x=g.getX();
y=g.getY( );
s="dragging";
showStatus("Dragging mouse at "  +x+ "," +y );}
public void mouseEntered(MouseEvent g)
{
setBackground(Color.blue);
s="mouse entered";
repaint();}
public void mouseExited(MouseEvent g){
setBackground(Color.white);
s="mouse exited";
repaint();}
public void paint(Graphics a){
a.drawString(s,x,y);
}}
/*<applet code="events.java"  width="500" height="500" > </applet>*/
