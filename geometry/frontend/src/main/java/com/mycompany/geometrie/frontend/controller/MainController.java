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

@WebServlet(name = "MainController", urlPatterns = "/main-controller")
public class MainController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession();

        RequestDispatcher requestDispatcher;

        //String operationEffectuee = req.getParameter("operationEffectuee");
        String figure = req.getParameter("figure");
//        if (operationEffectuee == null) {
//            // Redirection
//            requestDispatcher = req.getRequestDispatcher("/ask-figure.jsp");
//            requestDispatcher.forward(req, resp);
//        }
        switch (figure){
            case ("carre"):
                session.setAttribute("figure",figure);
                requestDispatcher = req.getRequestDispatcher("/ask-operation.jsp");
                requestDispatcher.forward(req, resp);


            default:
                out.println("Problem Main Controller");

        }

            /*switch (operationEffectuee){
                case ("ask-figure"):
                    String figure = req.getParameter("figure");
                    session.setAttribute("figure", figure);


                    if (figure.equals("carre")){


                        requestDispatcher = req.getRequestDispatcher("/case-carre.jsp");
                        requestDispatcher.forward(req, resp);

                        String parametres = req.getParameter("parametres");
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
                    }
                break;
//                case ("ask-operation"):
//                    String operation = req.getParameter("operation");
//                    session.setAttribute("operation", operation);
                default:
                    out.println("kfduhgwdktjhgqwd");
            }*/


        }

}
