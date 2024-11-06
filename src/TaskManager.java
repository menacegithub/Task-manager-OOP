import java.util.ArrayList;
import java.util.List;


public class TaskManager {
    private List<Task> tasks;
    private int taskIdCounter;

    public TaskManager() {
        tasks = new ArrayList<>();
        taskIdCounter = 1;
    }

    public void addTask(String title, String description) {
        Task newTask = new Task(taskIdCounter++, title, description);
        tasks.add(newTask);
        System.out.println("Task added: " + newTask);
    }

    public void removeTask(int taskId) {
        tasks.removeIf(task -> task.getId() == taskId);
        System.out.println("Task with ID " + taskId + " removed.");
    }

    public void markTaskAsCompleted(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.markAsCompleted();
                System.out.println("Task marked as completed: " + task);
                return;
            }
        }
        System.out.println("Task with ID " + taskId + " not found.");
    }

    public void editTask(int taskId, String newTitle, String newDescription) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setTitle(newTitle);
                task.setDescription(newDescription);
                System.out.println("Task updated: " + task);
                return;
            }
        }
        System.out.println("Task with ID " + taskId + " not found.");
    }

    public void showAllTasks() {
        System.out.println("All Tasks:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }


}