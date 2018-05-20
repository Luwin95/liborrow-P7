
package com.liborrow.webinterface.generated.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.liborrow.webinterface.generated.model package. 
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
public class ObjectFactory {

    private final static QName _MarkBorrowAsExtendedResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "markBorrowAsExtendedResponse");
    private final static QName _DeleteBorrow_QNAME = new QName("model.generated.webinterface.liborrow.com", "deleteBorrow");
    private final static QName _GetUserBorrowsResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "getUserBorrowsResponse");
    private final static QName _FindLateBorrowsResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "findLateBorrowsResponse");
    private final static QName _FindUserWaitingListResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "findUserWaitingListResponse");
    private final static QName _GetUserBorrows_QNAME = new QName("model.generated.webinterface.liborrow.com", "getUserBorrows");
    private final static QName _SaveReservations_QNAME = new QName("model.generated.webinterface.liborrow.com", "saveReservations");
    private final static QName _DeleteBorrowResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "deleteBorrowResponse");
    private final static QName _UpdateBorrow_QNAME = new QName("model.generated.webinterface.liborrow.com", "updateBorrow");
    private final static QName _GetWaitingListByNotificationDateObsoleteResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "getWaitingListByNotificationDateObsoleteResponse");
    private final static QName _GetWaitingListByItem_QNAME = new QName("model.generated.webinterface.liborrow.com", "getWaitingListByItem");
    private final static QName _GetWaitingListByItemResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "getWaitingListByItemResponse");
    private final static QName _FindLateBorrows_QNAME = new QName("model.generated.webinterface.liborrow.com", "findLateBorrows");
    private final static QName _GetAllBorrowsResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "getAllBorrowsResponse");
    private final static QName _GetBorrowResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "getBorrowResponse");
    private final static QName _GetBorrow_QNAME = new QName("model.generated.webinterface.liborrow.com", "getBorrow");
    private final static QName _GetWaitingListAvailableResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "getWaitingListAvailableResponse");
    private final static QName _RemoveReservations_QNAME = new QName("model.generated.webinterface.liborrow.com", "removeReservations");
    private final static QName _SaveNewBorrow_QNAME = new QName("model.generated.webinterface.liborrow.com", "saveNewBorrow");
    private final static QName _SaveNewBorrowResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "saveNewBorrowResponse");
    private final static QName _GetAllBorrows_QNAME = new QName("model.generated.webinterface.liborrow.com", "getAllBorrows");
    private final static QName _GetWaitingListAvailable_QNAME = new QName("model.generated.webinterface.liborrow.com", "getWaitingListAvailable");
    private final static QName _GetWaitingListByNotificationDateObsolete_QNAME = new QName("model.generated.webinterface.liborrow.com", "getWaitingListByNotificationDateObsolete");
    private final static QName _MarkBorrowAsExtended_QNAME = new QName("model.generated.webinterface.liborrow.com", "markBorrowAsExtended");
    private final static QName _SaveReservationsResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "saveReservationsResponse");
    private final static QName _UpdateBorrowResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "updateBorrowResponse");
    private final static QName _RemoveReservationsResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "removeReservationsResponse");
    private final static QName _FindUserWaitingList_QNAME = new QName("model.generated.webinterface.liborrow.com", "findUserWaitingList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.liborrow.webinterface.generated.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllBorrows }
     * 
     */
    public GetAllBorrows createGetAllBorrows() {
        return new GetAllBorrows();
    }

    /**
     * Create an instance of {@link GetWaitingListAvailable }
     * 
     */
    public GetWaitingListAvailable createGetWaitingListAvailable() {
        return new GetWaitingListAvailable();
    }

    /**
     * Create an instance of {@link GetWaitingListByNotificationDateObsolete }
     * 
     */
    public GetWaitingListByNotificationDateObsolete createGetWaitingListByNotificationDateObsolete() {
        return new GetWaitingListByNotificationDateObsolete();
    }

    /**
     * Create an instance of {@link GetBorrow }
     * 
     */
    public GetBorrow createGetBorrow() {
        return new GetBorrow();
    }

    /**
     * Create an instance of {@link GetWaitingListAvailableResponse }
     * 
     */
    public GetWaitingListAvailableResponse createGetWaitingListAvailableResponse() {
        return new GetWaitingListAvailableResponse();
    }

    /**
     * Create an instance of {@link RemoveReservations }
     * 
     */
    public RemoveReservations createRemoveReservations() {
        return new RemoveReservations();
    }

    /**
     * Create an instance of {@link SaveNewBorrow }
     * 
     */
    public SaveNewBorrow createSaveNewBorrow() {
        return new SaveNewBorrow();
    }

    /**
     * Create an instance of {@link SaveNewBorrowResponse }
     * 
     */
    public SaveNewBorrowResponse createSaveNewBorrowResponse() {
        return new SaveNewBorrowResponse();
    }

    /**
     * Create an instance of {@link UpdateBorrowResponse }
     * 
     */
    public UpdateBorrowResponse createUpdateBorrowResponse() {
        return new UpdateBorrowResponse();
    }

    /**
     * Create an instance of {@link RemoveReservationsResponse }
     * 
     */
    public RemoveReservationsResponse createRemoveReservationsResponse() {
        return new RemoveReservationsResponse();
    }

    /**
     * Create an instance of {@link FindUserWaitingList }
     * 
     */
    public FindUserWaitingList createFindUserWaitingList() {
        return new FindUserWaitingList();
    }

    /**
     * Create an instance of {@link MarkBorrowAsExtended }
     * 
     */
    public MarkBorrowAsExtended createMarkBorrowAsExtended() {
        return new MarkBorrowAsExtended();
    }

    /**
     * Create an instance of {@link SaveReservationsResponse }
     * 
     */
    public SaveReservationsResponse createSaveReservationsResponse() {
        return new SaveReservationsResponse();
    }

    /**
     * Create an instance of {@link GetUserBorrowsResponse }
     * 
     */
    public GetUserBorrowsResponse createGetUserBorrowsResponse() {
        return new GetUserBorrowsResponse();
    }

    /**
     * Create an instance of {@link MarkBorrowAsExtendedResponse }
     * 
     */
    public MarkBorrowAsExtendedResponse createMarkBorrowAsExtendedResponse() {
        return new MarkBorrowAsExtendedResponse();
    }

    /**
     * Create an instance of {@link DeleteBorrow }
     * 
     */
    public DeleteBorrow createDeleteBorrow() {
        return new DeleteBorrow();
    }

    /**
     * Create an instance of {@link SaveReservations }
     * 
     */
    public SaveReservations createSaveReservations() {
        return new SaveReservations();
    }

    /**
     * Create an instance of {@link DeleteBorrowResponse }
     * 
     */
    public DeleteBorrowResponse createDeleteBorrowResponse() {
        return new DeleteBorrowResponse();
    }

    /**
     * Create an instance of {@link UpdateBorrow }
     * 
     */
    public UpdateBorrow createUpdateBorrow() {
        return new UpdateBorrow();
    }

    /**
     * Create an instance of {@link GetWaitingListByNotificationDateObsoleteResponse }
     * 
     */
    public GetWaitingListByNotificationDateObsoleteResponse createGetWaitingListByNotificationDateObsoleteResponse() {
        return new GetWaitingListByNotificationDateObsoleteResponse();
    }

    /**
     * Create an instance of {@link GetWaitingListByItem }
     * 
     */
    public GetWaitingListByItem createGetWaitingListByItem() {
        return new GetWaitingListByItem();
    }

    /**
     * Create an instance of {@link GetWaitingListByItemResponse }
     * 
     */
    public GetWaitingListByItemResponse createGetWaitingListByItemResponse() {
        return new GetWaitingListByItemResponse();
    }

    /**
     * Create an instance of {@link FindLateBorrows }
     * 
     */
    public FindLateBorrows createFindLateBorrows() {
        return new FindLateBorrows();
    }

    /**
     * Create an instance of {@link GetAllBorrowsResponse }
     * 
     */
    public GetAllBorrowsResponse createGetAllBorrowsResponse() {
        return new GetAllBorrowsResponse();
    }

    /**
     * Create an instance of {@link GetBorrowResponse }
     * 
     */
    public GetBorrowResponse createGetBorrowResponse() {
        return new GetBorrowResponse();
    }

    /**
     * Create an instance of {@link FindLateBorrowsResponse }
     * 
     */
    public FindLateBorrowsResponse createFindLateBorrowsResponse() {
        return new FindLateBorrowsResponse();
    }

    /**
     * Create an instance of {@link FindUserWaitingListResponse }
     * 
     */
    public FindUserWaitingListResponse createFindUserWaitingListResponse() {
        return new FindUserWaitingListResponse();
    }

    /**
     * Create an instance of {@link GetUserBorrows }
     * 
     */
    public GetUserBorrows createGetUserBorrows() {
        return new GetUserBorrows();
    }

    /**
     * Create an instance of {@link ImageDTO }
     * 
     */
    public ImageDTO createImageDTO() {
        return new ImageDTO();
    }

    /**
     * Create an instance of {@link UserLightDTO }
     * 
     */
    public UserLightDTO createUserLightDTO() {
        return new UserLightDTO();
    }

    /**
     * Create an instance of {@link MagazineDTO }
     * 
     */
    public MagazineDTO createMagazineDTO() {
        return new MagazineDTO();
    }

    /**
     * Create an instance of {@link BorrowDTO }
     * 
     */
    public BorrowDTO createBorrowDTO() {
        return new BorrowDTO();
    }

    /**
     * Create an instance of {@link AuthorDTO }
     * 
     */
    public AuthorDTO createAuthorDTO() {
        return new AuthorDTO();
    }

    /**
     * Create an instance of {@link CitizenshipDTO }
     * 
     */
    public CitizenshipDTO createCitizenshipDTO() {
        return new CitizenshipDTO();
    }

    /**
     * Create an instance of {@link BookDTO }
     * 
     */
    public BookDTO createBookDTO() {
        return new BookDTO();
    }

    /**
     * Create an instance of {@link ItemDTO }
     * 
     */
    public ItemDTO createItemDTO() {
        return new ItemDTO();
    }

    /**
     * Create an instance of {@link WaitingListDTO }
     * 
     */
    public WaitingListDTO createWaitingListDTO() {
        return new WaitingListDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkBorrowAsExtendedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "markBorrowAsExtendedResponse")
    public JAXBElement<MarkBorrowAsExtendedResponse> createMarkBorrowAsExtendedResponse(MarkBorrowAsExtendedResponse value) {
        return new JAXBElement<MarkBorrowAsExtendedResponse>(_MarkBorrowAsExtendedResponse_QNAME, MarkBorrowAsExtendedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBorrow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "deleteBorrow")
    public JAXBElement<DeleteBorrow> createDeleteBorrow(DeleteBorrow value) {
        return new JAXBElement<DeleteBorrow>(_DeleteBorrow_QNAME, DeleteBorrow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserBorrowsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "getUserBorrowsResponse")
    public JAXBElement<GetUserBorrowsResponse> createGetUserBorrowsResponse(GetUserBorrowsResponse value) {
        return new JAXBElement<GetUserBorrowsResponse>(_GetUserBorrowsResponse_QNAME, GetUserBorrowsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLateBorrowsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "findLateBorrowsResponse")
    public JAXBElement<FindLateBorrowsResponse> createFindLateBorrowsResponse(FindLateBorrowsResponse value) {
        return new JAXBElement<FindLateBorrowsResponse>(_FindLateBorrowsResponse_QNAME, FindLateBorrowsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserWaitingListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "findUserWaitingListResponse")
    public JAXBElement<FindUserWaitingListResponse> createFindUserWaitingListResponse(FindUserWaitingListResponse value) {
        return new JAXBElement<FindUserWaitingListResponse>(_FindUserWaitingListResponse_QNAME, FindUserWaitingListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserBorrows }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "getUserBorrows")
    public JAXBElement<GetUserBorrows> createGetUserBorrows(GetUserBorrows value) {
        return new JAXBElement<GetUserBorrows>(_GetUserBorrows_QNAME, GetUserBorrows.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveReservations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "saveReservations")
    public JAXBElement<SaveReservations> createSaveReservations(SaveReservations value) {
        return new JAXBElement<SaveReservations>(_SaveReservations_QNAME, SaveReservations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBorrowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "deleteBorrowResponse")
    public JAXBElement<DeleteBorrowResponse> createDeleteBorrowResponse(DeleteBorrowResponse value) {
        return new JAXBElement<DeleteBorrowResponse>(_DeleteBorrowResponse_QNAME, DeleteBorrowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBorrow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "updateBorrow")
    public JAXBElement<UpdateBorrow> createUpdateBorrow(UpdateBorrow value) {
        return new JAXBElement<UpdateBorrow>(_UpdateBorrow_QNAME, UpdateBorrow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWaitingListByNotificationDateObsoleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "getWaitingListByNotificationDateObsoleteResponse")
    public JAXBElement<GetWaitingListByNotificationDateObsoleteResponse> createGetWaitingListByNotificationDateObsoleteResponse(GetWaitingListByNotificationDateObsoleteResponse value) {
        return new JAXBElement<GetWaitingListByNotificationDateObsoleteResponse>(_GetWaitingListByNotificationDateObsoleteResponse_QNAME, GetWaitingListByNotificationDateObsoleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWaitingListByItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "getWaitingListByItem")
    public JAXBElement<GetWaitingListByItem> createGetWaitingListByItem(GetWaitingListByItem value) {
        return new JAXBElement<GetWaitingListByItem>(_GetWaitingListByItem_QNAME, GetWaitingListByItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWaitingListByItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "getWaitingListByItemResponse")
    public JAXBElement<GetWaitingListByItemResponse> createGetWaitingListByItemResponse(GetWaitingListByItemResponse value) {
        return new JAXBElement<GetWaitingListByItemResponse>(_GetWaitingListByItemResponse_QNAME, GetWaitingListByItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLateBorrows }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "findLateBorrows")
    public JAXBElement<FindLateBorrows> createFindLateBorrows(FindLateBorrows value) {
        return new JAXBElement<FindLateBorrows>(_FindLateBorrows_QNAME, FindLateBorrows.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBorrowsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "getAllBorrowsResponse")
    public JAXBElement<GetAllBorrowsResponse> createGetAllBorrowsResponse(GetAllBorrowsResponse value) {
        return new JAXBElement<GetAllBorrowsResponse>(_GetAllBorrowsResponse_QNAME, GetAllBorrowsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBorrowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "getBorrowResponse")
    public JAXBElement<GetBorrowResponse> createGetBorrowResponse(GetBorrowResponse value) {
        return new JAXBElement<GetBorrowResponse>(_GetBorrowResponse_QNAME, GetBorrowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBorrow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "getBorrow")
    public JAXBElement<GetBorrow> createGetBorrow(GetBorrow value) {
        return new JAXBElement<GetBorrow>(_GetBorrow_QNAME, GetBorrow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWaitingListAvailableResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "getWaitingListAvailableResponse")
    public JAXBElement<GetWaitingListAvailableResponse> createGetWaitingListAvailableResponse(GetWaitingListAvailableResponse value) {
        return new JAXBElement<GetWaitingListAvailableResponse>(_GetWaitingListAvailableResponse_QNAME, GetWaitingListAvailableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveReservations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "removeReservations")
    public JAXBElement<RemoveReservations> createRemoveReservations(RemoveReservations value) {
        return new JAXBElement<RemoveReservations>(_RemoveReservations_QNAME, RemoveReservations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveNewBorrow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "saveNewBorrow")
    public JAXBElement<SaveNewBorrow> createSaveNewBorrow(SaveNewBorrow value) {
        return new JAXBElement<SaveNewBorrow>(_SaveNewBorrow_QNAME, SaveNewBorrow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveNewBorrowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "saveNewBorrowResponse")
    public JAXBElement<SaveNewBorrowResponse> createSaveNewBorrowResponse(SaveNewBorrowResponse value) {
        return new JAXBElement<SaveNewBorrowResponse>(_SaveNewBorrowResponse_QNAME, SaveNewBorrowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBorrows }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "getAllBorrows")
    public JAXBElement<GetAllBorrows> createGetAllBorrows(GetAllBorrows value) {
        return new JAXBElement<GetAllBorrows>(_GetAllBorrows_QNAME, GetAllBorrows.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWaitingListAvailable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "getWaitingListAvailable")
    public JAXBElement<GetWaitingListAvailable> createGetWaitingListAvailable(GetWaitingListAvailable value) {
        return new JAXBElement<GetWaitingListAvailable>(_GetWaitingListAvailable_QNAME, GetWaitingListAvailable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWaitingListByNotificationDateObsolete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "getWaitingListByNotificationDateObsolete")
    public JAXBElement<GetWaitingListByNotificationDateObsolete> createGetWaitingListByNotificationDateObsolete(GetWaitingListByNotificationDateObsolete value) {
        return new JAXBElement<GetWaitingListByNotificationDateObsolete>(_GetWaitingListByNotificationDateObsolete_QNAME, GetWaitingListByNotificationDateObsolete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkBorrowAsExtended }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "markBorrowAsExtended")
    public JAXBElement<MarkBorrowAsExtended> createMarkBorrowAsExtended(MarkBorrowAsExtended value) {
        return new JAXBElement<MarkBorrowAsExtended>(_MarkBorrowAsExtended_QNAME, MarkBorrowAsExtended.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveReservationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "saveReservationsResponse")
    public JAXBElement<SaveReservationsResponse> createSaveReservationsResponse(SaveReservationsResponse value) {
        return new JAXBElement<SaveReservationsResponse>(_SaveReservationsResponse_QNAME, SaveReservationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBorrowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "updateBorrowResponse")
    public JAXBElement<UpdateBorrowResponse> createUpdateBorrowResponse(UpdateBorrowResponse value) {
        return new JAXBElement<UpdateBorrowResponse>(_UpdateBorrowResponse_QNAME, UpdateBorrowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveReservationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "removeReservationsResponse")
    public JAXBElement<RemoveReservationsResponse> createRemoveReservationsResponse(RemoveReservationsResponse value) {
        return new JAXBElement<RemoveReservationsResponse>(_RemoveReservationsResponse_QNAME, RemoveReservationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserWaitingList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "findUserWaitingList")
    public JAXBElement<FindUserWaitingList> createFindUserWaitingList(FindUserWaitingList value) {
        return new JAXBElement<FindUserWaitingList>(_FindUserWaitingList_QNAME, FindUserWaitingList.class, null, value);
    }

}
