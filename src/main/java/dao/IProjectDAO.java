package dao;

import model.Project;
import model.Task;
import model.User;

import java.util.List;

public interface IProjectDAO {

    String getWikiUrl (Project project);

    List<Project> getAllProjectsByManager (User user);

}
