package com.isa.usersengine.dao;

import com.isa.usersengine.domain.User;
import com.sun.tools.javac.util.List;

public interface UsersRepositoryDao {

    void addUser(User user);

    void getUserByld(Long id);

    User getUserByLogin(String login);

    List<User> getUsersList();
}
