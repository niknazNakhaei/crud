package com.nakhaei.job;

public interface IJobService {
    Job save(Job job);

    Job getById(Long jobId);

}
