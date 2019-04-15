package com.isa.usersengine.servlet;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/myFirstServlet")
public class HelloServlet extends HttpServlet {

    @Override
    protected void  doGet (HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.getWriter().println("Hello world from my first servlet");

    }
}
