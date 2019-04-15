package com.isa.usersengine.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome-user")
public class WelcomeUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        if (name == null || name.isEmpty() || age==null || age.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        PrintWriter writer = resp.getWriter();
        writer.println("<!DOCTYPE html><html><body>");
        writer.println("Hello " + name + "age: " +age + "!");
        writer.println("</body></html>\n");

    }


}
