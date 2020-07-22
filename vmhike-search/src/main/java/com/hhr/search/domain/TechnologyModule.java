package com.hhr.search.domain;


import lombok.Data;

/**
 * 技术文章
 */
@Data
public class TechnologyModule {

    /**
     * 数据id
     */
    private Integer mId;

    /**
     * 发布人id
     */
    private Integer mPublishPersonId;

    /**
     * 文章类型id
     */
    private Integer mTypeId;

    /**
     * 文章标题
     */
    private String mTitle;

    /**
     *添加时间
     */
    private String mDataTime;

    /**
     *阅读量
     */
    private Integer mReadNum;

    /**
     *文章内容
     */
    private String mContent;

    /**
     *资源获取方式：原创——1；转载——2
     */
    private String mResourcesMode;

    /**
     *资源转载路径
     */
    private String mResourcesModeUrl;

    /**
     * 文章推荐 ：1:推荐；2不推荐
     */
    private String mFinePaste;

}
