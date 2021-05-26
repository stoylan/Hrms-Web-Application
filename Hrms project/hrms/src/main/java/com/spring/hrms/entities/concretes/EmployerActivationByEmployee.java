package com.spring.hrms.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name = "employer_activation_by_employes")
public class EmployerActivationByEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "employer_id")
    private int employerId;

    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "is_confirmed")
    private boolean isConfirmed;

    @Column(name = "confirmed_date")
    private Date confirmedDate;
}
