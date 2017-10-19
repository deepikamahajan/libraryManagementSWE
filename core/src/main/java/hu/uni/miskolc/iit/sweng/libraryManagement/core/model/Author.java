package hu.uni.miskolc.iit.sweng.libraryManagement.core.model;

import java.util.Date;

public class Author {

    private String name;
//    TODO: Add aliass to the author
//    private Set<String> alias;
    private String nationality;
    private Date birthDate;
    private Date decased;

    public Author(String name, String nationality, Date birthDate, Date decased) {
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.decased = decased;
    }

    public Author(String name, String nationality, Date birthDate) {
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
    }


    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getDecased() {
        return decased;
    }
}
