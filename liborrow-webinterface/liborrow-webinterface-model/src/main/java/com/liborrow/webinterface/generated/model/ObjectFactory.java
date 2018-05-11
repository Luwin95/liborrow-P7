
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

    private final static QName _DeleteUser_QNAME = new QName("model.generated.webinterface.liborrow.com", "deleteUser");
    private final static QName _FindUserByid_QNAME = new QName("model.generated.webinterface.liborrow.com", "findUserByid");
    private final static QName _UpdateUser_QNAME = new QName("model.generated.webinterface.liborrow.com", "updateUser");
    private final static QName _CreateUser_QNAME = new QName("model.generated.webinterface.liborrow.com", "createUser");
    private final static QName _UpdateUserResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "updateUserResponse");
    private final static QName _DeleteUserResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "deleteUserResponse");
    private final static QName _LoginUser_QNAME = new QName("model.generated.webinterface.liborrow.com", "loginUser");
    private final static QName _CreateUserResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "createUserResponse");
    private final static QName _LoginUserResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "loginUserResponse");
    private final static QName _SearchUser_QNAME = new QName("model.generated.webinterface.liborrow.com", "searchUser");
    private final static QName _FindUserByidResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "findUserByidResponse");
    private final static QName _SearchUserResponse_QNAME = new QName("model.generated.webinterface.liborrow.com", "searchUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.liborrow.webinterface.generated.model
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
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link LoginUserResponse }
     * 
     */
    public LoginUserResponse createLoginUserResponse() {
        return new LoginUserResponse();
    }

    /**
     * Create an instance of {@link SearchUser }
     * 
     */
    public SearchUser createSearchUser() {
        return new SearchUser();
    }

    /**
     * Create an instance of {@link FindUserByidResponse }
     * 
     */
    public FindUserByidResponse createFindUserByidResponse() {
        return new FindUserByidResponse();
    }

    /**
     * Create an instance of {@link SearchUserResponse }
     * 
     */
    public SearchUserResponse createSearchUserResponse() {
        return new SearchUserResponse();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link FindUserByid }
     * 
     */
    public FindUserByid createFindUserByid() {
        return new FindUserByid();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link AuthorDTO }
     * 
     */
    public AuthorDTO createAuthorDTO() {
        return new AuthorDTO();
    }

    /**
     * Create an instance of {@link ImageDTO }
     * 
     */
    public ImageDTO createImageDTO() {
        return new ImageDTO();
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
     * Create an instance of {@link UserLightDTO }
     * 
     */
    public UserLightDTO createUserLightDTO() {
        return new UserLightDTO();
    }

    /**
     * Create an instance of {@link ItemDTO }
     * 
     */
    public ItemDTO createItemDTO() {
        return new ItemDTO();
    }

    /**
     * Create an instance of {@link UserDTO }
     * 
     */
    public UserDTO createUserDTO() {
        return new UserDTO();
    }

    /**
     * Create an instance of {@link WaitingListDTO }
     * 
     */
    public WaitingListDTO createWaitingListDTO() {
        return new WaitingListDTO();
    }

    /**
     * Create an instance of {@link MagazineDTO }
     * 
     */
    public MagazineDTO createMagazineDTO() {
        return new MagazineDTO();
    }

    /**
     * Create an instance of {@link UserCriterias }
     * 
     */
    public UserCriterias createUserCriterias() {
        return new UserCriterias();
    }

    /**
     * Create an instance of {@link BorrowDTO }
     * 
     */
    public BorrowDTO createBorrowDTO() {
        return new BorrowDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserByid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "findUserByid")
    public JAXBElement<FindUserByid> createFindUserByid(FindUserByid value) {
        return new JAXBElement<FindUserByid>(_FindUserByid_QNAME, FindUserByid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "loginUser")
    public JAXBElement<LoginUser> createLoginUser(LoginUser value) {
        return new JAXBElement<LoginUser>(_LoginUser_QNAME, LoginUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "loginUserResponse")
    public JAXBElement<LoginUserResponse> createLoginUserResponse(LoginUserResponse value) {
        return new JAXBElement<LoginUserResponse>(_LoginUserResponse_QNAME, LoginUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "searchUser")
    public JAXBElement<SearchUser> createSearchUser(SearchUser value) {
        return new JAXBElement<SearchUser>(_SearchUser_QNAME, SearchUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserByidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "findUserByidResponse")
    public JAXBElement<FindUserByidResponse> createFindUserByidResponse(FindUserByidResponse value) {
        return new JAXBElement<FindUserByidResponse>(_FindUserByidResponse_QNAME, FindUserByidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.generated.webinterface.liborrow.com", name = "searchUserResponse")
    public JAXBElement<SearchUserResponse> createSearchUserResponse(SearchUserResponse value) {
        return new JAXBElement<SearchUserResponse>(_SearchUserResponse_QNAME, SearchUserResponse.class, null, value);
    }

}
