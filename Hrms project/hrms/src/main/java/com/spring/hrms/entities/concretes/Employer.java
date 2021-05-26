package com.spring.hrms.entities.concretes;

import com.spring.hrms.entities.abstracts.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Data
@Table(name = "employers")
public class Employer extends User {

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_page")
    private String webPage;

    @Column(name= "telephone_number")
    private String telephoneNumber;
}
