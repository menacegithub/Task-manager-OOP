import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nTask Manager List Manager:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Edit Task");
            System.out.println("5. Show All Tasks");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(title, description);
                    break;

                case 2:
                    System.out.print("Enter task ID to remove: ");
                    int removeId = scanner.nextInt();
                    taskManager.removeTask(removeId);
                    break;

                case 3:
                    System.out.print("Enter task ID to mark as completed: ");
                    int completeId = scanner.nextInt();
                    taskManager.markTaskAsCompleted(completeId);
                    break;

                case 4:
                    System.out.print("Enter task ID to edit: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine(); // Clear the buffer
                    System.out.print("Enter new title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new description: ");
                    String newDescription = scanner.nextLine();
                    taskManager.editTask(editId, newTitle, newDescription);
                    break;

                case 5:
                    taskManager.showAllTasks();
                    break;

                case 6:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again. Mazgi");
            }
        }

        scanner.close();
    }
}