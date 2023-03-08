package homework;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Square extends JFrame   {

public static void main(String[] args) {  
   JFrame f=new JFrame();//creating instance of JFrame           
   JLabel Label = new JLabel("Type a number",null,JLabel.CENTER);   
   Label.setBounds(50,50,260,50);  

   f.add(Label);
          
   f.setSize(400,500);
   f.setLayout(null);//using no layout managers  
   f.setVisible(true);//making the frame visible  
}  
}  

	

