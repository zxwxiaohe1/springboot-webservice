package com.wbs.example.demo.wbssoap.service;

import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exinfo", propOrder = {
        "item",
})
@ToString
public class KeyValueList {
    @XmlElement(namespace = "http://www.srrc.org.cn")
    List<KeyValueItem> item;

    public List<KeyValueItem> getItem() {
        if (item == null)
            item = new ArrayList<>();
        return item;
    }
}
