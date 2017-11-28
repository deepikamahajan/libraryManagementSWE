package hu.uni.miskolc.iit.sweng.libraryManagement.core.model;

import com.sun.xml.internal.ws.spi.db.DatabindingException;
import hu.uni.miskolc.iit.sweng.libraryManagement.model.Author;

import java.util.Date;
import java.util.List;

public class Book {

    private List<Author> _author;
    private final String _title;
    private int _Department_Id;
   private String _Name;
    private String _Edition;
    private Double __Price;
    private String _publication;

    public Book(List<Author> author, String title,int Department_Id, String Name,String Edition,Double Price,String publication) {
        this._author=author;
        this._title = title;
        this._Department_Id=Department_Id;
        this._Name=Name;
        this._Edition=Edition;
        this.__Price=Price;
        this._publication=publication;
    }
    public String get_publication() {
        return _publication;
    }

    public void set_author(List<Author> _author) {
        this._author = _author;
    }

    public void set__Price(Double __Price) {
        this.__Price = __Price;
    }

    public void set_Department_Id(int _Department_Id) {
        this._Department_Id = _Department_Id;
    }

    public void set_Edition(String _Edition) {
        this._Edition = _Edition;
    }

    public void set_Name(String _Name) {
        this._Name = _Name;
    }

    public void set_publication(String _publication) {
        this._publication = _publication;
    }

    public int get_Department_Id() {
        return _Department_Id;
    }

    public Double get__Price() {
        return __Price;
    }

    public List<Author> get_author() {
        return _author;
    }

    public String get_Edition() {
        return _Edition;
    }

    public String get_Name() {
        return _Name;
    }

    public String get_title() {
        return _title;
    }
}
