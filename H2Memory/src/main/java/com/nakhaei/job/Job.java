package com.nakhaei.job;

import com.nakhaei.student.Student;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter

@Entity
@Table(name = "JOB")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="name",nullable = false)
    private String name;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "job")
    private Set<Student> students;

}
