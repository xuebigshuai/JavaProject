package com.it.po.pbspobaseinfo.model;

import java.math.BigDecimal;

public class PbsPoBaseInfo {

    private String uuid;

    private String poNo;

    private String outPoNumber;

    private String innerPoNumber;

    private String poName;

    private BigDecimal poAmount;

    private String deliverType;

    private Integer benCurrentType;

    private Integer situCurrentType;

    private String customName;

    private String corporation;

    private String onoffSite;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public String getOutPoNumber() {
        return outPoNumber;
    }

    public void setOutPoNumber(String outPoNumber) {
        this.outPoNumber = outPoNumber;
    }

    public String getInnerPoNumber() {
        return innerPoNumber;
    }

    public void setInnerPoNumber(String innerPoNumber) {
        this.innerPoNumber = innerPoNumber;
    }

    public String getPoName() {
        return poName;
    }

    public void setPoName(String poName) {
        this.poName = poName;
    }

    public BigDecimal getPoAmount() {
        return poAmount;
    }

    public void setPoAmount(BigDecimal poAmount) {
        this.poAmount = poAmount;
    }

    public String getDeliverType() {
        return deliverType;
    }

    public void setDeliverType(String deliverType) {
        this.deliverType = deliverType;
    }

    public Integer getBenCurrentType() {
        return benCurrentType;
    }

    public void setBenCurrentType(Integer benCurrentType) {
        this.benCurrentType = benCurrentType;
    }

    public Integer getSituCurrentType() {
        return situCurrentType;
    }

    public void setSituCurrentType(Integer situCurrentType) {
        this.situCurrentType = situCurrentType;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation;
    }

    public String getOnoffSite() {
        return onoffSite;
    }

    public void setOnoffSite(String onoffSite) {
        this.onoffSite = onoffSite;
    }
}
