package com.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PageParams {
    @ApiModelProperty(value = "当前页码")
    private Long pageNo = 1L;

    @ApiModelProperty(value = "每页显示的记录数")
    private Long pageSize = 10L;

    public PageParams() {
    }

    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
