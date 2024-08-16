package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Filmes;

public class FilmesDAO {
    public List<Filmes> ler() {
        List<Filmes> filmes = new ArrayList();
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            stmt = conexao.prepareStatement("select * from film");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Filmes filme = new Filmes();
                filme.setFilm_id(rs.getInt("film_id"));
                filme.setTitle(rs.getString("title"));
                filme.setDescription(rs.getString("description"));
                filme.setRelease_date(rs.getInt("release_year"));
                
                filmes.add(filme);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
  
        return filmes;
    } 
    
    public void cadastrarFilme(Filmes filme) {
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conexao.prepareStatement(
                    "insert into film (title, description, release_year) VALUES (?, ?, ?)"
            );
            
            stmt.setString(1, filme.getTitle());
            stmt.setString(2, filme.getDescription());
            stmt.setInt(3, filme.getRelease_date());
            stmt.executeUpdate(); 
            stmt.close();
            conexao.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }      
    }
}