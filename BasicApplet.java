import java.applet.Applet;
import java.awt.Graphics;

public class BasicApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawString("Hello, World!", 20, 20);
    }
    
    public static void main(String[] args) {
        // Applets run in browsers or applet viewers, not via main method.
        // But for standalone use, you might use a JFrame instead.
        javax.swing.JFrame frame = new javax.swing.JFrame("Basic Applet");
        BasicApplet applet = new BasicApplet();
        
        frame.add(applet);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        applet.init();
        applet.start();
    }
}
