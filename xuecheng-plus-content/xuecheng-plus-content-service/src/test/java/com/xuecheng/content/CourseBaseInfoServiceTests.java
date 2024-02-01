/**
 * @description mapper test
 * @date 2024/2/1 11:24
 * @version 1.0
 */

package com.xuecheng.content;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.service.CourseBaseInfoService;
import com.xuecheng.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CourseBaseInfoServiceTests {

    @Autowired
    CourseBaseInfoService courseBaseInfoService;

    @Test
    public void testCourseMapper(){
        // 查询条件
        QueryCourseParamsDto queryCourseParamsDto = new QueryCourseParamsDto();
        queryCourseParamsDto.setCourseName("Java");
        queryCourseParamsDto.setAuditStatus("202004");
        PageParams pageParams = new PageParams();
        pageParams.setPageSize(2L);
        pageParams.setPageNo(1L);
        PageResult<CourseBase> pageResult= courseBaseInfoService.queryCourseBaseList(pageParams, queryCourseParamsDto);
        System.out.println(pageResult);
    }
}
