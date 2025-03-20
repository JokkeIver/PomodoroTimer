import javax.swing.*;
import java.awt.*;

public class gui {
    JLabel timerLabel = new JLabel("Hello World!");

    // Add the buttons
    JButton startBtn = new JButton("Start");
    JButton stopBtn = new JButton("Stop");

    public gui(String t) {
        // Create the main frame
        JFrame frame = new JFrame(t);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);


        JPanel timerPanel = new JPanel();
        timerPanel.setLayout(new BoxLayout(timerPanel, BoxLayout.Y_AXIS));


        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout());
        btnPanel.add(startBtn);
        btnPanel.add(stopBtn);
        
        timerPanel.add(timerLabel);
        timerPanel.add(btnPanel);

        contentPane.add(timerPanel, BorderLayout.CENTER);

        // Sets frame visible
        frame.setVisible(true);
    }

    public JLabel getTimer() {
        return timerLabel;
    }

    public JButton getStart() {
        return startBtn;
    }

    public JButton getStop() {
        return stopBtn;
    }

    public void setTimerLabel(String t) {
        timerLabel.setText(t);
    }
}
