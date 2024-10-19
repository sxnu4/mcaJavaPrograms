import java.awt.*;
import java.awt.event.*;

class EventHandling {
    Button btn;
    Checkbox cb;

    EventHandling() {
        Frame frame;
        frame = new Frame("Checkbox with Itemlistner.");
        cb = new Checkbox();
        cb.setBounds(250, 250, 300, 300);
        btn = new Button("Click Here");
        btn.setBounds(60, 70, 120, 80);
        cb.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (cb.getState()) {
                    System.out.println("Feature is Enabled.");

                } else {

                    System.out.println("Feature is Disabled.");
                }
            }

        });
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");

            }
        });
        frame.add(cb);
        frame.add(btn);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new EventHandling();
    }
}
