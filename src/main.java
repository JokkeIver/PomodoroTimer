import javax.swing.JButton;

class main  {
    public static void main(String[] args) {
        gui gui = new gui("Hello world");
        
        // Make label change depending on button pressed
        JButton startBtn = gui.getStart();
        JButton stopBtn = gui.getStop();
        startBtn.addActionListener(e -> gui.startTimer(10, gui));
        stopBtn.addActionListener(e -> gui.setTimerLabel("Stop"));
    }


}
