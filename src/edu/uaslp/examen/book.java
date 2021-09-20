package edu.uaslp.examen;

public class book {
    private String title;
    private String isbn;
    private String author;
    private short stars;

    public String getTitle() {
        return title;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getAuthor() {
        return author;
    }
    public short getStars() {
        return stars;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setStars(short stars) {
        this.stars = stars;
    }
}
