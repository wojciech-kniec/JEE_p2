package com.isa.usersengine.cdi;

import com.isa.usersengine.domain.User;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface RandomUserCDIApplicationDao {
    @EJB
    User getRandomUser();
}
