import javax.swing.*;
import java.awt.*;

public class FlowerBloom extends JPanel {

    // Method to draw the flower
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set the color for the petals
        g.setColor(Color.PINK);
        
        // Draw the flower petals (circles)
        g.fillOval(150, 50, 100, 100);  // Top-left petal
        g.fillOval(250, 50, 100, 100);  // Top-right petal
        g.fillOval(150, 150, 100, 100); // Bottom-left petal
        g.fillOval(250, 150, 100, 100); // Bottom-right petal
        g.fillOval(200, 100, 100, 100); // Center petal (flower center)

        // Set the color for the stem
        g.setColor(Color.GREEN);

        // Draw the stem of the flower
        g.fillRect(235, 250, 20, 150);

        // Set the color for the text
        g.setColor(Color.BLACK);

        // Draw the text "I am sorry" below the flower
        g.setFont(new Font("Serif", Font.BOLD, 20));
        g.drawString("I am sorry", 190, 420);
    }

    public static void main(String[] args) {
        // Create a frame to display the flower and text
        JFrame frame = new JFrame("Blooming Flower");
        FlowerBloom panel = new FlowerBloom();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(panel);
        frame.setVisible(true);
    }

}
