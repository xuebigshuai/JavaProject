package com.icss.it.pbs.pbsareainfo.model;

import java.util.Date;

public class PbsAreaInfo {

    private String uuid;

    private Integer areaCode;

    private Integer areaType;

    private String areaName;

    private Date createTime;

    private String createrUuid;

    private String createrName;

    private String modifierUuid;

    private String modifierName;

    private Date modifyTime;

    private Integer infoOrder;

    private Integer isDelete;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public Integer getAreaType() {
        return areaType;
    }

    public void setAreaType(Integer areaType) {
        this.areaType = areaType;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreaterUuid() {
        return createrUuid;
    }

    public void setCreaterUuid(String createrUuid) {
        this.createrUuid = createrUuid;
    }

    public String getCreaterName() {
        return createrName;
    }

    public void setCreaterName(String createrName) {
        this.createrName = createrName;
    }

    public String getModifierUuid() {
        return modifierUuid;
    }

    public void setModifierUuid(String modifierUuid) {
        this.modifierUuid = modifierUuid;
    }

    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getInfoOrder() {
        return infoOrder;
    }

    public void setInfoOrder(Integer infoOrder) {
        this.infoOrder = infoOrder;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}
