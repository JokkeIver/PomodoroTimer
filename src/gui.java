import javax.swing.*;
import java.awt.*;
import java.util.TimerTask;
import java.util.Timer;

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
        
        timerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        timerPanel.add(timerLabel);
        timerPanel.add(btnPanel);

        contentPane.add(timerPanel, BorderLayout.CENTER);

        // Sets frame visible
        frame.setVisible(true);
    }

    /**
     * Method for running the timer
     */
    public void startTimer(int time, gui g) {
        System.out.println("This should start timer");
        final int[] countdown = {time};
        Timer timer = new Timer(); 
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (countdown[0] > 0) {
                    g.setTimerLabel("Time Left: " + countdown[0] + " seconds");
                    countdown[0]--;
                } else {
                    g.setTimerLabel("Time is up");
                    timer.cancel();
                }
            };
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }

    /**
     * Getter methods for the objects
     */
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
