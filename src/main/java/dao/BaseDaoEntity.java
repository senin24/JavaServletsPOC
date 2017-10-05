package dao;

import model.User;

import java.util.List;

abstract class BaseDaoEntity implements IEntityDAO {


    public BaseDaoEntity getEntityById(int id) {
        return null;
    }

    public int getEntityId(BaseDaoEntity entity) {
        return 0;
    }

    public String getEntityName(BaseDaoEntity entity) {
        return null;
    }

    public User getOwnerEntity(BaseDaoEntity entity) {
        return null;
    }

    public List getAllEntity(Class daoClass) {
        return null;
    }


}
