package com.wbs.example.demo.wbssoap.cxfwbs;//package com.cads.wbs.wbssoap.cxfwbs;
import com.wbs.example.demo.wbssoap.interceptor.XmlnsOutInterceptor;
import com.wbs.example.demo.wbssoap.service.IQueryUser;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;


/**
 * @author xiaohe
 * @description:
 * @date 2020/9/17 10:37
 */
@Configuration
public class CreateWbs {
    /**
     * 此方法作用是改变项目中服务名的前缀名，此处127.0.0.1或者localhost不能访问时，请使用ipconfig查看本机ip来访问
     * 此方法被注释后:wsdl访问地址为http://127.0.0.1:8080/services/user?wsdl
     * 去掉注释后：wsdl访问地址为：http://127.0.0.1:8080/soap/user?wsdl
     * @return
     */
//    @SuppressWarnings("all")
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new CXFServlet(), "/soap/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public Endpoint endpoint(IQueryUser iQueryUser) {
        /**绑定要发布的服务*/
        EndpointImpl endpoint=new EndpointImpl(springBus(), iQueryUser);
        addIntercepter(endpoint);
        endpoint.publish("/user");
        return endpoint;
    }


    private void addIntercepter(EndpointImpl endpoint)
    {
        endpoint.getOutInterceptors().add(new XmlnsOutInterceptor());
//        if(systemConfig.isSoapInLogEnable())
//        {
            endpoint.getInInterceptors().add(new LoggingInInterceptor());
//        }
//        if(systemConfig.isSoapOutLogEnable())
//        {
//            endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
//        }
    }
}
