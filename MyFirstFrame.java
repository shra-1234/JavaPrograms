import java.awt.FlowLayout;
import javax.swing.*;

public class MyFirstFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame("Sign up form: ");
        f.setSize(350, 350);
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Setting gaps between components
        
        JLabel l1 = new JLabel("Username:");
        f.add(l1);
        JTextField t1 = new JTextField(20);
        f.add(t1);
        
        // Adding space between Username and Password
        f.add(Box.createVerticalStrut(30)); // Vertical space
        
        JLabel l2 = new JLabel("Password:");
        f.add(l2);
        JTextField t2 = new JTextField(20);
        f.add(t2);
        
        // Adding space between Password and Submit button
        f.add(Box.createVerticalStrut(30)); // Vertical space
        
        JButton b = new JButton("Submit");
        f.add(b);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
