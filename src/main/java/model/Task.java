package model;

import java.util.Date;

public class Task {

    private int id;
    private String name;
    private User owner;
    private Project project;
    private Date startDate;
    private Date endDate;
    private int manHours;
    private int dependTaskId;

    public Task(int id, String name, User owner, Project project, int manHours, int dependTaskId) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.project = project;
        this.manHours = manHours;
        this.dependTaskId = dependTaskId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getManHours() {
        return manHours;
    }

    public void setManHours(int manHours) {
        this.manHours = manHours;
    }

    public int getDependTaskId() {
        return dependTaskId;
    }

    public void setDependTask(int dependTaskId) {
        this.dependTaskId = dependTaskId;
    }
}
