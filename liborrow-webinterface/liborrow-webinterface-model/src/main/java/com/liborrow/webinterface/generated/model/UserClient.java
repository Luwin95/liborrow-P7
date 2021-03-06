
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
@WebService(name = "UserClient", targetNamespace = "model.generated.webinterface.liborrow.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserClient {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "createUser", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.CreateUser")
    @ResponseWrapper(localName = "createUserResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.CreateUserResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/UserClient/createUserRequest", output = "model.generated.webinterface.liborrow.com/UserClient/createUserResponse")
    public void createUser(
        @WebParam(name = "arg0", targetNamespace = "")
        UserDTO arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.liborrow.webinterface.generated.model.UserLightDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginUser", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.LoginUser")
    @ResponseWrapper(localName = "loginUserResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.LoginUserResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/UserClient/loginUserRequest", output = "model.generated.webinterface.liborrow.com/UserClient/loginUserResponse")
    public UserLightDTO loginUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.liborrow.webinterface.generated.model.UserLightDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchUser", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.SearchUser")
    @ResponseWrapper(localName = "searchUserResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.SearchUserResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/UserClient/searchUserRequest", output = "model.generated.webinterface.liborrow.com/UserClient/searchUserResponse")
    public List<UserLightDTO> searchUser(
        @WebParam(name = "arg0", targetNamespace = "")
        UserCriterias arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.liborrow.webinterface.generated.model.UserLightDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findUserByid", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.FindUserByid")
    @ResponseWrapper(localName = "findUserByidResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.FindUserByidResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/UserClient/findUserByidRequest", output = "model.generated.webinterface.liborrow.com/UserClient/findUserByidResponse")
    public UserLightDTO findUserByid(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateUser", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.UpdateUserResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/UserClient/updateUserRequest", output = "model.generated.webinterface.liborrow.com/UserClient/updateUserResponse")
    public void updateUser(
        @WebParam(name = "arg0", targetNamespace = "")
        UserLightDTO arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteUser", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.DeleteUser")
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.DeleteUserResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/UserClient/deleteUserRequest", output = "model.generated.webinterface.liborrow.com/UserClient/deleteUserResponse")
    public void deleteUser(
        @WebParam(name = "arg0", targetNamespace = "")
        UserDTO arg0);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCitizenshipsNames", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetAllCitizenshipsNames")
    @ResponseWrapper(localName = "getAllCitizenshipsNamesResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetAllCitizenshipsNamesResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/UserClient/getAllCitizenshipsNamesRequest", output = "model.generated.webinterface.liborrow.com/UserClient/getAllCitizenshipsNamesResponse")
    public List<String> getAllCitizenshipsNames();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "saveNewUser", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.SaveNewUser")
    @ResponseWrapper(localName = "saveNewUserResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.SaveNewUserResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/UserClient/saveNewUserRequest", output = "model.generated.webinterface.liborrow.com/UserClient/saveNewUserResponse")
    public void saveNewUser(
        @WebParam(name = "arg0", targetNamespace = "")
        UserDTO arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.liborrow.webinterface.generated.model.CitizenshipDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCitizenshipByCountry", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetCitizenshipByCountry")
    @ResponseWrapper(localName = "getCitizenshipByCountryResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.GetCitizenshipByCountryResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/UserClient/getCitizenshipByCountryRequest", output = "model.generated.webinterface.liborrow.com/UserClient/getCitizenshipByCountryResponse")
    public CitizenshipDTO getCitizenshipByCountry(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isInDatabase", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.IsInDatabase")
    @ResponseWrapper(localName = "isInDatabaseResponse", targetNamespace = "model.generated.webinterface.liborrow.com", className = "com.liborrow.webinterface.generated.model.IsInDatabaseResponse")
    @Action(input = "model.generated.webinterface.liborrow.com/UserClient/isInDatabaseRequest", output = "model.generated.webinterface.liborrow.com/UserClient/isInDatabaseResponse")
    public boolean isInDatabase(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
