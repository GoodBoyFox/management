package com.backstage.management.dao;


import com.backstage.management.entity.Content;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ProjectName: app
 * @Package: com.doctor.app.dao
 * @ClassName: ContentDao
 * @Author: ywj
 * @Description:
 * @Date: 2020/11/9 20:35
 */
@Mapper
public interface ContentDao {
    int insertContent(Content content);

    int updateContentSql(Content content);
}