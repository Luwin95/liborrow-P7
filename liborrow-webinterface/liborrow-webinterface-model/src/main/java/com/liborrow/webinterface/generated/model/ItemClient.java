
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
@WebService(name = "ItemClient", targetNamespace = "model.generated.webinterface.liborrow.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ItemClient {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.liborrow.webinterface.generated.model.BookDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBook", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetBook")
    @ResponseWrapper(localName = "getBookResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetBookResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/ItemClient/getBookRequest", output = "model.generated.webinterface.liborrow.com/ItemClient/getBookResponse")
    public BookDTO getBook(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.liborrow.webinterface.generated.model.SearchResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchItem", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.SearchItem")
    @ResponseWrapper(localName = "searchItemResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.SearchItemResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/ItemClient/searchItemRequest", output = "model.generated.webinterface.liborrow.com/ItemClient/searchItemResponse")
    public SearchResponse searchItem(
        @WebParam(name = "arg0", targetNamespace = "")
        ItemCriterias arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.liborrow.webinterface.generated.model.MagazineDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMagazine", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetMagazine")
    @ResponseWrapper(localName = "getMagazineResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetMagazineResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/ItemClient/getMagazineRequest", output = "model.generated.webinterface.liborrow.com/ItemClient/getMagazineResponse")
    public MagazineDTO getMagazine(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.liborrow.webinterface.generated.model.SearchResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchBook", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.SearchBook")
    @ResponseWrapper(localName = "searchBookResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.SearchBookResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/ItemClient/searchBookRequest", output = "model.generated.webinterface.liborrow.com/ItemClient/searchBookResponse")
    public SearchResponse searchBook(
        @WebParam(name = "arg0", targetNamespace = "")
        ItemCriterias arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.liborrow.webinterface.generated.model.SearchResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchMagazine", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.SearchMagazine")
    @ResponseWrapper(localName = "searchMagazineResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.SearchMagazineResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/ItemClient/searchMagazineRequest", output = "model.generated.webinterface.liborrow.com/ItemClient/searchMagazineResponse")
    public SearchResponse searchMagazine(
        @WebParam(name = "arg0", targetNamespace = "")
        ItemCriterias arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.liborrow.webinterface.generated.model.BookDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllBooks", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetAllBooks")
    @ResponseWrapper(localName = "getAllBooksResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetAllBooksResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/ItemClient/getAllBooksRequest", output = "model.generated.webinterface.liborrow.com/ItemClient/getAllBooksResponse")
    public List<BookDTO> getAllBooks();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.liborrow.webinterface.generated.model.SearchResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchAuthor", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.SearchAuthor")
    @ResponseWrapper(localName = "searchAuthorResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.SearchAuthorResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/ItemClient/searchAuthorRequest", output = "model.generated.webinterface.liborrow.com/ItemClient/searchAuthorResponse")
    public SearchResponse searchAuthor(
        @WebParam(name = "arg0", targetNamespace = "")
        ItemCriterias arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.liborrow.webinterface.generated.model.MagazineDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllMagazines", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetAllMagazines")
    @ResponseWrapper(localName = "getAllMagazinesResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetAllMagazinesResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/ItemClient/getAllMagazinesRequest", output = "model.generated.webinterface.liborrow.com/ItemClient/getAllMagazinesResponse")
    public List<MagazineDTO> getAllMagazines();

}
