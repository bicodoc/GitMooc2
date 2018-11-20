package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author albertdavis
 */
public class ActionEventListener implements ActionListener {
    private JTextField origin;
    private JLabel destination;
    
    public ActionEventListener(JTextField origin, JLabel destination) {
        this.origin = origin;
        this.destination = destination;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.destination.setText(this.origin.getText());
        this.origin.setText("");

    }
    
}

/*
package noticeboard;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
public class ActionEventListener implements ActionListener {
 
    private JTextField inputTextField;
    private JLabel outputLabel;
 
    ActionEventListener(JTextField inputTextField, JLabel outputLabel) {
        this.inputTextField = inputTextField;
        this.outputLabel = outputLabel;
    }
 
    @Override
    public void actionPerformed(ActionEvent ae) {
        outputLabel.setText(inputTextField.getText());
        inputTextField.setText("");
    }
}
*/