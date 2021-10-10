package com.nakhaei.student;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    Student toStudent(StudentDTO studentDTO);
    StudentDTO toStudentDTO(Student student);

}
