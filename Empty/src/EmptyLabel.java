import javax.swing.JFrame;
import javax.swing.JLabel;

public class EmptyLabel{

    public static void main(String[] args) {

        // Create a JFrame to hold the label
        JFrame frame = new JFrame("Empty Label ");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with no text
        JLabel emptyLabel = new JLabel();

        // Add the label to the frame
        frame.add(emptyLabel);

        // Display the frame
        frame.setVisible(true);
    }
}
