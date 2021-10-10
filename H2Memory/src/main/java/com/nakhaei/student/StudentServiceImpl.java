package com.nakhaei.student;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor

@Service
public class StudentServiceImpl implements IStudentService {

    private StudentRepository sampleRepository;

    @Override
    public Student save(Student student) {
        return sampleRepository.save(student);
    }
}
