package com.isa.usersengine;

import com.isa.usersengine.dao.UsersRepositoryDao;
import com.isa.usersengine.dao.UsersRepositoryDaoBean;
import com.isa.usersengine.repository.UsersRepository;

public class Main {
    public static void main(String[] args) {

        System.out.println("All stored names: ");
        new UsersRepositoryDaoBean()
                .getUsersList()
                .forEach(u -> System.out.println(u.getName()));
    }
}
