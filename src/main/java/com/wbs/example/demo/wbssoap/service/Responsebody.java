
package com.wbs.example.demo.wbssoap.service;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "error",
        "result"
})
@XmlRootElement(namespace = "http://www.srrc.org.cn", name = "responsebody")
public class Responsebody {
    @XmlElement(namespace = "http://www.srrc.org.cn")
    protected RequestError error;
    @XmlElement(namespace = "http://www.srrc.org.cn")
    protected RspUserInfo result;
}
