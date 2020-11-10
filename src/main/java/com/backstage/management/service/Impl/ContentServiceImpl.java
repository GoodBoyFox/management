package com.backstage.management.service.Impl;


import com.backstage.management.dao.ContentDao;
import com.backstage.management.entity.Content;
import com.backstage.management.entity.Content;
import com.backstage.management.service.ContentService;
import com.backstage.management.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: app
 * @Package: com.doctor.app.service.Impl
 * @ClassName: ContentServiceImpl
 * @Author: ywj
 * @Description:
 * @Date: 2020/11/9 20:33
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentDao contentDao;

    @Override
    public int insertContent(Content content) {

        int  i = contentDao.insertContent(content);

        return i;
    }

    @Override
    public int updateContentSql(Content content) {

        int  i = contentDao.updateContentSql(content);
        return i;
    }

    @Override
    public int deleteContent(Integer id) {
        int i = contentDao.deleteContent(id);
        return i;
    }

    @Override
    public Page<Content> selectAllContent(Integer CurrentPage) {

        Page<Content> page = new Page<>();
        PageHelper.startPage(CurrentPage,10);
        List<Content> Contents = contentDao.selectAllContent();
        PageInfo<Content> info = new PageInfo<>(Contents);
        page.setCurrentnumber(info.getPageNum());
        page.setCurrentpage(CurrentPage);
        page.setPagecount(info.getPages());
        page.setTotalnumber((int) info.getTotal());
        page.setDatalist(info.getList());
        return page;
    }

    @Override
    public Content selectContentById(Integer id) {

        return contentDao.selectContentById(id);
    }

}
