package com.volunteer.web.dao;

import com.volunteer.base.entity.FileUploadeDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Copyright (C), 2002-2019,
 * FileName: FileUploadeDao
 * Author:  zfc
 * Date: 2019/10/31 14:57.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
@Mapper
@Repository
public interface FileUploadeDao {

    int photoUploade(FileUploadeDTO fileUploadeDTO);

    FileUploadeDTO getPhotoByUserNumber(int id);
}
