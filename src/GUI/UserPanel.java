package GUI;

// import required for GUI
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public  class UserPanel extends JPanel implements  ActionListener{
    public  JButton redButton;

    public UserPanel(){
        redButton = new JButton("Red");
        redButton.addActionListener(this);
        add(redButton);
    }

    // this is a method from ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {
        Color color = Color.RED;
        setBackground(color);
        repaint();

    }
}