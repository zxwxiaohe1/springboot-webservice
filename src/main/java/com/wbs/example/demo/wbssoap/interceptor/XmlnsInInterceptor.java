package com.wbs.example.demo.wbssoap.interceptor;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.transport.http.AbstractHTTPDestination;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * Created by cj on 2018/7/31.
 */

public class XmlnsInInterceptor extends AbstractPhaseInterceptor<Message> {
    private static Logger logger = LoggerFactory.getLogger(XmlnsInInterceptor.class);

    public XmlnsInInterceptor() {
        super(Phase.RECEIVE);
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        try {
            //指定CXF获取客户端的HttpServletRequest : http-request；
            HttpServletRequest request = (HttpServletRequest) message.get(AbstractHTTPDestination.HTTP_REQUEST);
            String ipAddress="";
            boolean flag = false;
            if (null != request) {
                ipAddress = getUserIpAddr(request); // 取客户端IP地址
                final String soapAction = request.getHeader("SOAPAction");
                logger.info("请求客户端的IP地址:{}, SOAPAction:{}", ipAddress, soapAction);
            }
        } catch (Exception e) {
            logger.error("cxf报文拦截器出现错误：", e);
        }
    }

    /**
     * 获取IP地址的方法
     * @param request
     * @return
     */
    private String getUserIpAddr(HttpServletRequest request) {
        //获取经过代理的客户端的IP地址; 排除了request.getRemoteAddr() 方法 在通过了Apache,Squid等反向代理软件就不能获取到客户端的真实IP地址了
        String ip = getIpAddr(request);
        if (ip != null && ip.indexOf(",") > 0) {
            logger.info("取到客户多个ip1====================" + ip);
            String[] arr = ip.split(",");
            ip = arr[arr.length - 1].trim();//有多个ip时取最后一个ip
            logger.info("取到客户多个ip2====================" + ip);
        }
        return ip;
    }

    private static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
