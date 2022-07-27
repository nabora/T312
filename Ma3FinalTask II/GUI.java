import java.awt.*;
import javax.swing.*;

public class Gui {

	JFrame frame = new JFrame();
	JRadioButton r1 = new JRadioButton("BSIT");  
	JRadioButton r2 = new JRadioButton("BSECM");  
	JRadioButton r3 = new JRadioButton("MSIT");  
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JTextField t1 = new JTextField();
	JPasswordField P = new JPasswordField();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	
	String s1[] = {"BSIT", "BSEMC", "MSIT"};
	@SuppressWarnings({ "rawtypes", "unchecked" })
	JComboBox cb = new JComboBox(s1);
	

	
Gui(){
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250,300);
		frame.setTitle("GUI");
		frame.setResizable(false);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setVisible(true);
		
		
		r1.setBounds(20,25,60,20);
		r1.setForeground(Color.white);
		r1.setBackground(null);
	
		r2.setBounds(75,25,70,20);
		r2.setForeground(Color.white);
		r2.setBackground(null);
		
		r3.setBounds(150,25,60,20);
		r3.setForeground(Color.white);
		r3.setBackground(null);
		
		label1.setText("Helllo GUI");
		label1.setBounds(20,55,75,30);
		label1.setForeground(Color.white);
		
		label2.setText("This is a Java Swing Program");
		label2.setBounds(30,85,200,30);
		label2.setForeground(Color.white);
		
		t1.setBounds(80,60,75,25);
		P.setBounds(160,60,60,25);
		
		button1.setText("Team One");
		button1.setBounds(10,120,100,50);
		button1.setBackground(Color.green);
		
		button2.setText("Team Two");
		button2.setBounds(125,120,100,50);
		button2.setBackground(Color.yellow);
		
		cb.setBounds(80,180,75,20);
	
		frame.add(r1);
		frame.add(r2);
		frame.add(r3);
		frame.add(label1);
		frame.add(t1);
		frame.add(P);
		frame.add(label2);
		frame.add(button1);
		frame.add(button2);
		frame.add(cb);
	
	}	

}
