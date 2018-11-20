package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));
        container.add(new JCheckBox("Yes!"));
        container.add(new JCheckBox("No!"));
        
        container.add(new JLabel("Why?"));
        JRadioButton reason = new JRadioButton("No reason.");
        JRadioButton fun = new JRadioButton("Because it is fun!");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(reason);
        buttonGroup.add(fun);

        container.add(reason);
        container.add(fun);
        
        container.add(new JButton("Done!"));
    }

    public JFrame getFrame() {
        return frame;
    }
}

/*
package survey;
 
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
 
public class UserInterface implements Runnable {
 
    private JFrame frame;
 
    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("Survey");                                   //set up window frame
        frame.setPreferredSize(new Dimension(200, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 
        createComponents(frame.getContentPane());
 
        frame.pack();
        frame.setVisible(true);
    }
 
    private void createComponents(Container container) {
        JLabel question1 = new JLabel("Are you?");                      //create compoents
        JCheckBox question1AnswerYes = new JCheckBox("Yes!");
        JCheckBox question1AnswerNo = new JCheckBox("No!");
        JLabel question2 = new JLabel("Why?");
        ButtonGroup question2Answers = new ButtonGroup();               //create group component
        JRadioButton question2Answer1 = new JRadioButton("No reason.");
        JRadioButton question2Answer2 = new JRadioButton("Because it is fun!");
 
        question2Answers.add(question2Answer1);                         //load buttons into group
        question2Answers.add(question2Answer2);
 
        JButton done = new JButton("Done!");
 
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);  //declare layout
        container.setLayout(layout);
 
        container.add(question1);                                       //add components to layout
        container.add(question1AnswerYes);
        container.add(question1AnswerNo);
        container.add(question2);
        container.add(question2Answer1);
        container.add(question2Answer2);
        container.add(done);
    }
 
    public JFrame getFrame() {
        return frame;
    }
}
*/

