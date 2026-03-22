import javax.swing.*;
import java.awt.*;

public class RegistrationFrame extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JComboBox<String> roleComboBox;
    
    public RegistrationFrame() {
        setTitle("Register");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));
        
        emailField = new JTextField();
        passwordField = new JPasswordField();
        confirmPasswordField = new JPasswordField();
        roleComboBox = new JComboBox<>(new String[]{"Student", "Admin"});
        JButton registerButton = new JButton("Register");
        
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(new JLabel("Confirm Password:"));
        add(confirmPasswordField);
        add(new JLabel("Role:"));
        add(roleComboBox);
        add(registerButton);
        
        registerButton.addActionListener(e -> {
            // Add registration logic
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RegistrationFrame().setVisible(true);
        });
    }
}