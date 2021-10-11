package com.nakhaei.student;

import com.nakhaei.exception.BadRequestException;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor

@RestController
@RequestMapping("/student")
public class StudentController {


    private final IStudentService sampleService;
    private final StudentMapper studentMapper;

    @PostMapping("/save")
    public ResponseEntity<Void> save(@RequestBody StudentDTO studentDTO){
        Student student =studentMapper.toStudent(studentDTO);
        Student save = sampleService.save(student);
        if(save.getName().equals("niki"))
            throw new BadRequestException("it is not ok!!");
        return ResponseEntity.ok().build();
    }
}
