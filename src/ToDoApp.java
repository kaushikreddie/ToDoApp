import java.util.Scanner;

public class ToDoApp {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
            Scanner sc = new Scanner(System.in);

            // to hold 5 tasks
            String[] tasks = new String[5];

            System.out.println("Enter your tasks:");

            for (int i = 0; i < tasks.length; i++) {
                System.out.print("Task " + (i + 1) + ": ");
                tasks[i] = sc.nextLine();
            }
            System.out.println("\nYour To-Do List:");
            for (String task : tasks) {
                System.out.println("- " + task);
            }
            sc.close();
        }
}