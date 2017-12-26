
package com.liborrow.webservice.generated.itemservice;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Item", targetNamespace = "http://itemService/", wsdlLocation = "file:/E:/env/workspace/Liborrow/liborrow-webservice/liborrow-webservice-webapp/src/main/resources/item.wsdl")
public class Item_Service
    extends Service
{

    private final static URL ITEM_WSDL_LOCATION;
    private final static WebServiceException ITEM_EXCEPTION;
    private final static QName ITEM_QNAME = new QName("http://itemService/", "Item");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/E:/env/workspace/Liborrow/liborrow-webservice/liborrow-webservice-webapp/src/main/resources/item.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ITEM_WSDL_LOCATION = url;
        ITEM_EXCEPTION = e;
    }

    public Item_Service() {
        super(__getWsdlLocation(), ITEM_QNAME);
    }

    public Item_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ITEM_QNAME, features);
    }

    public Item_Service(URL wsdlLocation) {
        super(wsdlLocation, ITEM_QNAME);
    }

    public Item_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ITEM_QNAME, features);
    }

    public Item_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Item_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ItemServiceGetBook
     */
    @WebEndpoint(name = "ItemServicePortGetBook")
    public ItemServiceGetBook getItemServicePortGetBook() {
        return super.getPort(new QName("http://itemService/", "ItemServicePortGetBook"), ItemServiceGetBook.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ItemServiceGetBook
     */
    @WebEndpoint(name = "ItemServicePortGetBook")
    public ItemServiceGetBook getItemServicePortGetBook(WebServiceFeature... features) {
        return super.getPort(new QName("http://itemService/", "ItemServicePortGetBook"), ItemServiceGetBook.class, features);
    }

    /**
     * 
     * @return
     *     returns ItemServiceGetAllBooks
     */
    @WebEndpoint(name = "ItemServicePortGetAllBooks")
    public ItemServiceGetAllBooks getItemServicePortGetAllBooks() {
        return super.getPort(new QName("http://itemService/", "ItemServicePortGetAllBooks"), ItemServiceGetAllBooks.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ItemServiceGetAllBooks
     */
    @WebEndpoint(name = "ItemServicePortGetAllBooks")
    public ItemServiceGetAllBooks getItemServicePortGetAllBooks(WebServiceFeature... features) {
        return super.getPort(new QName("http://itemService/", "ItemServicePortGetAllBooks"), ItemServiceGetAllBooks.class, features);
    }

    /**
     * 
     * @return
     *     returns ItemServiceGetMagazine
     */
    @WebEndpoint(name = "ItemServicePortGetMagazine")
    public ItemServiceGetMagazine getItemServicePortGetMagazine() {
        return super.getPort(new QName("http://itemService/", "ItemServicePortGetMagazine"), ItemServiceGetMagazine.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ItemServiceGetMagazine
     */
    @WebEndpoint(name = "ItemServicePortGetMagazine")
    public ItemServiceGetMagazine getItemServicePortGetMagazine(WebServiceFeature... features) {
        return super.getPort(new QName("http://itemService/", "ItemServicePortGetMagazine"), ItemServiceGetMagazine.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ITEM_EXCEPTION!= null) {
            throw ITEM_EXCEPTION;
        }
        return ITEM_WSDL_LOCATION;
    }

}
