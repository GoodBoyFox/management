package com.backstage.management.service;


import com.backstage.management.entity.Content;

/**
 * @ProjectName: app
 * @Package: com.doctor.app.service
 * @ClassName: ContentService
 * @Author: ywj
 * @Description:
 * @Date: 2020/11/9 20:29
 */
public interface ContentService {

    int insertContent(Content content);

    int updateContentSql(Content content);
}
