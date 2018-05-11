
package com.liborrow.webinterface.generated.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour waitingListDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="waitingListDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="borrower" type="{model.generated.webinterface.liborrow.com}userLightDTO" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="item" type="{model.generated.webinterface.liborrow.com}itemDTO" minOccurs="0"/>
 *         &lt;element name="notificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waitingListDTO", propOrder = {
    "borrower",
    "id",
    "item",
    "notificationDate",
    "position"
})
public class WaitingListDTO {

    protected UserLightDTO borrower;
    protected Long id;
    protected ItemDTO item;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notificationDate;
    protected int position;

    /**
     * Obtient la valeur de la propriété borrower.
     * 
     * @return
     *     possible object is
     *     {@link UserLightDTO }
     *     
     */
    public UserLightDTO getBorrower() {
        return borrower;
    }

    /**
     * Définit la valeur de la propriété borrower.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLightDTO }
     *     
     */
    public void setBorrower(UserLightDTO value) {
        this.borrower = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété item.
     * 
     * @return
     *     possible object is
     *     {@link ItemDTO }
     *     
     */
    public ItemDTO getItem() {
        return item;
    }

    /**
     * Définit la valeur de la propriété item.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDTO }
     *     
     */
    public void setItem(ItemDTO value) {
        this.item = value;
    }

    /**
     * Obtient la valeur de la propriété notificationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotificationDate() {
        return notificationDate;
    }

    /**
     * Définit la valeur de la propriété notificationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotificationDate(XMLGregorianCalendar value) {
        this.notificationDate = value;
    }

    /**
     * Obtient la valeur de la propriété position.
     * 
     */
    public int getPosition() {
        return position;
    }

    /**
     * Définit la valeur de la propriété position.
     * 
     */
    public void setPosition(int value) {
        this.position = value;
    }

}
