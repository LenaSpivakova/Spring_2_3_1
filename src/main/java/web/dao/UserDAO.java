package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    void save(User user);
    void delete(long id);
    User get(long id);
    List<User> getAll();

}
