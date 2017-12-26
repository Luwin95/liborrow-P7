
package com.liborrow.webservice.generated.itemservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ItemServiceGetMagazine", targetNamespace = "http://itemService/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ItemServiceGetMagazine {


    /**
     * 
     * @param parameters
     * @return
     *     returns com.liborrow.webservice.generated.itemservice.GetMagazineResponse
     */
    @WebMethod
    @WebResult(name = "getMagazineResponse", targetNamespace = "http://itemService/", partName = "parameters")
    public GetMagazineResponse getMagazine(
        @WebParam(name = "getItem", targetNamespace = "http://itemService/", partName = "parameters")
        GetItem parameters);

}
