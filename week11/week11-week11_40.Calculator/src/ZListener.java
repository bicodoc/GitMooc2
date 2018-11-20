
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author albertdavis
 */
public class ZListener implements ActionListener {
    private JButton zero;
    private JTextField input;
    private JTextField output;
    
    public ZListener(JButton zero, JTextField input, JTextField output) {
        this.zero = zero;
        this.input = input;
        this.output = output;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            this.output.setText("0");
            this.input.setText("");
            zero.setEnabled(false);
    }
}
