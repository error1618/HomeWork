import javax.swing.*;


public class homework {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Number GUI"); // create a JFrame object with title "Number GUI"
        JButton button = new JButton("Square"); // create a JButton object with label "Square"


        frame.add(button); // add the button 
        button.setBounds(200, 200, 100, 50);
        frame.setLayout(null);

        frame.setVisible(true); // make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the application when the user closes the frame
        frame.setBounds(900, 540, 500, 500);
    }
}
