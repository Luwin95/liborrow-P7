
package com.liborrow.webinterface.generated.model;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
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

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "saveNewBorrow", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.SaveNewBorrow")
    @ResponseWrapper(localName = "saveNewBorrowResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.SaveNewBorrowResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/BorrowClient/saveNewBorrowRequest", output = "model.generated.webinterface.liborrow.com/BorrowClient/saveNewBorrowResponse")
    public void saveNewBorrow(
        @WebParam(name = "arg0", targetNamespace = "")
        BorrowDTO arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateBorrow", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.UpdateBorrow")
    @ResponseWrapper(localName = "updateBorrowResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.UpdateBorrowResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/BorrowClient/updateBorrowRequest", output = "model.generated.webinterface.liborrow.com/BorrowClient/updateBorrowResponse")
    public void updateBorrow(
        @WebParam(name = "arg0", targetNamespace = "")
        BorrowDTO arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteBorrow", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.DeleteBorrow")
    @ResponseWrapper(localName = "deleteBorrowResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.DeleteBorrowResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/BorrowClient/deleteBorrowRequest", output = "model.generated.webinterface.liborrow.com/BorrowClient/deleteBorrowResponse")
    public void deleteBorrow(
        @WebParam(name = "arg0", targetNamespace = "")
        BorrowDTO arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.liborrow.webinterface.generated.model.BorrowDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findLateBorrows", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.FindLateBorrows")
    @ResponseWrapper(localName = "findLateBorrowsResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.FindLateBorrowsResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/BorrowClient/findLateBorrowsRequest", output = "model.generated.webinterface.liborrow.com/BorrowClient/findLateBorrowsResponse")
    public List<BorrowDTO> findLateBorrows();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.liborrow.webinterface.generated.model.WaitingListDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findUserWaitingList", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.FindUserWaitingList")
    @ResponseWrapper(localName = "findUserWaitingListResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.FindUserWaitingListResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/BorrowClient/findUserWaitingListRequest", output = "model.generated.webinterface.liborrow.com/BorrowClient/findUserWaitingListResponse")
    public List<WaitingListDTO> findUserWaitingList(
        @WebParam(name = "arg0", targetNamespace = "")
        UserLightDTO arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.liborrow.webinterface.generated.model.WaitingListDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWaitingListAvailable", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetWaitingListAvailable")
    @ResponseWrapper(localName = "getWaitingListAvailableResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetWaitingListAvailableResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/BorrowClient/getWaitingListAvailableRequest", output = "model.generated.webinterface.liborrow.com/BorrowClient/getWaitingListAvailableResponse")
    public List<WaitingListDTO> getWaitingListAvailable();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.liborrow.webinterface.generated.model.WaitingListDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWaitingListByItem", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetWaitingListByItem")
    @ResponseWrapper(localName = "getWaitingListByItemResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetWaitingListByItemResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/BorrowClient/getWaitingListByItemRequest", output = "model.generated.webinterface.liborrow.com/BorrowClient/getWaitingListByItemResponse")
    public List<WaitingListDTO> getWaitingListByItem(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.liborrow.webinterface.generated.model.WaitingListDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWaitingListByNotificationDateObsolete", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetWaitingListByNotificationDateObsolete")
    @ResponseWrapper(localName = "getWaitingListByNotificationDateObsoleteResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetWaitingListByNotificationDateObsoleteResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/BorrowClient/getWaitingListByNotificationDateObsoleteRequest", output = "model.generated.webinterface.liborrow.com/BorrowClient/getWaitingListByNotificationDateObsoleteResponse")
    public List<WaitingListDTO> getWaitingListByNotificationDateObsolete();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removeReservations", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.RemoveReservations")
    @ResponseWrapper(localName = "removeReservationsResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.RemoveReservationsResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/BorrowClient/removeReservationsRequest", output = "model.generated.webinterface.liborrow.com/BorrowClient/removeReservationsResponse")
    public void removeReservations(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Long> arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "saveReservations", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.SaveReservations")
    @ResponseWrapper(localName = "saveReservationsResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.SaveReservationsResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/BorrowClient/saveReservationsRequest", output = "model.generated.webinterface.liborrow.com/BorrowClient/saveReservationsResponse")
    public void saveReservations(
        @WebParam(name = "arg0", targetNamespace = "")
        List<WaitingListDTO> arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNextGetBackDate", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetNextGetBackDate")
    @ResponseWrapper(localName = "getNextGetBackDateResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetNextGetBackDateResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/BorrowClient/getNextGetBackDateRequest", output = "model.generated.webinterface.liborrow.com/BorrowClient/getNextGetBackDateResponse")
    public XMLGregorianCalendar getNextGetBackDate(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.liborrow.webinterface.generated.model.BorrowDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "remindBorrows", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.RemindBorrows")
    @ResponseWrapper(localName = "remindBorrowsResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.RemindBorrowsResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/BorrowClient/remindBorrowsRequest", output = "model.generated.webinterface.liborrow.com/BorrowClient/remindBorrowsResponse")
    public List<BorrowDTO> remindBorrows();

}
