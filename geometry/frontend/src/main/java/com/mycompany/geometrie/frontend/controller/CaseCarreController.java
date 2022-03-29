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

@WebServlet(name = "CaseCarreControlle", urlPatterns = "/case-carre-controller")
public class CaseCarreController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession();

        RequestDispatcher requestDispatcher;

        String parametres = req.getParameter("parametres");


        switch (parametres){
            case ("cote"):
                session.setAttribute("parametres", parametres);
                double cote = Double.parseDouble((req.getParameter("cote")));
                Carre carre = new Carre(cote);
                session.setAttribute("cote", cote);


                Double perimetre = carre.calculerPerimetre();
                Double surface = carre.calculerSurface();
                session.setAttribute("perimetre",perimetre);
                session.setAttribute("surface",surface);
                requestDispatcher = req.getRequestDispatcher("/affich-result.jsp");
                requestDispatcher.forward(req, resp);
                break;
            default: out.println("probleme case carre controller " + parametres);
        }
    }
}
