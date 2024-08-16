/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Filmes;
import model.dao.FilmesDAO;

/**
 *
 * @author Senai
 */
@WebServlet(name = "SakilaController", urlPatterns = {"/SakilaController", "/sakila", "/cadastrar"})
public class SakilaController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String paginaAtual = request.getServletPath();

        if (paginaAtual.equals("/sakila")) {
            FilmesDAO filmesDAO = new FilmesDAO();
            List<Filmes> filmes = filmesDAO.ler();
            request.setAttribute("filmes", filmes);
            request.getRequestDispatcher("/WEB-INF/jsp/sakila.jsp").forward(request, response);
        } else if (paginaAtual.equals("/cadastrar")) {
            request.getRequestDispatcher("/WEB-INF/jsp/cadastrar.jsp").forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String paginaAtual = request.getServletPath();
        
        if(paginaAtual.equals("/cadastrar")) {
            Filmes novoFilme = new Filmes();
            
            novoFilme.setTitle(request.getParameter("title"));
            novoFilme.setDescription(request.getParameter("description"));
            novoFilme.setRelease_date(Integer.parseInt(request.getParameter("release_year")));;

            FilmesDAO filmes = new FilmesDAO();
            filmes.cadastrarFilme(novoFilme);
            
            response.sendRedirect("sakila");    
        }
    }

    /**
     * Returns a short description of the servlet.
     *P
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
