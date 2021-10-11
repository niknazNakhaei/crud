package com.nakhaei.job;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobDTO {
    @ApiModelProperty(hidden = true)
    private Long id;

    private String name;
}
