import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    private JFrame frame;
    private JLabel timeLabel;
    private SimpleDateFormat timeFormat;

    public DigitalClock() {
      
        frame = new JFrame("solohs Digital Clock");
        frame.setSize(300, 150);            
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        timeLabel = new JLabel();            
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        timeLabel.setFont(new Font("Script MT Bold", Font.PLAIN, 40));  
        frame.add(timeLabel);
        timeLabel.setBackground(Color.BLACK);    
        timeLabel.setForeground(Color.CYAN);    
        timeLabel.setOpaque(true);  
        
        timeFormat = new SimpleDateFormat("HH:mm:ss"); 

       
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();

        frame.setVisible(true);
    }

   
    private void updateTime() {
        String currentTime = timeFormat.format(new Date());
        timeLabel.setText(currentTime);                     
    }

    
    public static void main(String[] args) {
        new DigitalClock();
    }
}
