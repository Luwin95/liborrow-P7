
package com.liborrow.webinterface.generated.model.userservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.liborrow.webinterface.generated.model.userservice package. 
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

    private final static QName _LoginUserResponse_QNAME = new QName("userservice.model.generated.webinterface.liborrow.com", "loginUserResponse");
    private final static QName _LoginUser_QNAME = new QName("userservice.model.generated.webinterface.liborrow.com", "loginUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.liborrow.webinterface.generated.model.userservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginUser }
     * 
     */
    public LoginUser createLoginUser() {
        return new LoginUser();
    }

    /**
     * Create an instance of {@link LoginUserResponse }
     * 
     */
    public LoginUserResponse createLoginUserResponse() {
        return new LoginUserResponse();
    }

    /**
     * Create an instance of {@link UserLight }
     * 
     */
    public UserLight createUserLight() {
        return new UserLight();
    }

    /**
     * Create an instance of {@link UserAccount }
     * 
     */
    public UserAccount createUserAccount() {
        return new UserAccount();
    }

    /**
     * Create an instance of {@link Citizenship }
     * 
     */
    public Citizenship createCitizenship() {
        return new Citizenship();
    }

    /**
     * Create an instance of {@link Borrow }
     * 
     */
    public Borrow createBorrow() {
        return new Borrow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "userservice.model.generated.webinterface.liborrow.com", name = "loginUserResponse")
    public JAXBElement<LoginUserResponse> createLoginUserResponse(LoginUserResponse value) {
        return new JAXBElement<LoginUserResponse>(_LoginUserResponse_QNAME, LoginUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "userservice.model.generated.webinterface.liborrow.com", name = "loginUser")
    public JAXBElement<LoginUser> createLoginUser(LoginUser value) {
        return new JAXBElement<LoginUser>(_LoginUser_QNAME, LoginUser.class, null, value);
    }

}
