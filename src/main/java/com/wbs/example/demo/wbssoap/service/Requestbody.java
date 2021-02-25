package com.wbs.example.demo.wbssoap.service;

import javax.xml.bind.annotation.*;

/**
 * @author xiaohe
 * @description:
 * @date 2021/2/25 11:27
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestbody", propOrder = {
        "id",
        "age",
        "userName",
        "exinfo"
})
@XmlRootElement(namespace = "http://www.srrc.org.cn",name = "requestbody")
public class Requestbody {
    @XmlElement(namespace = "http://www.srrc.org.cn")
    protected String age;
    @XmlElement(namespace = "http://www.srrc.org.cn")
    protected String id;
    @XmlElement(namespace = "http://www.srrc.org.cn")
    protected String userName;
    @XmlElement(namespace = "http://www.srrc.org.cn")
    private KeyValueList exinfo;

    public KeyValueList getExinfo() {
        return exinfo;
    }

    public void setExinfo(KeyValueList exinfo) {
        this.exinfo = exinfo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
