/**
 * @description coursebase接口
 * @date 2024/1/29 20:07
 * @version 1.0
 */

package com.xuecheng.content.api;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.model.dto.QueryCourseParamsDto;
import com.xuecheng.model.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "课程信息管理", tags = "课程信息管理接口")
@RestController
public class CourseBaseInfoController {

    @ApiOperation(value = "课程查询接口 ")
    @PostMapping("course/list")
    public PageResult<CourseBase> list(PageParams pageParams,
                                       @RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto){


        return null;
    }
}
