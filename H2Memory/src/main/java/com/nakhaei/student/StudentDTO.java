package com.nakhaei.student;

import com.nakhaei.job.JobDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO {
    @ApiModelProperty(hidden = true)
    private Long id;
    @ApiModelProperty(required = true)
    private String name;
    @ApiModelProperty(required = true)
    private String family;

    private JobDTO job;

}
