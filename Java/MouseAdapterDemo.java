import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;

public class  MouseAdapterDemo extends MouseAdapter{
    Frame f;
    MouseAdapterDemo(){
        f = new Frame("Mouse Adapter");
        f.addMouseListener(this);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void  mouseClicked(MouseEvent e){
        Graphics g = f.getGraphics();
        g.setColor(Color.CYAN);
        g.fillRect(e.getX(), e.getY(), 20, 20);
    }
    public static void main(String[] args) {
        new MouseAdapterDemo();        
    }
}