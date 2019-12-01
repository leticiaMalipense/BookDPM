package br.edu.ifsp.scl.bookdpm.model;

public class Book {

    private String name;
    private String author;
    private Integer yearPublication;
    private String genre;
    private String img;

    public Book(String name, String author, Integer yearPublication, String genre, String img){
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
        this.genre = genre;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(Integer yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
