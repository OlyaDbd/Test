package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Book {
    private final SimpleDateFormat
            format = new SimpleDateFormat("dd.MM.yyyy");

    private String bookName;
    private String author;
    private Date releaseDate;
    private String genre;
    private double rating;

    public Book(String inf) throws Exception {
        String[] words = inf.split(";");
        if (words.length < 5) {
            throw new Exception();
        }
        bookName = words[0];
        author = words[1];
        releaseDate = format.parse(words[2]);
        genre = words[3];
        rating = Double.parseDouble(words[4]);
    }

    @Override
    public String toString() {
        return "Books{" +
                "format=" + format +
                ", bookName=" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return rating == book.rating &&
                bookName.equals(book.bookName) &&
                author.equals(book.author) &&
                releaseDate.equals(book.releaseDate) &&
                genre.equals(book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, releaseDate, genre, rating);
    }

    public void setBookName() {
        this.bookName = bookName;
    }

    public void setAuthor() {
        this.author = author;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setGenre() {
        this.genre = genre;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
