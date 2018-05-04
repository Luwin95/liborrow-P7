
package com.liborrow.webinterface.generated.model;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ItemService", targetNamespace = "model.generated.webinterface.liborrow.com", wsdlLocation = "http://localhost:80/liborrow-webservice-webapp/item?wsdl")
public class ItemService
    extends Service
{

    private final static URL ITEMSERVICE_WSDL_LOCATION;
    private final static WebServiceException ITEMSERVICE_EXCEPTION;
    private final static QName ITEMSERVICE_QNAME = new QName("model.generated.webinterface.liborrow.com", "ItemService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:80/liborrow-webservice-webapp/item?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ITEMSERVICE_WSDL_LOCATION = url;
        ITEMSERVICE_EXCEPTION = e;
    }

    public ItemService() {
        super(__getWsdlLocation(), ITEMSERVICE_QNAME);
    }

    public ItemService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ITEMSERVICE_QNAME, features);
    }

    public ItemService(URL wsdlLocation) {
        super(wsdlLocation, ITEMSERVICE_QNAME);
    }

    public ItemService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ITEMSERVICE_QNAME, features);
    }

    public ItemService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ItemService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ItemClient
     */
    @WebEndpoint(name = "ItemPort")
    public ItemClient getItemPort() {
        return super.getPort(new QName("model.generated.webinterface.liborrow.com", "ItemPort"), ItemClient.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ItemClient
     */
    @WebEndpoint(name = "ItemPort")
    public ItemClient getItemPort(WebServiceFeature... features) {
        return super.getPort(new QName("model.generated.webinterface.liborrow.com", "ItemPort"), ItemClient.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ITEMSERVICE_EXCEPTION!= null) {
            throw ITEMSERVICE_EXCEPTION;
        }
        return ITEMSERVICE_WSDL_LOCATION;
    }

}
