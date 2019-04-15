package com.isa.usersengine.servlet;

import com.isa.usersengine.domain.User;
import com.isa.usersengine.service.UserService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/find-user-by-id")
public class FindUserByIdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        UserService userService = new UserService();

        String idParam = req.getParameter("id");
        PrintWriter writer = resp.getWriter();
        if (idParam == null || idParam.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        Long id = Long.parseLong(idParam);
        User userbyId = userService.findUserById(id);

        if (userbyId != null) {
            writer.println("Name: " + userbyId.getName());
            writer.println("Login: " + userbyId.getLogin());
        } else {
            writer.println("User has not been found!");
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

    }
}
