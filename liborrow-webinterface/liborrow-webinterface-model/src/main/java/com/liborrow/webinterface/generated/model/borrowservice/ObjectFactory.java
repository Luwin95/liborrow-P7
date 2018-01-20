
package com.liborrow.webinterface.generated.model.borrowservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.liborrow.webinterface.generated.model.borrowservice package. 
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

    private final static QName _GetAllBorrows_QNAME = new QName("borrowservice.model.generated.webinterface.liborrow.com", "getAllBorrows");
    private final static QName _GetUserBorrowsResponse_QNAME = new QName("borrowservice.model.generated.webinterface.liborrow.com", "getUserBorrowsResponse");
    private final static QName _GetAllBorrowsResponse_QNAME = new QName("borrowservice.model.generated.webinterface.liborrow.com", "getAllBorrowsResponse");
    private final static QName _GetBorrowResponse_QNAME = new QName("borrowservice.model.generated.webinterface.liborrow.com", "getBorrowResponse");
    private final static QName _GetBorrow_QNAME = new QName("borrowservice.model.generated.webinterface.liborrow.com", "getBorrow");
    private final static QName _GetUserBorrows_QNAME = new QName("borrowservice.model.generated.webinterface.liborrow.com", "getUserBorrows");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.liborrow.webinterface.generated.model.borrowservice
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
     * Create an instance of {@link GetUserBorrowsResponse }
     * 
     */
    public GetUserBorrowsResponse createGetUserBorrowsResponse() {
        return new GetUserBorrowsResponse();
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
     * Create an instance of {@link GetBorrow }
     * 
     */
    public GetBorrow createGetBorrow() {
        return new GetBorrow();
    }

    /**
     * Create an instance of {@link GetUserBorrows }
     * 
     */
    public GetUserBorrows createGetUserBorrows() {
        return new GetUserBorrows();
    }

    /**
     * Create an instance of {@link AuthorDTO }
     * 
     */
    public AuthorDTO createAuthorDTO() {
        return new AuthorDTO();
    }

    /**
     * Create an instance of {@link Citizenship }
     * 
     */
    public Citizenship createCitizenship() {
        return new Citizenship();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBorrows }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowservice.model.generated.webinterface.liborrow.com", name = "getAllBorrows")
    public JAXBElement<GetAllBorrows> createGetAllBorrows(GetAllBorrows value) {
        return new JAXBElement<GetAllBorrows>(_GetAllBorrows_QNAME, GetAllBorrows.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserBorrowsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowservice.model.generated.webinterface.liborrow.com", name = "getUserBorrowsResponse")
    public JAXBElement<GetUserBorrowsResponse> createGetUserBorrowsResponse(GetUserBorrowsResponse value) {
        return new JAXBElement<GetUserBorrowsResponse>(_GetUserBorrowsResponse_QNAME, GetUserBorrowsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBorrowsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowservice.model.generated.webinterface.liborrow.com", name = "getAllBorrowsResponse")
    public JAXBElement<GetAllBorrowsResponse> createGetAllBorrowsResponse(GetAllBorrowsResponse value) {
        return new JAXBElement<GetAllBorrowsResponse>(_GetAllBorrowsResponse_QNAME, GetAllBorrowsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBorrowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowservice.model.generated.webinterface.liborrow.com", name = "getBorrowResponse")
    public JAXBElement<GetBorrowResponse> createGetBorrowResponse(GetBorrowResponse value) {
        return new JAXBElement<GetBorrowResponse>(_GetBorrowResponse_QNAME, GetBorrowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBorrow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowservice.model.generated.webinterface.liborrow.com", name = "getBorrow")
    public JAXBElement<GetBorrow> createGetBorrow(GetBorrow value) {
        return new JAXBElement<GetBorrow>(_GetBorrow_QNAME, GetBorrow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserBorrows }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowservice.model.generated.webinterface.liborrow.com", name = "getUserBorrows")
    public JAXBElement<GetUserBorrows> createGetUserBorrows(GetUserBorrows value) {
        return new JAXBElement<GetUserBorrows>(_GetUserBorrows_QNAME, GetUserBorrows.class, null, value);
    }

}
