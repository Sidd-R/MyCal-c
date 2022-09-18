import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmaticFunctions extends JPanel implements ActionListener {
    JButton root = new JButton("sqrt");
    JButton power = new JButton("pow");
    JButton add = new JButton("+");
    JButton subtract = new JButton("-");
    JButton multiply = new JButton("x");
    JButton divide = new JButton("/");
    Border txtf = BorderFactory.createLineBorder(new Color(0x1B6460),3);


    ArithmaticFunctions () {

        int height = 85, width = 85;

        add.setPreferredSize(new Dimension(width,height));
        subtract.setPreferredSize(new Dimension(width,height));
        multiply.setPreferredSize(new Dimension(width,height));
        divide.setPreferredSize(new Dimension(width,height));
        power.setPreferredSize(new Dimension(width,height));
        root.setPreferredSize(new Dimension(width,height));

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        power.addActionListener(this);
        root.addActionListener(this);

        add.setFocusable(false);
        subtract.setFocusable(false);
        multiply.setFocusable(false);
        divide.setFocusable(false);
        power.setFocusable(false);
        root.setFocusable(false);


        add.setBorder(txtf);
        subtract.setBorder(txtf);
        multiply.setBorder(txtf);
        divide.setBorder(txtf);
        power.setBorder(txtf);
        root.setBorder(txtf);

        add.setBackground(new Color(0x263238));
        subtract.setBackground(new Color(0x263238));
        multiply.setBackground(new Color(0x263238));
        divide.setBackground(new Color(0x263238));
        power.setBackground(new Color(0x263238));
        root.setBackground(new Color(0x263238));

        add.setForeground(Color.white);
        subtract.setForeground(Color.white);
        multiply.setForeground(Color.white);
        divide.setForeground(Color.white);
        power.setForeground(Color.white);
        root.setForeground(Color.white);

        int fontSize = 35;
        add.setFont(new Font("Calibri",Font.PLAIN,fontSize));
        subtract.setFont(new Font("Calibri",Font.PLAIN,fontSize));
        multiply.setFont(new Font("Calibri",Font.PLAIN,fontSize));
        divide.setFont(new Font("Calibri",Font.PLAIN,fontSize));
        power.setFont(new Font("Calibri",Font.PLAIN,24));
        root.setFont(new Font("Calibri",Font.PLAIN,24));

        this.setLayout(new GridLayout(3,2,10,12));
        this.setPreferredSize(new Dimension(180,180));
        this.setBackground(new Color(0x1E272C));

        this.add(add);
        this.add(subtract);
        this.add(multiply);
        this.add(divide);
        this.add(power);
        this.add(root);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            try {
                UpperPanel.add();
            }
            catch (NumberFormatException f) {
                JOptionPane.showMessageDialog(null,"Enter two numbers!!!","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (e.getSource() == subtract) {
            try {
                UpperPanel.subtract();
            }
            catch (NumberFormatException f) {
                JOptionPane.showMessageDialog(null,"Enter two numbers!!!","Error",JOptionPane.ERROR_MESSAGE);           
            }
        }
        else if (e.getSource() == multiply) {
            try {
                UpperPanel.multiply();
            }
            catch (NumberFormatException f) {
                JOptionPane.showMessageDialog(null,"Enter two numbers!!!","Error",JOptionPane.ERROR_MESSAGE);           
            }
        }
        else if (e.getSource() == divide) {
            try {
                UpperPanel.divide();
            }
            catch (NumberFormatException f) {
                JOptionPane.showMessageDialog(null,"Enter two numbers!!!","Error",JOptionPane.ERROR_MESSAGE);            
            }
        }
        else if (e.getSource() == power) {
            try {
                UpperPanel.power();
            }
            catch (NumberFormatException f) {
                JOptionPane.showMessageDialog(null,"Enter two numbers!!!","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (e.getSource() == root) {
            try {
                UpperPanel.root();
            }
            catch (NumberFormatException f) {
                JOptionPane.showMessageDialog(null,"Enter two numbers!!!","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
