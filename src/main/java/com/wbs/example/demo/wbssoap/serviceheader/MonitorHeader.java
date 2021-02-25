
package com.wbs.example.demo.wbssoap.serviceheader;

import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitorHeader", propOrder = {
        "bizKey",
        "bsCode",
        "transId",
        "psCode",
        "appCode",
        "appName",
        "platFormCode",
        "platFormName",
        "resCode1",
        "resCode2"
})
@ToString
public class MonitorHeader {

    @XmlElement(name = "BizKey")
    protected String bizKey;
    @XmlElement(name = "BSCode")
    protected String bsCode;
    @XmlElement(name = "TransId")
    protected String transId;
    @XmlElement(name = "PSCode")
    protected String psCode;
    protected String appCode;
    protected String appName;
    protected String platFormCode;
    protected String platFormName;
    protected String resCode1;
    protected String resCode2;

    /**
     * 获取bizKey属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getBizKey() {
        return bizKey;
    }

    /**
     * 设置bizKey属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBizKey(String value) {
        this.bizKey = value;
    }

    /**
     * 获取bsCode属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getBSCode() {
        return bsCode;
    }

    /**
     * 设置bsCode属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBSCode(String value) {
        this.bsCode = value;
    }

    /**
     * 获取transId属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getTransId() {
        return transId;
    }

    /**
     * 设置transId属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTransId(String value) {
        this.transId = value;
    }

    /**
     * 获取psCode属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getPSCode() {
        return psCode;
    }

    /**
     * 设置psCode属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPSCode(String value) {
        this.psCode = value;
    }

    /**
     * 获取appCode属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * 设置appCode属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAppCode(String value) {
        this.appCode = value;
    }

    /**
     * 获取appName属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getAppName() {
        return appName;
    }

    /**
     * 设置appName属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAppName(String value) {
        this.appName = value;
    }

    /**
     * 获取platFormCode属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getPlatFormCode() {
        return platFormCode;
    }

    /**
     * 设置platFormCode属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPlatFormCode(String value) {
        this.platFormCode = value;
    }

    /**
     * 获取platFormName属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getPlatFormName() {
        return platFormName;
    }

    /**
     * 设置platFormName属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPlatFormName(String value) {
        this.platFormName = value;
    }

    /**
     * 获取resCode1属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getResCode1() {
        return resCode1;
    }

    /**
     * 设置resCode1属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResCode1(String value) {
        this.resCode1 = value;
    }

    /**
     * 获取resCode2属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getResCode2() {
        return resCode2;
    }

    /**
     * 设置resCode2属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResCode2(String value) {
        this.resCode2 = value;
    }

}
