
package com.liborrow.webinterface.generated.model;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BorrowClient", targetNamespace = "model.generated.webinterface.liborrow.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BorrowClient {


    /**
     * 
     * @return
     *     returns java.util.List<com.liborrow.webinterface.generated.model.BorrowDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllBorrows", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetAllBorrows")
    @ResponseWrapper(localName = "getAllBorrowsResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetAllBorrowsResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/BorrowClient/getAllBorrowsRequest", output = "model.generated.webinterface.liborrow.com/BorrowClient/getAllBorrowsResponse")
    public List<BorrowDTO> getAllBorrows();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.liborrow.webinterface.generated.model.BorrowDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserBorrows", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetUserBorrows")
    @ResponseWrapper(localName = "getUserBorrowsResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetUserBorrowsResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/BorrowClient/getUserBorrowsRequest", output = "model.generated.webinterface.liborrow.com/BorrowClient/getUserBorrowsResponse")
    public List<BorrowDTO> getUserBorrows(
        @WebParam(name = "arg0", targetNamespace = "")
        UserLightDTO arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.liborrow.webinterface.generated.model.BorrowDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBorrow", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetBorrow")
    @ResponseWrapper(localName = "getBorrowResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetBorrowResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/BorrowClient/getBorrowRequest", output = "model.generated.webinterface.liborrow.com/BorrowClient/getBorrowResponse")
    public BorrowDTO getBorrow(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "markBorrowAsExtended", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.MarkBorrowAsExtended")
    @ResponseWrapper(localName = "markBorrowAsExtendedResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.MarkBorrowAsExtendedResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/BorrowClient/markBorrowAsExtendedRequest", output = "model.generated.webinterface.liborrow.com/BorrowClient/markBorrowAsExtendedResponse")
    public boolean markBorrowAsExtended(
        @WebParam(name = "arg0", targetNamespace = "")
        BorrowDTO arg0);

}
