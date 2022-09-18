import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainFrame extends JFrame {

    UpperPanel upperPanel = new UpperPanel();
    LowerPanel lowerPanel = new LowerPanel();
    MainFrame ()
    {
        this.setTitle("Sim Calculator");
        this.add(upperPanel,BorderLayout.NORTH);
        this.add(lowerPanel,BorderLayout.SOUTH);
        this.setVisible(true);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
