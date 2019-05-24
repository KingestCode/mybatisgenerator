package com.quanyou.entity.common;

import java.io.Serializable;
import java.util.Date;

public class MallDefinitionPageInfo implements Serializable {
    private Integer difinitionPageId;

    private Date createTime;

    private Date modifiedTime;

    private String pageInfo;

    private static final long serialVersionUID = 1L;

    public Integer getDifinitionPageId() {
        return difinitionPageId;
    }

    public void setDifinitionPageId(Integer difinitionPageId) {
        this.difinitionPageId = difinitionPageId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(String pageInfo) {
        this.pageInfo = pageInfo == null ? null : pageInfo.trim();
    }
}