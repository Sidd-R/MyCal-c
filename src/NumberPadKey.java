import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberPadKey extends JButton implements ActionListener {

    Border txtf = BorderFactory.createLineBorder(new Color(0x1B6460),3);

    NumberPadKey (String num) {

        this.setText(num);
        this.setBackground(new Color(0x263238));
        this.setForeground(Color.white);
        this.setFont(new Font("Calibri",Font.PLAIN,27));
        this.setPreferredSize(new Dimension(60,60));
        this.addActionListener(this);
        this.setBorder(txtf);
        this.setFocusable(false);
    }

    NumberPadKey (int x) {
        if (x == 1) {
            this.setText("del");
            this.setBackground(new Color(0x263238));
            this.setForeground(Color.white);
            this.setFont(new Font("Calibri",Font.PLAIN,27));
            this.setPreferredSize(new Dimension(60,60));
            this.addActionListener(this);
            this.setBorder(txtf);
            this.setFocusable(false);
        }
        else
        {
            this.setText("clr");
            this.setBackground(new Color(0x263238));
            this.setForeground(Color.white);
            this.setFont(new Font("Calibri",Font.PLAIN,27));
            this.setPreferredSize(new Dimension(60,60));
            this.addActionListener(this);
            this.setBorder(txtf);
            this.setFocusable(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this && this.getText().equals("del"))
            UpperPanel.numDelete();
        else if (e.getSource() == this && this.getText().equals("clr"))
            UpperPanel.clear();
        else if (e.getSource() == this)
            UpperPanel.numUpdate(this.getText());
    }
}
