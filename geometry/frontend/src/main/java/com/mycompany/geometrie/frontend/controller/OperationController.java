package com.mycompany.geometrie.frontend.controller;

import com.mycompany.geometrie.backend.entity.Carre;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "OperationServlet", urlPatterns = "/operation-servlet")
public class OperationController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession();

        RequestDispatcher requestDispatcher;

        String operation =req.getParameter("operation");

        switch (operation){
            case ("surface"):
                session.setAttribute("surface", operation);
                Carre carre = new Carre();

                    requestDispatcher = req.getRequestDispatcher("/case-carre.jsp");
                    requestDispatcher.forward(req, resp);


            case ("perimetre"):


            default: out.println("Probleme operation controller");

        }


    }
}
