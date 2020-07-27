package com.hhr.search.service.impl;

import com.hhr.search.dao.EsVmhikeDao;
import com.hhr.search.domain.EssayDiary;
import com.hhr.search.service.EsVmhikeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 搜索service实现类
 */
public class EsVmhikeServiceImpl implements EsVmhikeService {

    @Autowired
    private EsVmhikeDao esVmhikeDao;


    @Override
    public int importAll() {
        List<EssayDiary>  esEssayDiaryList = esVmhikeDao.getAllEssayDiaryList(null);
        return 0;
    }
}
