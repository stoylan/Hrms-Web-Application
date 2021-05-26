package com.spring.hrms.entities.concretes;

import com.spring.hrms.entities.abstracts.User;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name="candidates")
public class Candidate extends User {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "nationality_number")
    private String nationalityNumber;

    @Column(name = "birth_date")
    private Date birthDate;
}
