package controller;

import model.Project;
import model.Task;
import model.User;

import java.util.List;

public class ApplicationSettings {

    private List<User> users;
    private List<Task> tasks;
    private List<Project> projects;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
