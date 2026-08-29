package GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.Collections;
import javax.swing.*;

public class UserFrame extends JFrame implements WindowListener {

    private  Container contentPane;
    public UserFrame(){
        setTitle("Button Testing");
        setSize(200,200);

        addWindowListener(this);
        contentPane = this.getContentPane();
        contentPane.add(new UserPanel());
        
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    static void main(String[] args) {
        EventQueue.invokeLater(
                ()->{
                    JFrame frame = new UserFrame();
                    frame.setVisible(true);
                }
        );
    }
}
