package square_numberGUI;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

public class square_GUI implements ActionListener{
    private int count=0;
    private JLabel Label;
    private JLabel emptyLabel;
    private JPanel panel;
    private JTextField textfield;


    public square_GUI() {
        // Create a JFrame to hold the label
        JFrame frame = new JFrame("Empty Label ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel
        Label = new JLabel("Type a number",null,JLabel.CENTER);
        emptyLabel= new JLabel("");
        
        //Create a Textfield
        textfield= new JTextField();
        ((AbstractDocument) textfield.getDocument()).setDocumentFilter(new NumericDocumentFilter());

        //Create a button Square
        JButton button= new JButton("Square");
        button.addActionListener(this);

        //Create a panel 
        panel= new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));

        // Add the label and button to the Panel
        frame.add(panel,BorderLayout.CENTER);
        panel.add(Label);
        panel.add(textfield);
        panel.add(emptyLabel);
        panel.add(button);

        frame.setTitle("Square Number");
        frame.pack();

        // Display the frame
        frame.setVisible(true);
    }
    
    // A document filter that allows only numeric input
    private class NumericDocumentFilter extends DocumentFilter {
        @Override
        public void insertString(FilterBypass fb, int offset, String string, javax.swing.text.AttributeSet attr) throws javax.swing.text.BadLocationException {
            if (string.matches("\\d+")) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String string, javax.swing.text.AttributeSet attr) throws javax.swing.text.BadLocationException {
            if (string.matches("\\d+")) {
                super.replace(fb, offset, length, string, attr);
            }
        }
    }

    public static void main(String[] args) {
        new square_GUI();
    }
    
    public void actionPerformed(ActionEvent event) {
        try {
            int num = Integer.parseInt(textfield.getText());
            int square = num * num;
            emptyLabel.setText( ""+square);
        } catch (NumberFormatException e) {
            emptyLabel.setText("Please enter a valid number");
        }
    }
}
