package com.nakhaei.job;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-11T10:55:19+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class JobMapperImpl implements JobMapper {

    @Override
    public Job toJob(JobDTO jobDTO) {
        if ( jobDTO == null ) {
            return null;
        }

        Job job = new Job();

        job.setId( jobDTO.getId() );
        job.setName( jobDTO.getName() );

        return job;
    }

    @Override
    public JobDTO toJobDTO(Job job) {
        if ( job == null ) {
            return null;
        }

        JobDTO jobDTO = new JobDTO();

        jobDTO.setId( job.getId() );
        jobDTO.setName( job.getName() );

        return jobDTO;
    }
}
