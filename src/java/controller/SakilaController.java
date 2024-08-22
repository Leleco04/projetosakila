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
@WebServlet(name = "SakilaController", urlPatterns = {"/SakilaController", "/sakila", "/cadastrar", "/editar", "/excluir"})
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
        FilmesDAO filmesDAO = new FilmesDAO();

        if (paginaAtual.equals("/sakila")) {
            List<Filmes> filmes = filmesDAO.ler();
            request.setAttribute("filmes", filmes);
            request.getRequestDispatcher("/WEB-INF/jsp/sakila.jsp").forward(request, response);
        } else if (paginaAtual.equals("/cadastrar")) {
            request.getRequestDispatcher("/WEB-INF/jsp/cadastrar.jsp").forward(request, response);
        } else if (paginaAtual.equals("/editar")) {
            int id = Integer.parseInt(request.getParameter("filme"));
            Filmes filmeAtual = filmesDAO.selecionarFilme(id);
            request.setAttribute("title", filmeAtual.getTitle());
            request.setAttribute("description", filmeAtual.getDescription());
            request.setAttribute("release_year", filmeAtual.getRelease_date());
            request.setAttribute("film_id", id);
            request.getRequestDispatcher("/WEB-INF/jsp/editar.jsp").forward(request, response);
        } else if(paginaAtual.equals("/excluir")) {
            int id = Integer.parseInt(request.getParameter("filme"));
            filmesDAO.excluirFilme(id);
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
        Filmes novoFilme = new Filmes();
        FilmesDAO filmes = new FilmesDAO();
        
        if(paginaAtual.equals("/cadastrar")) {
            
            novoFilme.setTitle(request.getParameter("title"));
            novoFilme.setDescription(request.getParameter("description"));
            novoFilme.setRelease_date(Integer.parseInt(request.getParameter("release_year")));;

            filmes.cadastrarFilme(novoFilme);
            
            response.sendRedirect("sakila");  
            
        } else if(paginaAtual.equals("/editar")) {
            
            int id = Integer.parseInt(request.getParameter("film_id"));
            novoFilme.setTitle(request.getParameter("title"));
            novoFilme.setDescription(request.getParameter("description"));
            novoFilme.setRelease_date(Integer.valueOf(request.getParameter("release_year")));
            filmes.editarFilme(novoFilme, id);
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
