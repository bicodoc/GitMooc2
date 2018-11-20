package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UserInterface implements Runnable, ActionListener {
    private JFrame frame;
    private PersonalCalculator calc;
    
    public UserInterface(PersonalCalculator calc) {
        this.calc = calc;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());

        JLabel textLabel = new JLabel("0");
        JButton clickButton = new JButton("Click!");
        ClickListener listener  = new ClickListener(calc, textLabel);
        clickButton.addActionListener(listener);
                
        container.add(textLabel, BorderLayout.NORTH);        
        container.add(clickButton, BorderLayout.SOUTH);        
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        System.out.println("");
    }

    public JFrame getFrame() {
        return frame;
    }
}

/*
package clicker.ui;
 
import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
 
public class UserInterface implements Runnable {
    private Calculator calculator;
    private JFrame frame;
 
    public UserInterface(Calculator calculator) {
        this.calculator = calculator;
    }
 
    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 
        createComponents(frame.getContentPane());
 
        frame.pack();
        frame.setVisible(true);
    }
 
    private void createComponents(Container container) {
        JLabel calculatorLabel = new JLabel();
        calculatorLabel.setText("" + calculator.giveValue());
 
        JButton button = new JButton();
        button.setText("Click!");
        button.addActionListener(new ClickListener(calculator, calculatorLabel));
 
        container.add(calculatorLabel);
        container.add(button, BorderLayout.SOUTH);
    }
 
    public JFrame getFrame() {
        return frame;
    }
}
*/