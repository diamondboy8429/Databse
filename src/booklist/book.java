/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booklist;

/**
 *
 * @author ADMIN
 */
public class book {
    private String code;
    private String name;
    private String author;
    private String publisher;
    private String publishYear;
    private boolean forRen;

    public book() {
        this.code=null;
        this.name=null;
        this.author=null;
        this.publisher=null;
        this.publishYear=null;
        this.forRen=true;
    }

    public book(String code, String name, String author, String publisher, String publishYear, boolean forRen) {
        this.code = code;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.forRen = forRen;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public boolean isForRen() {
        return forRen;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public void setForRen(boolean forRen) {
        this.forRen = forRen;
    }
    
    
    
}
