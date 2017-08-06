import java.awt.*;
class Demoframe
{
  Frame f;
  Button b;
  Label l;
  Textfield tf;
  Demoframe(String ...s)
{
  f=newFrame(s);
   l=newLabel("enter the number");
      l.setbounds(40,40,80,20);
    f.add(l);
tf=newTextfield();
tf.setbounds(150,40,50,20);
f.add(tf);
b=newButton("ok");
b.setbounds(40,100,50,50);
f.add(b);
f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);
}
  public static void main(String ...s)
{
  NemDemoframe ("First Frame");
    }
   }

