package dao;

import model.Project;
import model.Task;
import model.User;

import java.util.Date;
import java.util.List;

public class TaskDAO extends BaseDaoEntity implements ITaskDAO {

    private static List<Task> tasks;

    public static List<Task> getTasks() {
        return tasks;
    }

    public static void setTasks(List<Task> setTasks) {
        tasks = setTasks;
    }

    public Project getProject(Task task) {
        return null;
    }

    public Date getStartDate(Task task) {
        return null;
    }

    public Date getEndDate(Task task) {
        return null;
    }

    public int getManHours(Task task) {
        return 0;
    }

    public int getDependTaskId() {
        return 0;
    }

    public List<Task> getAllTasksByProject(Project project) {
        return null;
    }

    public List<Task> getAllTasksByUser(User user) {
        return null;
    }
}
