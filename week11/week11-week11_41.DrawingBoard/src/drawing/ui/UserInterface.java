package drawing.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Avatar avatar;

    public UserInterface(Avatar avatar) {
        this.avatar = avatar;
    }
    
    @Override
    public void run() {
        // DON'T CHANGE THIS CODE!!
        frame = new JFrame("Drawing Board");
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        DrawingBoard drawingBoard = new DrawingBoard(avatar);
        container.add(drawingBoard);

        frame.addKeyListener(new KeyboardListener(avatar, drawingBoard));
    }

    public JFrame getFrame() {
        return frame;
    }
}
