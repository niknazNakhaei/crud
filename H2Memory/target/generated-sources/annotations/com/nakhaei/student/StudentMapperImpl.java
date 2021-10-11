package com.nakhaei.student;

import com.nakhaei.job.JobMapper;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-11T10:55:19+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Autowired
    private JobMapper jobMapper;

    @Override
    public Student toStudent(StudentDTO studentDTO) {
        if ( studentDTO == null ) {
            return null;
        }

        Student student = new Student();

        student.setId( studentDTO.getId() );
        student.setName( studentDTO.getName() );
        student.setFamily( studentDTO.getFamily() );
        student.setJob( jobMapper.toJob( studentDTO.getJob() ) );

        return student;
    }

    @Override
    public StudentDTO toStudentDTO(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId( student.getId() );
        studentDTO.setName( student.getName() );
        studentDTO.setFamily( student.getFamily() );
        studentDTO.setJob( jobMapper.toJobDTO( student.getJob() ) );

        return studentDTO;
    }
}
