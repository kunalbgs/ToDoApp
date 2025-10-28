📝 To-Do List App — Java Swing GUI Project
📘 Overview

To-Do App is a simple and interactive Java Swing-based desktop application that allows users to manage their daily tasks easily.
Users can add new tasks, delete completed ones, and view their entire list in a clean GUI.

This project is perfect for beginners learning Java GUI (Swing) and event handling.

🧰 Tools & Technologies
Tool	Description
🟡 Java (JDK 8+)	Programming language used
🪟 Swing (Built-in GUI Library)	For designing the graphical user interface
💻 IDE	IntelliJ IDEA CE / Eclipse / NetBeans
🎯 Objective

To understand the basics of desktop GUI development using Swing — including JFrame, JPanel, JButton, JTextField, JList, and ActionListener.

✨ Features

✅ Add new tasks dynamically
✅ Delete selected tasks
✅ Auto-update list view
✅ Input validation (no empty tasks)
✅ Simple, modern GUI layout
✅ Popup messages for errors and confirmations

📂 Project Structure
ToDoApp/
│
├── src/
│   └── todoapp/
│       └── ToDoApp.java
│
└── README.md

💻 How to Run the Project
1️⃣ Prerequisites

Java JDK 8 or higher installed

Any Java IDE (IntelliJ, Eclipse, or VS Code)

2️⃣ Steps
# Clone the repository
git clone https://github.com/kunalbgs/ToDoApp.git

# Navigate to project directory
cd ToDoApp

# Compile the Java code
javac todoapp/ToDoApp.java

# Run the application
java todoapp.ToDoApp

🧩 Code Overview
🏗️ Main Components
Component	Description
JFrame	The main window of the application
JPanel	Layout container for buttons and fields
JButton	Buttons to Add/Delete tasks
JTextField	Input box for entering new tasks
JList	Displays all current tasks
DefaultListModel	Stores the task data dynamically
ActionListener	Handles button click events
🧠 Main Method
public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new ToDoApp());
}


✅ Launches the GUI safely on the Event Dispatch Thread (EDT) — the standard way to start any Swing app.

🖼️ Example Output (Console / GUI)

When you run the app, you’ll see a window like this 👇

+--------------------------------------+
| Enter Task: [ Study Java Swing ]     |
| [Add Task]                           |
|--------------------------------------|
| 1. Study Java Swing                  |
| 2. Buy Groceries                     |
|--------------------------------------|
| [Delete Task]                        |
+--------------------------------------+


🪄 Actions:

Type your task → click “Add Task” ✅

Select a task → click “Delete Task” ❌

🧠 Learning Outcome

After completing this project, you will understand:

✅ How to design GUI with Swing components

✅ Event handling using ActionListener

✅ Dynamic data updates with DefaultListModel

✅ Proper GUI threading using SwingUtilities

✅ How to structure a standalone desktop app in Java

🚀 Future Enhancements

🔹 Add “Edit Task” feature
🔹 Add “Mark as Done” checkbox
🔹 Save tasks to a file or database (Persistence)
🔹 Add a modern theme using Java Look & Feel
🔹 Convert to JavaFX version later

👨‍💻 Author

Kunal Kumar
