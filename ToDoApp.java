// File: ToDoApp.java

import java.util.*; // Import utility classes (ArrayList, Scanner)

public class ToDoApp {
    
    // A list to store all tasks (each task is just a String)
    static ArrayList<String> tasks = new ArrayList<>();

    /**
     * Displays all tasks in the list
     * If the list is empty, shows a message instead
     */
    public static void addTask(String t) {
        tasks.add(t);
        System.out.println(" Task is Added!!");
    }

    // Removes a task from the list
    public static void showTasks() {
        if (tasks.size() == 0) {
            System.out.println(" No Tasks yet!!");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    /**
     * Main method - entry point of the program
     * Provides a menu for user interaction
     */
    public static void removeTask(int n) {
        if (n > 0 && n <= tasks.size()) {
            tasks.remove(n - 1);
            System.out.println(" Task is removed!!");
        } else {
            System.out.println(" Invalid task number!!");
        }
    }


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in); // Scanner for user input

        // Infinite loop until user chooses to exit
        while (true) {
            // Print menu
            System.out.println("=================================");
            System.out.println("        TO DO LIST (JAVA)");
            System.out.println("=================================");
            System.out.println("  [1] Add Task");
            System.out.println("  [2] Show Tasks");
            System.out.println("  [3] Remove Task");
            System.out.println("  [4] Exit");
            System.out.println("=================================");
            System.out.print(" Please enter your choice: ");
            int choice = s.nextInt(); // Read user choice
            System.out.println("=================================");

            // Handle each menu option
            if (choice == 1) {
                // Add a new task
                System.out.println("=================================");
                System.out.println("   [1] Add Task           ");
                System.out.println("=================================");
                System.out.print(" Enter Task Name: ");
                s.nextLine(); // Consume leftover newline from nextInt()
                String t = s.nextLine(); // Read full line as task
                addTask(t);
                System.out.println("=================================");
                
            } else if (choice == 2) {
                // Show all tasks
                System.out.println("=================================");
                System.out.println("   [2] Show Task          ");
                System.out.println("=================================");
                showTasks();
                System.out.println("=================================");
                
            } else if (choice == 3) {
                // Remove a task
                System.out.println("=================================");
                System.out.println("   [3] Remove Task        ");
                System.out.println("=================================");
                System.out.print(" Enter task no to remove: ");
                int n = s.nextInt();
                removeTask(n);
                System.out.println("=================================");

            } else if (choice == 4) {
                // Exit the program
                System.out.println("=================================");
                System.out.println("   [4] Exit                  ");
                System.out.println("=================================\n");
                System.out.println(" Exiting the program,\n have a nice day!\n");
                System.out.println("=================================");
                break; // End loop
            } else {
                // Invalid choice
                System.out.println("=================================");
                System.out.println(" Wrong choice, please try again!\n");
                System.out.println("=================================");
            }
        }
        // Close scanner to release resources
        scanner.close();
    }
}



