import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskManager {
    public void addTask(List<String> tasks, String task) {
        try {
            if (task == null || task.trim().isEmpty()) {
                throw new InvalidTaskException("Error: Invalid task!");
            }
            tasks.add(task);
            System.out.println("Task added: " + task);
        } catch (InvalidTaskException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operation logged: addTask");
        }
    }
        public void sortTasks(List<String> tasks) {
            Collections.sort(tasks);
            System.out.println("Tasks sorted: " + tasks);
            System.out.println("Operation logged: sortTasks");
        }

        public void searchTask(List<String> tasks, String target) {
            int index = tasks.indexOf(target);
            if (index != -1) {
                System.out.println("Task found at index: " + index);
            } else {
                System.out.println("Task not found.");
            }
            System.out.println("Operation logged: searchTask");
        }

        public void removeTask(List<String> tasks, String task) {
            if (tasks.remove(task)) {
                System.out.println("Task removed: " + task);
            } else {
                System.out.println("Task not found. Nothing removed.");
            }
            System.out.println("Operation logged: removeTask");
        }

        public void findLongestTask(List<String> tasks) {
            String longest = "";
            for (String task : tasks) {
                if (task.length() > longest.length()) {
                    longest = task;
                }
            }
            System.out.println("Longest task: " + longest);
            System.out.println("Operation logged: findLongestTask");
        }

        public void getTask(List<String> tasks, int index) {
            try {
                System.out.println("Task at index " + index + ": " + tasks.get(index));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: Index out of bounds!");
            } finally {
                System.out.println("Operation logged: getTask");
            }
        }
    }


