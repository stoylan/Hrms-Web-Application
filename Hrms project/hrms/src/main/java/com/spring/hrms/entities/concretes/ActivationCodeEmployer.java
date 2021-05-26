package com.spring.hrms.entities.concretes;

import com.spring.hrms.entities.abstracts.ActivationCodes;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "activation_code_employers")
@Data
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class ActivationCodeEmployer extends ActivationCodes {
    private int employerId;
}
