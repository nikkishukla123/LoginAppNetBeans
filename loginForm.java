import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginForm implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userName = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel userLabel = new JLabel("Username:");
    JLabel passwordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel();

    HashMap<String, String> loginInfo = new HashMap<String, String>();
    
    loginForm(HashMap<String, String> loginInfo_Origional){
        loginInfo = loginInfo_Origional;
        
        userLabel.setBounds(50, 100, 75, 25);
        userName.setBounds(125, 100, 200, 25);
        passwordLabel.setBounds(50, 150, 75, 25);
        passwordField.setBounds(125, 150, 200, 25);
        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null,  Font.BOLD, 25));

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);

        resetButton.setBounds(230, 200, 100, 25);
        resetButton.addActionListener(this);
        resetButton.setFocusable(false);

        frame.add(userLabel);
        frame.add(passwordLabel);
        frame.add(messageLabel);
        frame.add(userName);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(resetButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            passwordField.setText("");
            userName.setText("");
        }

        if (e.getSource() == loginButton) {
            String username = userName.getText();
            String password = String.valueOf(passwordField.getPassword());

            if (loginInfo.containsKey(username)) {
                if (loginInfo.get(username).equals(password)) {
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Welcome " + username);
                    userPage userweb_page = new userPage();
                }
            } else {
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Sorry, something went wrong");
            }
        } else {
            messageLabel.setForeground(Color.RED);
            messageLabel.setText("Sorry, something went wrong");
        }
    }
}
