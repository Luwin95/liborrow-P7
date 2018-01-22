
package com.liborrow.webinterface.generated.model.itemservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.liborrow.webinterface.generated.model.itemservice package. 
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

    private final static QName _GetAllMagazines_QNAME = new QName("itemservice.model.generated.webinterface.liborrow.com", "getAllMagazines");
    private final static QName _GetMagazineResponse_QNAME = new QName("itemservice.model.generated.webinterface.liborrow.com", "getMagazineResponse");
    private final static QName _GetMagazine_QNAME = new QName("itemservice.model.generated.webinterface.liborrow.com", "getMagazine");
    private final static QName _GetBook_QNAME = new QName("itemservice.model.generated.webinterface.liborrow.com", "getBook");
    private final static QName _SearchItemResponse_QNAME = new QName("itemservice.model.generated.webinterface.liborrow.com", "searchItemResponse");
    private final static QName _GetAllBooks_QNAME = new QName("itemservice.model.generated.webinterface.liborrow.com", "getAllBooks");
    private final static QName _GetAllMagazinesResponse_QNAME = new QName("itemservice.model.generated.webinterface.liborrow.com", "getAllMagazinesResponse");
    private final static QName _GetBookResponse_QNAME = new QName("itemservice.model.generated.webinterface.liborrow.com", "getBookResponse");
    private final static QName _SearchItem_QNAME = new QName("itemservice.model.generated.webinterface.liborrow.com", "searchItem");
    private final static QName _GetAllBooksResponse_QNAME = new QName("itemservice.model.generated.webinterface.liborrow.com", "getAllBooksResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.liborrow.webinterface.generated.model.itemservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllBooks }
     * 
     */
    public GetAllBooks createGetAllBooks() {
        return new GetAllBooks();
    }

    /**
     * Create an instance of {@link GetAllMagazinesResponse }
     * 
     */
    public GetAllMagazinesResponse createGetAllMagazinesResponse() {
        return new GetAllMagazinesResponse();
    }

    /**
     * Create an instance of {@link GetBookResponse }
     * 
     */
    public GetBookResponse createGetBookResponse() {
        return new GetBookResponse();
    }

    /**
     * Create an instance of {@link GetBook }
     * 
     */
    public GetBook createGetBook() {
        return new GetBook();
    }

    /**
     * Create an instance of {@link SearchItemResponse }
     * 
     */
    public SearchItemResponse createSearchItemResponse() {
        return new SearchItemResponse();
    }

    /**
     * Create an instance of {@link GetMagazine }
     * 
     */
    public GetMagazine createGetMagazine() {
        return new GetMagazine();
    }

    /**
     * Create an instance of {@link GetAllMagazines }
     * 
     */
    public GetAllMagazines createGetAllMagazines() {
        return new GetAllMagazines();
    }

    /**
     * Create an instance of {@link GetMagazineResponse }
     * 
     */
    public GetMagazineResponse createGetMagazineResponse() {
        return new GetMagazineResponse();
    }

    /**
     * Create an instance of {@link GetAllBooksResponse }
     * 
     */
    public GetAllBooksResponse createGetAllBooksResponse() {
        return new GetAllBooksResponse();
    }

    /**
     * Create an instance of {@link SearchItem }
     * 
     */
    public SearchItem createSearchItem() {
        return new SearchItem();
    }

    /**
     * Create an instance of {@link ImageDTO }
     * 
     */
    public ImageDTO createImageDTO() {
        return new ImageDTO();
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
     * Create an instance of {@link MagazineCriterias }
     * 
     */
    public MagazineCriterias createMagazineCriterias() {
        return new MagazineCriterias();
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
     * Create an instance of {@link ItemCriterias }
     * 
     */
    public ItemCriterias createItemCriterias() {
        return new ItemCriterias();
    }

    /**
     * Create an instance of {@link BookCriterias }
     * 
     */
    public BookCriterias createBookCriterias() {
        return new BookCriterias();
    }

    /**
     * Create an instance of {@link AuthorCriterias }
     * 
     */
    public AuthorCriterias createAuthorCriterias() {
        return new AuthorCriterias();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMagazines }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "itemservice.model.generated.webinterface.liborrow.com", name = "getAllMagazines")
    public JAXBElement<GetAllMagazines> createGetAllMagazines(GetAllMagazines value) {
        return new JAXBElement<GetAllMagazines>(_GetAllMagazines_QNAME, GetAllMagazines.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMagazineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "itemservice.model.generated.webinterface.liborrow.com", name = "getMagazineResponse")
    public JAXBElement<GetMagazineResponse> createGetMagazineResponse(GetMagazineResponse value) {
        return new JAXBElement<GetMagazineResponse>(_GetMagazineResponse_QNAME, GetMagazineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMagazine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "itemservice.model.generated.webinterface.liborrow.com", name = "getMagazine")
    public JAXBElement<GetMagazine> createGetMagazine(GetMagazine value) {
        return new JAXBElement<GetMagazine>(_GetMagazine_QNAME, GetMagazine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "itemservice.model.generated.webinterface.liborrow.com", name = "getBook")
    public JAXBElement<GetBook> createGetBook(GetBook value) {
        return new JAXBElement<GetBook>(_GetBook_QNAME, GetBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "itemservice.model.generated.webinterface.liborrow.com", name = "searchItemResponse")
    public JAXBElement<SearchItemResponse> createSearchItemResponse(SearchItemResponse value) {
        return new JAXBElement<SearchItemResponse>(_SearchItemResponse_QNAME, SearchItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "itemservice.model.generated.webinterface.liborrow.com", name = "getAllBooks")
    public JAXBElement<GetAllBooks> createGetAllBooks(GetAllBooks value) {
        return new JAXBElement<GetAllBooks>(_GetAllBooks_QNAME, GetAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMagazinesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "itemservice.model.generated.webinterface.liborrow.com", name = "getAllMagazinesResponse")
    public JAXBElement<GetAllMagazinesResponse> createGetAllMagazinesResponse(GetAllMagazinesResponse value) {
        return new JAXBElement<GetAllMagazinesResponse>(_GetAllMagazinesResponse_QNAME, GetAllMagazinesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "itemservice.model.generated.webinterface.liborrow.com", name = "getBookResponse")
    public JAXBElement<GetBookResponse> createGetBookResponse(GetBookResponse value) {
        return new JAXBElement<GetBookResponse>(_GetBookResponse_QNAME, GetBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "itemservice.model.generated.webinterface.liborrow.com", name = "searchItem")
    public JAXBElement<SearchItem> createSearchItem(SearchItem value) {
        return new JAXBElement<SearchItem>(_SearchItem_QNAME, SearchItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "itemservice.model.generated.webinterface.liborrow.com", name = "getAllBooksResponse")
    public JAXBElement<GetAllBooksResponse> createGetAllBooksResponse(GetAllBooksResponse value) {
        return new JAXBElement<GetAllBooksResponse>(_GetAllBooksResponse_QNAME, GetAllBooksResponse.class, null, value);
    }

}
