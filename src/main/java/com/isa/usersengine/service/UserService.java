package com.isa.usersengine.service;

import com.isa.usersengine.dao.UsersRepositoryDao;
import com.isa.usersengine.dao.UsersRepositoryDaoBean;
import com.isa.usersengine.domain.User;

public class UserService {
    UsersRepositoryDao usersRepositoryDao = new UsersRepositoryDaoBean();

    public void saveUser(User user) {
        usersRepositoryDao.addUser(user);
    }

    public User findUserById(Long id) {
        return usersRepositoryDao.getUserById(id);
    }
}
