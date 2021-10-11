package com.nakhaei.student;


import com.nakhaei.job.IJobService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor

@Service
public class StudentServiceImpl implements IStudentService {

    private final StudentRepository sampleRepository;
    private final IJobService jobService;

    @Override
    public Student save(Student student) {
        student.setJob(student.getJob());
        return sampleRepository.save(student);
    }
}
