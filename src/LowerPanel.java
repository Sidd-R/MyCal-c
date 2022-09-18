import javax.swing.*;
import java.awt.*;

public class LowerPanel extends JPanel {
    LowerPanel () {
        this.setLayout(new BorderLayout());

        int edge = 20;

        JPanel u = new JPanel();
        JPanel d = new JPanel();
        JPanel l = new JPanel();
        JPanel r = new JPanel();
        JPanel c = new JPanel();

        u.setPreferredSize(new Dimension(edge,edge));
        d.setPreferredSize(new Dimension(edge,edge));
        l.setPreferredSize(new Dimension(edge,edge));
        r.setPreferredSize(new Dimension(edge,edge));
        c.setPreferredSize(new Dimension(400,270));

        u.setBackground(new Color(0x1E272C));
        d.setBackground(new Color(0x1E272C));
        l.setBackground(new Color(0x1E272C));
        r.setBackground(new Color(0x1E272C));
        c.setBackground(new Color(0x1E272C));

       Numpad numpad = new Numpad();
       ArithmaticFunctions arithmaticFunctions = new ArithmaticFunctions();

        c.setLayout(new BorderLayout());
        c.add(numpad,BorderLayout.WEST);
        c.add(arithmaticFunctions,BorderLayout.EAST);

        this.add(d,BorderLayout.SOUTH);
        this.add(u,BorderLayout.NORTH);
        this.add(l,BorderLayout.WEST);
        this.add(r,BorderLayout.EAST);
        this.add(c,BorderLayout.CENTER);
    }
}
