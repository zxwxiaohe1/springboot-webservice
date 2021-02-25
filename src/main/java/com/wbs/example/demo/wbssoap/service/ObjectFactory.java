
package com.wbs.example.demo.wbssoap.service;

import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cdhr.bmc.interconnectserver.domain.wsclient.m_queryfacilityinfo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
@SuppressWarnings("unused")
public class ObjectFactory {

    private final static QName _ProviderResponse_QNAME = new QName("http://www.srrc.org.cn", "ProviderResponse");
    private final static QName _Requestbody_QNAME = new QName("http://www.srrc.org.cn", "requestbody");
    private final static QName _MonitorHeader_QNAME = new QName("http://www.srrc.org.cn", "MonitorHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cdhr.bmc.interconnectserver.domain.wsclient.m_queryfacilityinfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Requestbody }
     * 
     */
    public Requestbody createRequestbody() {
        return new Requestbody();
    }

//    /**
//     * Create an instance of {@link ProviderResponse }
//     *
//     */
//    public ProviderResponse createProviderResponse() {
//        return new ProviderResponse();
//    }
//
//    /**
//     * Create an instance of {@link MQueryFacilityInfoResponsebody }
//     *
//     */
//    public MQueryFacilityInfoResponsebody createResponsebody() {
//        return new MQueryFacilityInfoResponsebody();
//    }
//
//    /**
//     * Create an instance of {@link RequestError }
//     *
//     */
//    public RequestError createRequestError() {
//        return new RequestError();
//    }
//
//    /**
//     * Create an instance of {@link DetailedFacilityInfo }
//     *
//     */
//    public DetailedFacilityInfo createMQueryFacilityInfoResult() {
//        return new DetailedFacilityInfo();
//    }
//
//    /**
//     * Create an instance of {@link MonitorHeader }
//     *
//     */
//    public MonitorHeader createMonitorHeader() {
//        return new MonitorHeader();
//    }
//
//    /**
//     * Create an instance of {@link Item }
//     *
//     */
//    public Item createItem() {
//        return new Item();
//    }
//
//    /**
//     * Create an instance of {@link Exinfo }
//     *
//     */
//    public Exinfo createExinfo() {
//        return new Exinfo();
//    }
//
//    /**
//     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderResponse }{@code >}}
//     *
//     */
//    @XmlElementDecl(namespace = "http://www.srrc.org.cn", name = "ProviderResponse")
//    public JAXBElement<ProviderResponse> createProviderResponse(ProviderResponse value) {
//        return new JAXBElement<>(_ProviderResponse_QNAME, ProviderResponse.class, null, value);
//    }
//
//    /**
//     * Create an instance of {@link JAXBElement }{@code <}{@link MQueryFacilityInfoRequestbody }{@code >}}
//     *
//     */
//    @XmlElementDecl(namespace = "http://www.srrc.org.cn", name = "requestbody")
//    public JAXBElement<MQueryFacilityInfoRequestbody> createRequestbody(MQueryFacilityInfoRequestbody value) {
//        return new JAXBElement<>(_Requestbody_QNAME, MQueryFacilityInfoRequestbody.class, null, value);
//    }
//
//    /**
//     * Create an instance of {@link JAXBElement }{@code <}{@link MonitorHeader }{@code >}}
//     *
//     */
//    @XmlElementDecl(namespace = "http://www.srrc.org.cn", name = "MonitorHeader")
//    public JAXBElement<MonitorHeader> createMonitorHeader(MonitorHeader value) {
//        return new JAXBElement<>(_MonitorHeader_QNAME, MonitorHeader.class, null, value);
//    }

}
