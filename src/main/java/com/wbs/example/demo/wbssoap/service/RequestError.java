
package com.wbs.example.demo.wbssoap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RequestError complex type的 Java 类。
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestError", propOrder = {
        "code",
        "text",
        "type"
})
public class RequestError {
    @XmlElement(namespace = "http://www.srrc.org.cn")
    protected String code;
    @XmlElement(namespace = "http://www.srrc.org.cn")
    protected String text;
    @XmlElement(namespace = "http://www.srrc.org.cn")
    protected String type;

    /**
     * 获取code属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * 获取text属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getText() {
        return text;
    }

    /**
     * 设置text属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * 获取type属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

}
