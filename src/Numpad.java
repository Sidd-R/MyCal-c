import javax.swing.*;
import java.awt.*;

public class Numpad extends JPanel {
    NumberPadKey one = new NumberPadKey("1");
    NumberPadKey two = new NumberPadKey("2");
    NumberPadKey three = new NumberPadKey("3");
    NumberPadKey four = new NumberPadKey("4");
    NumberPadKey five = new NumberPadKey("5");
    NumberPadKey six = new NumberPadKey("6");
    NumberPadKey seven = new NumberPadKey("7");
    NumberPadKey eight = new NumberPadKey("8");
    NumberPadKey nine = new NumberPadKey("9");
    NumberPadKey zero = new NumberPadKey("0");
    NumberPadKey delete = new NumberPadKey(1);
    NumberPadKey clear = new NumberPadKey(0);
    Numpad () {
        this.setLayout(new GridLayout(4,3,10,10));
        this.setBackground(new Color(0x1E272C));
        this.setPreferredSize(new Dimension(200,270));
        this.add(one);
        this.add(two);
        this.add(three);
        this.add(four);
        this.add(five);
        this.add(six);
        this.add(seven);
        this.add(eight);
        this.add(nine);
        this.add(zero);
        this.add(delete);
        this.add(clear);
    }
}
