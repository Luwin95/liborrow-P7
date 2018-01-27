
package com.liborrow.webinterface.generated.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour borrowDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="borrowDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookDTO" type="{model.generated.webinterface.liborrow.com}bookDTO" minOccurs="0"/>
 *         &lt;element name="borrower" type="{model.generated.webinterface.liborrow.com}userLightDTO" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="extended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="getBackDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemDTO" type="{model.generated.webinterface.liborrow.com}itemDTO" minOccurs="0"/>
 *         &lt;element name="magazineDTO" type="{model.generated.webinterface.liborrow.com}magazineDTO" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "borrowDTO", propOrder = {
    "bookDTO",
    "borrower",
    "endDate",
    "extended",
    "getBackDate",
    "id",
    "itemDTO",
    "magazineDTO",
    "startDate"
})
public class BorrowDTO {

    protected BookDTO bookDTO;
    protected UserLightDTO borrower;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected Boolean extended;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar getBackDate;
    protected long id;
    protected ItemDTO itemDTO;
    protected MagazineDTO magazineDTO;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;

    /**
     * Obtient la valeur de la propriété bookDTO.
     * 
     * @return
     *     possible object is
     *     {@link BookDTO }
     *     
     */
    public BookDTO getBookDTO() {
        return bookDTO;
    }

    /**
     * Définit la valeur de la propriété bookDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link BookDTO }
     *     
     */
    public void setBookDTO(BookDTO value) {
        this.bookDTO = value;
    }

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
     * Obtient la valeur de la propriété endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Définit la valeur de la propriété endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Obtient la valeur de la propriété extended.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtended() {
        return extended;
    }

    /**
     * Définit la valeur de la propriété extended.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtended(Boolean value) {
        this.extended = value;
    }

    /**
     * Obtient la valeur de la propriété getBackDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGetBackDate() {
        return getBackDate;
    }

    /**
     * Définit la valeur de la propriété getBackDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGetBackDate(XMLGregorianCalendar value) {
        this.getBackDate = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété itemDTO.
     * 
     * @return
     *     possible object is
     *     {@link ItemDTO }
     *     
     */
    public ItemDTO getItemDTO() {
        return itemDTO;
    }

    /**
     * Définit la valeur de la propriété itemDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDTO }
     *     
     */
    public void setItemDTO(ItemDTO value) {
        this.itemDTO = value;
    }

    /**
     * Obtient la valeur de la propriété magazineDTO.
     * 
     * @return
     *     possible object is
     *     {@link MagazineDTO }
     *     
     */
    public MagazineDTO getMagazineDTO() {
        return magazineDTO;
    }

    /**
     * Définit la valeur de la propriété magazineDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link MagazineDTO }
     *     
     */
    public void setMagazineDTO(MagazineDTO value) {
        this.magazineDTO = value;
    }

    /**
     * Obtient la valeur de la propriété startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Définit la valeur de la propriété startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

}
