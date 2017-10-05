package dao;

import model.Project;
import model.Task;
import model.User;

import java.util.Date;
import java.util.List;

public interface ITaskDAO extends IEntityDAO {

    Project getProject (Task task);

    Date getStartDate (Task task);

    Date getEndDate (Task task);

    int getManHours (Task task);

    int getDependTaskId ();

    List<Task> getAllTasksByProject (Project project);

    List<Task> getAllTasksByUser (User user);


}
