import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpperPanel extends JPanel implements ActionListener {
    static JTextField num1 = new JTextField();
    static JTextField num2 = new JTextField();
    static JTextField result = new JTextField();
    static JButton num1Act = new JButton();
    static JButton num2Act = new JButton();
    JButton info = new JButton("?");

    static boolean num1A = true;


    UpperPanel () {
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

        u.setBackground(new Color(0x1E272C));
        d.setBackground(new Color(0x1E272C));
        l.setBackground(new Color(0x1E272C));
        r.setBackground(new Color(0x1E272C));
        c.setBackground(new Color(0x1E272C));

        this.setPreferredSize(new Dimension(440,200));

        int height = 70, width = 190;

        c.setLayout(null);

        num1.setBounds(0,0,width,height);
        num2.setBounds(210,0,width,height);
        result.setBounds(0,90,305,height);
        info.setBounds(325,90,70,70);
        num1Act.setBounds(0,0,width,height);
        num2Act.setBounds(210,0,width,height);

        Border txtf = BorderFactory.createLineBorder(new Color(0x1B6460),3);

        num1.setBorder(txtf);
        num2.setBorder(txtf);
        result.setBorder(txtf);
        info.setBorder(txtf);

        num1.setBackground(new Color(0x263238));
        num2.setBackground(new Color(0x263238));
        result.setBackground(new Color(0x263238));
        info.setBackground(new Color(0x263238));
        num1Act.setBackground(new Color(0x263238));
        num2Act.setBackground(new Color(0x263238));

        num1.setForeground(Color.white);
        num2.setForeground(Color.white);
        result.setForeground(Color.white);
        info.setForeground(Color.white);

        num1.setCaretColor(new Color(0x263238));
        num2.setCaretColor(new Color(0x263238));

        num1.setFont(new Font("Calibri",Font.PLAIN,27));
        num2.setFont(new Font("Calibri",Font.PLAIN,27));
        result.setFont(new Font("Calibri",Font.PLAIN,27));
        info.setFont(new Font("Calibri",Font.PLAIN,27));

        num1.setHorizontalAlignment(JTextField.CENTER);
        num2.setHorizontalAlignment(JTextField.CENTER);
        result.setHorizontalAlignment(JTextField.CENTER);

        result.setText("Result");

        info.addActionListener(this);
        info.setFocusable(false);

        result.setEditable(false);
        num1Act.addActionListener(this);
        num2Act.addActionListener(this);
        num1Act.setOpaque(false);
        num2Act.setOpaque(false);
        num1Act.setFocusable(false);
        num2Act.setFocusable(false);

        c.add(num2Act);
        c.add(num1Act);
        c.add(num1);
        c.add(num2);
        c.add(result);
        c.add(info);


        this.add(d,BorderLayout.SOUTH);
        this.add(u,BorderLayout.NORTH);
        this.add(l,BorderLayout.WEST);
        this.add(r,BorderLayout.EAST);
        this.add(c,BorderLayout.CENTER);
    }

    static void add () {
        result.setText(Float.toString(Float.parseFloat(num1.getText()) + Float.parseFloat(num2.getText())));
    }
    static void subtract () {
        result.setText(Float.toString(Float.parseFloat(num1.getText()) - Float.parseFloat(num2.getText())));
    }

    static void multiply () {
        result.setText(Float.toString(Float.parseFloat(num1.getText()) * Float.parseFloat(num2.getText())));
    }

    static void divide () {
        result.setText(Float.toString(Float.parseFloat(num1.getText()) / Float.parseFloat(num2.getText())));
    }

    static void power () {
        float a = Float.parseFloat(num1.getText());
        float b = Float.parseFloat(num2.getText());

        result.setText(Double.toString(Math.pow(a,b)));
    }
    static void root () {
        float a = Float.parseFloat(num1.getText());
        float b = Float.parseFloat(num2.getText());

        result.setText(Double.toString(Math.pow(a,1/b)));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == num1Act) {
            num1Act.setVisible(false);
            num2Act.setVisible(true);
            num1A = true;
        }
        else if (e.getSource() == num2Act) {
            num2Act.setVisible(false);
            num1Act.setVisible(true);
            num1A = false;
        }
        if (e.getSource() == info) {
            int a = JOptionPane.showConfirmDialog(null,"This is just a simple yet elegant calculator!!\n" +
                                                                            "               Don't you agree??","Review",JOptionPane.YES_NO_OPTION);
            if (a == 0)
                info.setBackground(new Color(0x327C97));
            else
                info.setBackground(new Color(0xC65450));
        }
    }

    static void numUpdate(String appendNum) {
        if (num1A)
            num1.setText(num1.getText() +appendNum);
        else
            num2.setText(num2.getText() +appendNum);
    }

    static void numDelete () {
        if (num1A) {
            String k = num1.getText();
            if (k.length() <= 1)
                num1.setText("0");
            else
                num1.setText(k.substring(0,k.length() - 1));
        }
        else {
            String k = num2.getText();
            num2.setText(k.substring(0,k.length() - 1));
        }
    }

    static void clear () {
       num1.setText(null);
       num2.setText(null);
       result.setText("Result");
    }
}
