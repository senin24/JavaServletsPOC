package dao;

import model.User;
import java.util.List;

public interface IEntityDAO<T extends BaseDaoEntity> {

    T getEntityById (int id);

    int getEntityId (T entity);

    String getEntityName (T entity);

    User getOwnerEntity (T entity);

    List<T> getAllEntity (Class daoClass);

}
