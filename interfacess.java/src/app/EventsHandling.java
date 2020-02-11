package app;


import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicSliderUI.ComponentHandler;

public class EventsHandling implements Action {
 public void GUI()
 {
    JFrame frame = new JFrame();
    frame.setTitle("welcome to GUI...");
    frame.setSize(400, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    JButton button = new JButton("Click here..");
    button.addActionListener(this);
    frame.add(button);
    button.setText("Button");
    

    
 }




    @Override
    public void actionPerformed(ActionEvent e) {
        

        JOptionPane.showMessageDialog(null,"you just click the button.."); 
        JOptionPane.showMessageDialog(null ," click the button.."); 


    }

    @Override
    public Object getValue(String key) {
        int a = 4;
        int b = 6;
        int sum = a + b;

        return sum;
    }

    @Override
    public void putValue(String key, Object value) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setEnabled(boolean b) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub

    }

}