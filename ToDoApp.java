// ToDoApp.java
import java.util.*;

public class ToDoApp {

    static ArrayList<String> tasks = new ArrayList<>();

    public static void addTask(String t) {
        tasks.add(t);
        System.out.println(" Task is Added!!");
    }

    public static void showTasks() {
        if (tasks.size() == 0) {
            System.out.println(" No Tasks yet!!");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void removeTask(int n) {
        if (n > 0 && n <= tasks.size()) {
            tasks.remove(n - 1);
            System.out.println(" Task is removed!!");
        } else {
            System.out.println(" Invalid task number!!");
        }
    }


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("=================================");
            System.out.println("        TO DO LIST (JAVA)");
            System.out.println("=================================");
            System.out.println("  [1] Add Task");
            System.out.println("  [2] Show Tasks");
            System.out.println("  [3] Remove Task");
            System.out.println("  [4] Exit");
            System.out.println("=================================");
            System.out.print(" Please enter your choice: ");
            int choice = s.nextInt();
            System.out.println("=================================");
            
            if (choice == 1) {
                System.out.println("=================================");
                System.out.println("   [1] Add Task           ");
                System.out.println("=================================");
                System.out.print(" Enter Task Name: ");
                s.nextLine();
                String t = s.nextLine();
                addTask(t);
                System.out.println("=================================");
                
            } else if (choice == 2) {
                System.out.println("=================================");
                System.out.println("   [2] Show Task          ");
                System.out.println("=================================");
                showTasks();
                System.out.println("=================================");
                
            } else if (choice == 3) {
                System.out.println("=================================");
                System.out.println("   [3] Remove Task        ");
                System.out.println("=================================");
                System.out.print(" Enter task no to remove: ");
                int n = s.nextInt();
                removeTask(n);
                System.out.println("=================================");

            } else if (choice == 4) {
                System.out.println("=================================");
                System.out.println("   [4] Exit                  ");
                System.out.println("=================================\n");
                System.out.println(" Exiting the program,\n have a nice day!\n");
                System.out.println("=================================");
                break;
            } else {
                System.out.println("=================================");
                System.out.println(" Wrong choice, please try again!\n");
                System.out.println("=================================");
            }
        }
        scanner.close();
    }
}


