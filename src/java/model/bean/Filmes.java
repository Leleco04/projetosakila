package model.bean;

public class Filmes {
    private int film_id;
    private String title;
    private String description;
    private int release_date;

    public Filmes() {
    }

    public Filmes(int film_id, String title, String description, int release_date) {
        this.film_id = film_id;
        this.title = title;
        this.description = description;
        this.release_date = release_date;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    
}