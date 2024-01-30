/**
 * @description 课程查询条件模型
 * @date 2024/1/29 17:13
 * @version 1.0
 */

package com.xuecheng.model.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class QueryCourseParamsDto {
    private String auditStatus;
    private String courseName;
    private String publishStatus;
}
