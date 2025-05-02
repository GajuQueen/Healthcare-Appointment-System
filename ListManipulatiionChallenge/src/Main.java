import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        List<String> tasks = new ArrayList<>();


        manager.addTask(tasks, "Clean room");
        manager.addTask(tasks, "Do homework");
        manager.addTask(tasks, "Read a book");
        manager.addTask(tasks, "");

        manager.sortTasks(tasks);

        manager.searchTask(tasks, "Do homework");

        manager.searchTask(tasks, "Walk dog");

        manager.removeTask(tasks, "Feed the cat");

        manager.removeTask(tasks, "Clean room");

        manager.findLongestTask(tasks);

        manager.getTask(tasks, 1);

        manager.getTask(tasks, 10);
    }
}