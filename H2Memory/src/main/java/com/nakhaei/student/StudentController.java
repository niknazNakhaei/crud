package com.nakhaei.student;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor

@RestController
@RequestMapping("/sample")
public class StudentController {


    private final IStudentService sampleService;
    private final StudentMapper studentMapper;

    @PostMapping("/save")
    public ResponseEntity<Void> save(@RequestBody StudentDTO studentDTO){
        Student student =studentMapper.toStudent(studentDTO);
        sampleService.save(student);
        return ResponseEntity.ok().build();
    }
}
