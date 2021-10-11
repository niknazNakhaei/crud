package com.nakhaei.job;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JobMapper {

    Job toJob(JobDTO jobDTO);
    JobDTO toJobDTO(Job job);
}
