package com.nakhaei.job;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor

@Service
@Slf4j
public class JobServiceImpl implements  IJobService{

    private JobRepository jobRepository;

    @Override
    public Job save(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public Job getById(Long jobId) {
        Optional<Job> jobById = jobRepository.findById(jobId);
        return jobById.isPresent()? jobById.get():null;
    }
}
