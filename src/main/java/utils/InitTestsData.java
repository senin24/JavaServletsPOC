package utils;

import controller.ApplicationSettings;
import dao.ProjectDao;
import dao.TaskDAO;
import dao.UserDao;
import model.Project;
import model.Role;
import model.Task;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class InitTestsData {

    public static ApplicationSettings getInitData() {

        ApplicationSettings applicationSettings = new ApplicationSettings();

        List<User> users = new ArrayList<User>();
        users.add(new User(0, "admin", "admin", "Admin", Role.ADMIN, true, null ));
        users.add(new User(1, "manager", "manager", "Manager", Role.MANAGER, true, users.get(0) ));
        users.add(new User(2, "developer1", "developer1", "Developer1", Role.USER, true, users.get(1) ));
        users.add(new User(3, "developer2", "developer2", "Developer2", Role.USER, true, users.get(1) ));
        users.add(new User(4, "tester", "tester", "Tester", Role.USER, true, users.get(1) ));
        applicationSettings.setUsers(users);
        UserDao.setUsers(users);

        List<Project> projects = new ArrayList<Project>();
        projects.add(new Project(0, "Project01", users.get(1), "wiki.local/project01"));
        projects.add(new Project(1, "Project02", users.get(1), "wiki.local/project02"));
        projects.add(new Project(2, "Project03", users.get(1), "wiki.local/project03"));
        applicationSettings.setProjects(projects);
        ProjectDao.setProjects(projects);

        List<Task> tasks = new ArrayList<Task>();
        tasks.add(new Task(110, "Task_110", users.get(2), projects.get(0), 0, 0));
        tasks.add(new Task(120, "Task_120", users.get(3), projects.get(0), 0, 0));
        tasks.add(new Task(130, "Task_130", users.get(4), projects.get(0), 0, 0));
        tasks.add(new Task(140, "Task_140", users.get(2), projects.get(1), 0, 0));
        tasks.add(new Task(150, "Task_110", users.get(4), projects.get(1), 0, 0));
        tasks.add(new Task(160, "Task_110", users.get(3), projects.get(2), 0, 0));
        tasks.add(new Task(170, "Task_110", users.get(4), projects.get(2), 0, 0));
        applicationSettings.setTasks(tasks);
        TaskDAO.setTasks(tasks);

        return applicationSettings;
    }
}
