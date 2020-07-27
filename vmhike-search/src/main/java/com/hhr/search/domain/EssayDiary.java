package com.hhr.search.domain;

import lombok.Data;

/**
 * 随笔日记
 */
@Data
public class EssayDiary {

    /**
     * 数据id
     */
    private Integer eId;

    /**
     * 发表日记人id
     */
    private Integer eUid;

    /**
     * 阅读量
     */
    private Integer eReadNumber;

    /**
     * 留言状态
     */
    private String eStatus;

    /**
     * 添加时间
     */
    private String eAddTime;

    /**
     * 日记类别
     */
    private String eType;

    /**
     * 日记标题
     */
    private String eTitle;

    /**
     * 封面图片
     */
    private String eUrl;

    /**
     * 日记内容
     */
    private String eContent;

    /**
     * 随笔文章产生方式：原创——1；转载——2；
     */
    private String eResourcesMode;

    /**
     * 资源转载路径
     */
    private String eResourcesModeUrl;

    /**
     * 是否设置为精贴：1：是；0：否
     */
    private String eFinePaste;
}
