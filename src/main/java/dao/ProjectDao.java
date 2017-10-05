package dao;

import model.Project;
import model.User;

import java.util.List;

public class ProjectDao extends BaseDaoEntity implements IProjectDAO {

    private static List<Project> projects;

    public static List<Project> getProjects() {
        return projects;
    }

    public static void setProjects(List<Project> setProjects) {
        projects = setProjects;
    }

    public String getWikiUrl(Project project) {
        return null;
    }

    public List<Project> getAllProjectsByManager(User user) {
        return null;
    }
}
