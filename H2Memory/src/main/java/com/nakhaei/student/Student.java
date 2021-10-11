package com.nakhaei.student;

import com.nakhaei.job.Job;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "C_NAME")
    private String name;

    @Column(name = "C_LAST_NAME")
    private String family;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "C_JOB")
    private Job job;


}
