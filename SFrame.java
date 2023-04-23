import java.awt.*;
import javax.swing.*;

public class SimpleFrame{

    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setForeground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 200));

        frame.setVisible(true);
    }
}
