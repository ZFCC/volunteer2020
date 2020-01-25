package com.volunteer.web.dao;


import com.volunteer.base.entity.QueryTeacherByPageDTO;
import com.volunteer.base.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherDao {

    Teacher selectTeacherByName(String name);

    public int insetTeacher(Teacher teacher);

    public int updateTeacher(Teacher teacher);


    List<Teacher> selectByPage(QueryTeacherByPageDTO queryTeacherByPageDTO);
}
