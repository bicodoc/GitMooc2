package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {
    private JFrame frame;
    
    public NoticeBoard() {
    }

    @Override
    public void run() {
        frame = new JFrame("");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField textField = new JTextField("I was copied here from JTextArea");
        JLabel label = new JLabel(); 
        JButton button = new JButton("Copy!");
        
        container.add(textField);
        container.add(button);
        container.add(label);
        
        button.addActionListener(new ActionEventListener(textField, label));
    }
    public JFrame getFrame() {
        return frame;
    }
}

/*
package noticeboard;
 
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
 
public class NoticeBoard implements Runnable {
 
    private JFrame frame;
 
    @Override
    public void run() {
        frame = new JFrame("Frame");
        frame.setPreferredSize(new Dimension(400, 200));
 
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 
        createComponents(frame.getContentPane());
 
        frame.pack();
        frame.setVisible(true);
    }
 
    private void createComponents(Container container) {
        JLabel outputLabel = new JLabel();
        JTextField inputTextField = new JTextField();
        JButton copyButton = new JButton("Copy!");
 
        copyButton.addActionListener(new ActionEventListener(inputTextField, outputLabel));
        container.setLayout(new GridLayout(3, 1));
 
        container.add(inputTextField);
        container.add(copyButton);
        container.add(outputLabel);
    }
}
*/