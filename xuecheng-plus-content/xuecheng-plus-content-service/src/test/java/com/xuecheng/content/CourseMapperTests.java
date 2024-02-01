/**
 * @description mapper test
 * @date 2024/2/1 11:24
 * @version 1.0
 */

package com.xuecheng.content;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.mapper.CourseBaseMapper;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.model.dto.QueryCourseParamsDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CourseMapperTests {

    @Autowired
    CourseBaseMapper courseBaseMapper;

    @Test
    public void testCourseMapper(){
        CourseBase courseBase = courseBaseMapper.selectById(18);
        Assertions.assertNotNull(courseBase);
        // 分页查询
        // 拼装查询条件
        QueryCourseParamsDto queryCourseParamsDto = new QueryCourseParamsDto();
        queryCourseParamsDto.setCourseName("Java");

        LambdaQueryWrapper<CourseBase> courseBaseLambdaQueryWrapper = new LambdaQueryWrapper<>();
        //根据名称模糊查询
        courseBaseLambdaQueryWrapper.like(StringUtils.isNotBlank(queryCourseParamsDto.getCourseName()),
                CourseBase::getName, queryCourseParamsDto.getCourseName());
        //根据审核状态查询
        courseBaseLambdaQueryWrapper.eq(StringUtils.isNotBlank(queryCourseParamsDto.getAuditStatus()),
                CourseBase::getAuditStatus, queryCourseParamsDto.getAuditStatus());
        //分页, 当前页码，每页记录数
        Page<CourseBase> courseBasePage = new Page<>(1, 2);
        Page<CourseBase> page = courseBaseMapper.selectPage(courseBasePage, courseBaseLambdaQueryWrapper);
        PageResult<CourseBase> pageResult = new PageResult<CourseBase>(page.getRecords(), page.getTotal(), 1, 2);
        System.out.println(pageResult);
    }
}
