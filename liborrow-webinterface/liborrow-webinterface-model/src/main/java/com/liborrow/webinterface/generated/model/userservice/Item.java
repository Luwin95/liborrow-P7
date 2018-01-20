
package com.liborrow.webinterface.generated.model.userservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour item complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alley" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="itemRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remainingCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "item", propOrder = {
    "alley",
    "id",
    "itemRef",
    "place",
    "remainingCount",
    "totalCount"
})
@XmlSeeAlso({
    Book.class,
    Magazine.class
})
public abstract class Item {

    protected String alley;
    protected Long id;
    protected String itemRef;
    protected String place;
    protected int remainingCount;
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
