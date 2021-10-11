package com.nakhaei.student;

import com.nakhaei.job.JobMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {JobMapper.class})
public interface StudentMapper {

    Student toStudent(StudentDTO studentDTO);
    StudentDTO toStudentDTO(Student student);

}
