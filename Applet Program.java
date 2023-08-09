
                                             //Applet Program
import java.awt.*;
import java.applet.*;
public class cat extends Applet{
public void paint(Graphics s){
s.drawOval(60,60,200,200);
s.setColor(Color.black);
s.fillOval(90,120,50,20);
s.fillOval(190,120,50,20);
s.setColor(Color. orange);
s.drawOval(60,257,215,210);
s.fillOval(60,257,215,210);
s.setColor(Color. blue);
s.drawLine(165,144,165,175);
s.setColor(Color.pink);
s.drawArc(110,130,95,95,0,-180);
s.setColor(Color.red);
s.drawOval(22,22,77,77);
s.drawOval(222,27,77,77);
s.fillOval(222,27,77,77);
s.fillOval(22,22,79,79);
s.setColor(Color.cyan);
s.drawOval(154,154,22,25);
s.fillOval(154,154,22,25);
}}
/*<applet code=cat.class  height=500  width=500 > </applet> *
