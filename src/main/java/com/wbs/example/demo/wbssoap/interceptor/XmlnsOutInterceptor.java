package com.wbs.example.demo.wbssoap.interceptor;

import com.wbs.example.demo.wbssoap.serviceheader.ProviderResponse;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.databinding.DataBinding;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cj on 2018/7/31.
 */

public class XmlnsOutInterceptor extends AbstractPhaseInterceptor<Message> {
    private static Logger logger = LoggerFactory.getLogger(XmlnsOutInterceptor.class);

    public XmlnsOutInterceptor() {
        super(Phase.PREPARE_SEND);
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        try {
            //需要放置在根节点的命名空间
            Map<String, String> envMap = new HashMap<>();
            envMap.put("soapenv", "http://schemas.xmlsoap.org/soap/envelope/");
            envMap.put("srrc", "http://www.srrc.org.cn");

            //在命名空间下的元素都以自定义前缀生成
            Map<String, String> namespaceMap = new HashMap<>();
            namespaceMap.put("http://www.srrc.org.cn", "srrc");
            namespaceMap.put("http://schemas.xmlsoap.org/soap/envelope/", "soapenv");
            JAXBDataBinding dataBinding = (JAXBDataBinding) message.getExchange().getEndpoint().getService()
                    .getDataBinding();
            dataBinding.setNamespaceMap(namespaceMap);

            message.put("soap.env.ns.map", envMap);
            message.put("disable.outputstream.optimization", true);

            //创建DataBinding
            //创建QName
//            String namespaceURI = "http://www.srrc.org.cn";
//            String localPart = "ProviderResponse";
//            String prefix = "srrc";
//            QName qname = new QName(namespaceURI, localPart, prefix);
//            DataBinding rspHeaderDataBinding = new JAXBDataBinding(ProviderResponse.class);
//            ProviderResponse providerResponse = new ProviderResponse();
//            providerResponse.setBizResCd("providerResponse");
//            providerResponse.setBizResText("providerResponse text");
//            //创建Header
//            Header header = new Header(qname, providerResponse, rspHeaderDataBinding);
//            //将header加入到SOAP头集合中
//            headers.add(header);
        } catch (Exception e) {
            logger.error("cxf报文拦截器出现错误：", e);
        }
    }
}
