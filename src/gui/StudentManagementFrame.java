import javax.swing.*;
import java.awt.*;
import java.util.*;

public class StudentManagementFrame extends JFrame {
    private JTable studentTable;
    private JTextField nameField, emailField;
    
    public StudentManagementFrame() {
        setTitle("Student Management");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Sample data for table 
        String[] columnNames = {"ID", "Name", "Email"};
        Object[][] data = {{1, "John Doe", "johndoe@example.com"}, {2, "Jane Smith", "janesmith@example.com"}};
        studentTable = new JTable(data, columnNames);
        add(new JScrollPane(studentTable), BorderLayout.CENTER);
        
        JPanel panel = new JPanel();
        nameField = new JTextField(15);
        emailField = new JTextField(15);
        panel.add(nameField);
        panel.add(emailField);
        JButton addButton = new JButton("Add");
        panel.add(addButton);
        add(panel, BorderLayout.SOUTH);
        
        addButton.addActionListener(e -> {
            // Add CRUD logic
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StudentManagementFrame().setVisible(true);
        });
    }
}