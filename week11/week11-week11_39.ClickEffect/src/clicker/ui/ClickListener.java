package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.String.valueOf;
import javax.swing.JLabel;

/**
 *
 * @author albertdavis
 */
public class ClickListener implements ActionListener {
    private Calculator calc;
    private JLabel label;
    
    
    public ClickListener(Calculator calc, JLabel label) {
        this.calc = calc;
        this.label = label;        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calc.increase();
        setText(calc, label);
    }
    
    public void setText(Calculator calc, JLabel label) {
        label.setText(valueOf(calc.giveValue()));
    }
}

/*
package clicker.ui;
 
import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
 
public class ClickListener implements ActionListener {
 
    private Calculator calculator;
    private JLabel text;
 
    public ClickListener(Calculator calculator, JLabel text) {
        this.calculator = calculator;
        this.text = text;
    }
 
    @Override
    public void actionPerformed(ActionEvent event) {
        this.calculator.increase();
        this.text.setText("" + calculator.giveValue());
    }
}
*/