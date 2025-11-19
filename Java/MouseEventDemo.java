import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener{
    Label l;
    MouseEventDemo(){
        addMouseListener(this);
        l = new Label();
        l.setBounds(20,50,100,50);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }
    public static void main(String[] args) {
        new MouseEventDemo();
    }
}