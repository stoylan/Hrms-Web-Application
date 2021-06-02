package com.spring.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobExperiences"})
public class JobExperiences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name ="job_id")
    @NotNull
    @NotBlank
    private Job job;

    @Column(name = "start_year")
    @NotNull
    @NotBlank
    private Date startYear;

    @Column(name = "finish_year")
    private Date finishYear;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;



}
