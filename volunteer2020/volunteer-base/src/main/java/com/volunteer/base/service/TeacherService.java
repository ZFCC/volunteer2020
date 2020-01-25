package com.volunteer.base.service;


import com.volunteer.base.entity.FileUploadeDTO;
import com.volunteer.base.entity.QueryTeacherByPageDTO;
import com.volunteer.base.entity.Teacher;

import java.util.List;

public interface TeacherService {
    public Teacher findAllTeacher(String name);

    public int insertTeacher(Teacher teacher);

    public  int updateTeacher(Teacher teacher);

    public List<Teacher> selectByPage(QueryTeacherByPageDTO queryTeacherByPageDTO);

    public int photoUploade(FileUploadeDTO fileUploadeDTO);

    public FileUploadeDTO getPhotoByNumber(int id);
}
