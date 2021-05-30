package com.spring.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spring.hrms.entities.abstracts.ActivationCodes;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "activation_code_candidates")
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","candidate"})
public class ActivationCodeCandidate extends ActivationCodes {

   // @Column(name = "candidate_id")
   // private int candidateId;

    @OneToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

}
