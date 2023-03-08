
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Squaring {
    public static void main(String[] args) {
        JPanel panel= new JPanel();
        JFrame frame= new JFrame();


        JLabel Label = new JLabel("Type a number");
        Label.setBounds(10,25,80,50);

        JTextField TextField = new JTextField();
        TextField.setBounds(150,25,200,50);

        Label.setVerticalAlignment(JTextField.TOP);

        frame.add(panel);
        frame.add(TextField);
        frame.add(Label);
        frame.setSize(400,500);
        frame.setVisible(true);//making the frame visible
        panel.setLayout(null);//using no layout managers
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close properly

    }


}
