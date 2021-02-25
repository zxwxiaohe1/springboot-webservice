
package com.wbs.example.demo.wbssoap.serviceheader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderResponse", propOrder = {
        "bizResCd",
        "bizResText"
})
public class ProviderResponse {

    protected String bizResCd = "BIZ-000001";
    protected String bizResText = "Success";

    /**
     * 获取bizResCd属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getBizResCd() {
        return bizResCd;
    }

    /**
     * 设置bizResCd属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBizResCd(String value) {
        this.bizResCd = value;
    }

    /**
     * 获取bizResText属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getBizResText() {
        return bizResText;
    }

    /**
     * 设置bizResText属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBizResText(String value) {
        this.bizResText = value;
    }

}
