package com.hhr.search.dao;

import com.hhr.search.domain.EssayDiary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EsVmhikeDao {

    List<EssayDiary> getAllEssayDiaryList(@Param("id") Long id);
}
