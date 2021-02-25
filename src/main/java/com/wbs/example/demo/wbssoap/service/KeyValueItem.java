package com.wbs.example.demo.wbssoap.service;

import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
        "paraname",
        "paravalue"
})
@ToString
public class KeyValueItem {
    @XmlElement(namespace = "http://www.srrc.org.cn")
    private String paraname="paraname";
    @XmlElement(namespace = "http://www.srrc.org.cn")
    private String paravalue="paravalue";

    public KeyValueItem() {
    }

    public KeyValueItem(String paraname, String paravalue) {
        this.paraname = paraname;
        this.paravalue = paravalue;
    }

    public String getParaname() {
        return paraname;
    }

    public void setParaname(String paraname) {
        this.paraname = paraname;
    }

    public String getParavalue() {
        return paravalue;
    }

    public void setParavalue(String paravalue) {
        this.paravalue = paravalue;
    }
}
