package com.spring.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spring.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Data
@Table(name = "employers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","activationCodeEmployer","employerActivationByEmployee","jobAdvertisement"})
public class Employer extends User {

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_page")
    private String webPage;

    @Column(name= "telephone_number")
    private String telephoneNumber;

    @OneToOne(mappedBy = "employer")
    private ActivationCodeEmployer activationCodeEmployer;

    @OneToOne(mappedBy = "employer")
    private EmployerActivationByEmployee employerActivationByEmployee;

    @OneToMany(mappedBy="employer")
    private List<JobAdvertisement> jobAdvertisement;

}
