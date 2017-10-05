package model;

import java.util.List;

public class Project {

    private int id;
    private String name;
    private User manager;
    private String wikiUrl;

    public Project(int id, String name, User manager, String wikiUrl) {
        this.id = id;
        this.name = name;
        this.manager = manager;
        this.wikiUrl = wikiUrl;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manager=" + manager +
                ", wikiUrl='" + wikiUrl + '\'' +
                '}';
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

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public String getWikiUrl() {
        return wikiUrl;
    }

    public void setWikiUrl(String wikiUrl) {
        this.wikiUrl = wikiUrl;
    }
}
