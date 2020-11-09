package com.backstage.management.service;


import com.backstage.management.entity.Column;
import com.backstage.management.util.Page;

/**
 * @ProjectName: Zhixiang
 * @Package: com.doctor.app.service
 * @ClassName: ArticleService
 * @Author: gwl
 * @Description:
 * @Date: 2020/11/9 20:37
 * @Version: 1.0
 */
public interface ArticleService {

    Page<Column> getAllColumn(Integer CurrentPage);

    Column getColumnBuId(Integer id);

    int updateColumn(Column column);

    int insertColumn(Column column);

    int deleteColumn(Integer id);
}
