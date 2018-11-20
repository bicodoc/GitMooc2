
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author albertdavis
 */
public class SubListener implements ActionListener {
    private JButton sub;
    private JTextField input;
    private JTextField output;
    private JButton zero;
    
    public SubListener(JButton sub, JTextField input, JTextField output, JButton zero) {
        this.sub = sub;
        this.input = input;
        this.output = output;
        this.zero = zero;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int addendum = 0;
        try {
            addendum = Integer.parseInt(this.input.getText());        }
        catch (NumberFormatException nfe) {
            input.setText(null);
        }
        
        int sum = Integer.parseInt(this.output.getText());
        this.output.setText(String.valueOf(sum - addendum));
        if (output.getText().equals("0")) {
            zero.setEnabled(false);
        } else {
            zero.setEnabled(true);
        }
        input.setText(null);
    }
}
