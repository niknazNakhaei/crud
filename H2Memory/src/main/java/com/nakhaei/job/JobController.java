package com.nakhaei.job;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor

@RestController
@RequestMapping(name = "/job")
public class JobController {

    private final IJobService jobService;
    private final JobMapper jobMapper;

    @PostMapping("/save")
    public ResponseEntity<Void> save(@RequestBody JobDTO jobDTO){
        Job job = jobMapper.toJob(jobDTO);
        jobService.save(job);
        return ResponseEntity.ok().build();
    }
}
