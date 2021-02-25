package com.wbs.example.demo.wbssoap.service;//package com.cads.wbs.wbssoap.service;

import com.wbs.example.demo.wbssoap.entity.UserInfo;
import com.wbs.example.demo.wbssoap.serviceheader.MonitorHeader;
import com.wbs.example.demo.wbssoap.serviceheader.ProviderResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;

/**
 * @author xiaohe
 * @description:
 * @date 2020/9/17 10:32
 */
@WebService(targetNamespace = "http://www.srrc.org.cn")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IQueryUser {

    @WebMethod(operationName = "M_QueryUser", action = "M_QueryUser")
    @Action(input = "M_QueryUser", output = "M_QueryUserResponse")
    @WebResult(name = "responsebody", targetNamespace = "http://www.srrc.org.cn")
    Responsebody query(
            @WebParam(partName = "MonitorHeader", mode = WebParam.Mode.IN, name = "MonitorHeader", targetNamespace = "http://www.srrc.org.cn", header = true)
                    MonitorHeader header,
            @WebParam(partName = "ProviderResponse", mode = WebParam.Mode.OUT, name = "ProviderResponse", targetNamespace = "http://www.srrc.org.cn", header = true)
                    javax.xml.ws.Holder<ProviderResponse> providerResponse,
            @WebParam(partName = "parameters", name = "requestbody", targetNamespace = "http://www.srrc.org.cn")
                    Requestbody parameters);
}
