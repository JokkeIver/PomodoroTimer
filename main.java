import javax.swing.*;

class main  {
    public static void main(String[] args) {
        gui gui = new gui("Hello world");
        
        // Make label change depending on button pressed
        JButton startBtn = gui.getStart();
        JButton stopBtn = gui.getStop();
        startBtn.addActionListener(e -> gui.setTimerLabel("Start"));
        stopBtn.addActionListener(e -> gui.setTimerLabel("Stop"));
    }
}
