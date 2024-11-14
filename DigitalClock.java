import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    private JFrame frame;
    private JLabel timeLabel;
    private SimpleDateFormat timeFormat;

    public DigitalClock() {
        // Step 1: Set up the JFrame
        frame = new JFrame("Digital Clock");
        frame.setSize(300, 150);               // Set the window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Step 2: Set up the JLabel
        timeLabel = new JLabel();               // Initialize the label
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 36));  // Set font size and style
        frame.add(timeLabel);

        // Step 3: Set up time formatting
        timeFormat = new SimpleDateFormat("HH:mm:ss"); // Format the time as "HH:mm:ss"

        // Step 4: Create a Timer to update the time
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();

        frame.setVisible(true);
    }

    // Method to update the JLabel with the current time
    private void updateTime() {
        String currentTime = timeFormat.format(new Date()); // Get the current time
        timeLabel.setText(currentTime);                     // Update the label
    }

    // Main method to run the clock
    public static void main(String[] args) {
        new DigitalClock();
    }
}
