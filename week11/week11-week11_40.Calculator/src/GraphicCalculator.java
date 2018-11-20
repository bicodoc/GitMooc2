
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private String output;
    private String input;
    
    public GraphicCalculator() {
        this.output = output;
    }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3,1));
        JTextField output = new JTextField("0");
        output.setEnabled(false);
        JTextField input = new JTextField("0");
        JPanel panel = new JPanel(new GridLayout(1,3));

        JButton zero = new JButton("Z");
        zero.addActionListener(new ZListener(zero, input, output));
        zero.setEnabled(false);
                
        JButton add = new JButton("+");        
        add.addActionListener(new AddListener(add, input, output, zero));

        JButton sub = new JButton("-");
        sub.addActionListener(new SubListener(sub, input, output, zero));

        panel.add(add);
        panel.add(sub);
        panel.add(zero);
        container.add(output);
        container.add(input);
        container.add(panel);
    }

    public JFrame getFrame() {
        return frame;
    }
    
    public boolean setEnabled(boolean bool) {
        return bool;
    }
}

/*
import java.awt.Container;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
 
public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private int result;
 
    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 
        createComponents(frame.getContentPane());
 
        frame.pack();
        frame.setVisible(true);
    }
 
    private void createComponents(Container container) {
        frame.setLayout(new GridLayout(3, 1));
        JTextField resultField = new JTextField("0");
        container.add(resultField);
        resultField.setEnabled(false);
        JTextField inputField = new JTextField("");
        container.add(inputField);
 
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton reset = new JButton("Z");
 
        EventListener handler = new EventListener(plus, minus, reset, resultField, inputField);
 
        plus.addActionListener(handler);
        minus.addActionListener(handler);
        reset.addActionListener(handler);
        reset.setEnabled(false);
        JPanel panel = new JPanel(new GridLayout(1, 3));
        panel.add(plus);
        panel.add(minus);
        panel.add(reset);
        container.add(panel);
    }
 
    public JFrame getFrame() {
        return frame;
    }
}
*/

/*
public class ApplicationLogic { 
    private int result;

    public void plus(int value) {
        result += value;
    }
 
    public void minus(int value) {
        result -= value;
    }
 
    public void reset() {
        result = 0;
    }
 
    public int result() {
        return result;
    }
}
*/

/*
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
 
public class EventListener implements ActionListener {
    private JButton plus;
    private JButton minus;
    private JButton reset;
    private JTextField resultField;
    private JTextField inputField;
    private ApplicationLogic app;
 
    public EventListener(JButton plus, JButton minus, JButton reset, JTextField resultField, JTextField inputField) {
        this.plus = plus;
        this.minus = minus;
        this.reset = reset;
        this.resultField = resultField;
        this.inputField = inputField;
        this.app = new ApplicationLogic();
    }
 
    @Override
    public void actionPerformed(ActionEvent ae) {
        int value = 0;
 
        try {
            value = Integer.parseInt(inputField.getText());
        } catch (Exception e) {
        }
 
        if (ae.getSource() == plus) {
            app.plus(value);
        } else if (ae.getSource() == minus) {
            app.minus(value);
        } else {
            app.reset();
        }
        int result = app.result();
 
        inputField.setText("");
        resultField.setText("" + result);
        if (result == 0) {
            reset.setEnabled(false);
        } else {
            reset.setEnabled(true);
        }
    }
}
*/
