package com.isa.usersengine.servlet;

import com.isa.usersengine.domain.User;
import com.isa.usersengine.service.UserService;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Inject
    UserService userService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        User user = new User();

        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String age = req.getParameter("age");

        user.setId(Long.valueOf(id));
        user.setName(String.valueOf(name));
        user.setLogin(String.valueOf(login));
        user.setPassword(String.valueOf(password));
        user.setAge(Integer.valueOf(age));

        userService.saveUser(user);

        resp.getWriter().println("User added with success!");
    }
}