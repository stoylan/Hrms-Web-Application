package Entities;

import Abstract.IEntity;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Customer implements IEntity {
    private int id;
    private String firstname;
    private String lastName;
    private Date dateOfBirth;
    private String nationalityId;

    public Customer(int id, String firstname, String lastName, Date dateOfBirth, String nationalityId) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
