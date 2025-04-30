import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        List<String> tasks = new ArrayList<>();

        // ✅ Valid tasks
        manager.addTask(tasks, "Clean room");
        manager.addTask(tasks, "Do homework");
        manager.addTask(tasks, "Read a book");

        // ❌ Invalid task (empty)
        manager.addTask(tasks, "");

        // ✅ Sort tasks
        manager.sortTasks(tasks);

        // 🔍 Search for a task
        manager.searchTask(tasks, "Do homework");

        // ❌ Search for a task not in list
        manager.searchTask(tasks, "Walk dog");

        // ❌ Remove a task not in list
        manager.removeTask(tasks, "Feed the cat");

        // ✅ Remove a task
        manager.removeTask(tasks, "Clean room");

        // ✅ Find the longest task
        manager.findLongestTask(tasks);

        // ✅ Get task by index
        manager.getTask(tasks, 1);

        // ❌ Out-of-bounds index
        manager.getTask(tasks, 10);
    }
}