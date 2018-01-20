
package com.liborrow.webinterface.generated.model.userservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="books" type="{userservice.model.generated.webinterface.liborrow.com}bookDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="borrower" type="{userservice.model.generated.webinterface.liborrow.com}userLightDTO" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="extended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="getBackDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="magazines" type="{userservice.model.generated.webinterface.liborrow.com}magazineDTO" maxOccurs="unbounded" minOccurs="0"/>
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
    "books",
    "borrower",
    "endDate",
    "extended",
    "getBackDate",
    "id",
    "magazines",
    "startDate"
})
public class BorrowDTO {

    @XmlElement(nillable = true)
    protected List<BookDTO> books;
    protected UserLightDTO borrower;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected Boolean extended;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar getBackDate;
    protected long id;
    @XmlElement(nillable = true)
    protected List<MagazineDTO> magazines;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;

    /**
     * Gets the value of the books property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the books property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBooks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookDTO }
     * 
     * 
     */
    public List<BookDTO> getBooks() {
        if (books == null) {
            books = new ArrayList<BookDTO>();
        }
        return this.books;
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
     * Gets the value of the magazines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the magazines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMagazines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MagazineDTO }
     * 
     * 
     */
    public List<MagazineDTO> getMagazines() {
        if (magazines == null) {
            magazines = new ArrayList<MagazineDTO>();
        }
        return this.magazines;
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
