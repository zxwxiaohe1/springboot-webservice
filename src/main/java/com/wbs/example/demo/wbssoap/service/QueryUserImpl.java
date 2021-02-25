package com.wbs.example.demo.wbssoap.service;//package com.cads.wbs.wbssoap.service;

import com.wbs.example.demo.wbssoap.entity.UserInfo;
import com.wbs.example.demo.wbssoap.serviceheader.MonitorHeader;
import com.wbs.example.demo.wbssoap.serviceheader.ProviderResponse;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.Holder;

/**
 * @author xiaohe
 * @description:
 * @date 2020/9/17 10:34
 */
@WebService(targetNamespace = "http://www.srrc.org.cn", endpointInterface = "com.wbs.example.demo.wbssoap.service.IQueryUser")
@Service
public class QueryUserImpl implements IQueryUser {

    @Override
    public Responsebody query(MonitorHeader header, Holder<ProviderResponse> providerResponse, Requestbody parameters) {
        if (parameters.getId() == null) {
            throw new IllegalArgumentException("参数user不能为null");
        }
        ProviderResponse providerResponset = new ProviderResponse();
        providerResponset.setBizResText("2131");
        providerResponset.setBizResCd("dsgfsd");
        providerResponse.value = providerResponset;
        Responsebody responsebody = new Responsebody();
        RspUserInfo rspUserInfo = new RspUserInfo();
        rspUserInfo.setId(parameters.getId());
        rspUserInfo.setAge(67);
        rspUserInfo.setUserName(parameters.getUserName());
        responsebody.setResult(rspUserInfo);
        RequestError requestError = new RequestError();
        requestError.setCode("erro-09");
        requestError.setText("error content");
        requestError.setType("error type");
        responsebody.setError(requestError);
        return responsebody;
    }
}