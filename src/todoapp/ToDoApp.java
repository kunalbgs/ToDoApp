package todoapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * A simple To-Do List application using Java Swing.
 * Allows users to add and delete tasks from a list.
 */
public class ToDoApp extends JFrame {

    private DefaultListModel<String> taskListModel; // Stores tasks
    private JList<String> taskList; // Displays tasks
    private JTextField taskInputField; // Input field for new tasks
    private JButton addButton, deleteButton; // Buttons for actions

    public ToDoApp() {
        setTitle("To-Do List App");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Initialize components
        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        taskInputField = new JTextField();
        addButton = new JButton("Add Task");
        deleteButton = new JButton("Delete Selected");

        // Layout setup
        setLayout(new BorderLayout());

        // Top panel for input and add button
        JPanel topPanel = new JPanel(new BorderLayout(5, 5));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        topPanel.add(taskInputField, BorderLayout.CENTER);
        topPanel.add(addButton, BorderLayout.EAST);

        // Center panel for task list
        JScrollPane scrollPane = new JScrollPane(taskList);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Your Tasks"));

        // Bottom panel for delete button
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(deleteButton);

        // Add panels to frame
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        // Add task action
        addButton.addActionListener(e -> {
            String task = taskInputField.getText().trim();
            if (!task.isEmpty()) {
                taskListModel.addElement(task);
                taskInputField.setText(""); // Clear input
            } else {
                JOptionPane.showMessageDialog(this, "Task cannot be empty.");
            }
        });

        // Delete task action
        deleteButton.addActionListener(e -> {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                taskListModel.remove(selectedIndex);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a task to delete.");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ToDoApp::new); // Launch GUI safely
    }
}