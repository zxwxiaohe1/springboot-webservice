package com.wbs.example.demo.wbssoap.service;//package com.cads.wbs.wbssoap.entity;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author xiaohe
 * @description:
 * @date 2020/9/17 10:33
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "M_QueryDeviceInfoResult", propOrder = {
        "id",
        "userName",
        "age"
})
public class RspUserInfo {
    @XmlElement(namespace = "http://www.srrc.org.cn")
    private String id;
    @XmlElement(namespace = "http://www.srrc.org.cn")
    private String userName;
    @XmlElement(namespace = "http://www.srrc.org.cn")
    private Integer age;
}
