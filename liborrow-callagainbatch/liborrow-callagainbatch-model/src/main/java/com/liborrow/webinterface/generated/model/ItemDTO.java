
package com.liborrow.webinterface.generated.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour itemDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="itemDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alley" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="borrows" type="{model.generated.webinterface.liborrow.com}borrowDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="itemRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextReturn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remainingCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reservations" type="{model.generated.webinterface.liborrow.com}waitingListDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reservationsNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemDTO", propOrder = {
    "alley",
    "borrows",
    "id",
    "itemRef",
    "itemType",
    "nextReturn",
    "place",
    "remainingCount",
    "reservations",
    "reservationsNumber",
    "totalCount"
})
@XmlSeeAlso({
    MagazineDTO.class,
    BookDTO.class
})
public class ItemDTO {

    protected String alley;
    @XmlElement(nillable = true)
    protected List<BorrowDTO> borrows;
    protected Long id;
    protected String itemRef;
    protected String itemType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextReturn;
    protected String place;
    protected int remainingCount;
    @XmlElement(nillable = true)
    protected List<WaitingListDTO> reservations;
    protected Long reservationsNumber;
    protected int totalCount;

    /**
     * Obtient la valeur de la propriété alley.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlley() {
        return alley;
    }

    /**
     * Définit la valeur de la propriété alley.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlley(String value) {
        this.alley = value;
    }

    /**
     * Gets the value of the borrows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the borrows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorrows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BorrowDTO }
     * 
     * 
     */
    public List<BorrowDTO> getBorrows() {
        if (borrows == null) {
            borrows = new ArrayList<BorrowDTO>();
        }
        return this.borrows;
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
     * Obtient la valeur de la propriété itemRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemRef() {
        return itemRef;
    }

    /**
     * Définit la valeur de la propriété itemRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemRef(String value) {
        this.itemRef = value;
    }

    /**
     * Obtient la valeur de la propriété itemType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Définit la valeur de la propriété itemType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Obtient la valeur de la propriété nextReturn.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextReturn() {
        return nextReturn;
    }

    /**
     * Définit la valeur de la propriété nextReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextReturn(XMLGregorianCalendar value) {
        this.nextReturn = value;
    }

    /**
     * Obtient la valeur de la propriété place.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Définit la valeur de la propriété place.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Obtient la valeur de la propriété remainingCount.
     * 
     */
    public int getRemainingCount() {
        return remainingCount;
    }

    /**
     * Définit la valeur de la propriété remainingCount.
     * 
     */
    public void setRemainingCount(int value) {
        this.remainingCount = value;
    }

    /**
     * Gets the value of the reservations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaitingListDTO }
     * 
     * 
     */
    public List<WaitingListDTO> getReservations() {
        if (reservations == null) {
            reservations = new ArrayList<WaitingListDTO>();
        }
        return this.reservations;
    }

    /**
     * Obtient la valeur de la propriété reservationsNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReservationsNumber() {
        return reservationsNumber;
    }

    /**
     * Définit la valeur de la propriété reservationsNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReservationsNumber(Long value) {
        this.reservationsNumber = value;
    }

    /**
     * Obtient la valeur de la propriété totalCount.
     * 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Définit la valeur de la propriété totalCount.
     * 
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

}
