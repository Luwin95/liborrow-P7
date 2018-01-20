
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
 * <p>Classe Java pour magazine complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="magazine">
 *   &lt;complexContent>
 *     &lt;extension base="{userservice.model.generated.webinterface.liborrow.com}item">
 *       &lt;sequence>
 *         &lt;element name="borrows" type="{userservice.model.generated.webinterface.liborrow.com}borrow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="editionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "magazine", propOrder = {
    "borrows",
    "editionNumber",
    "name",
    "publishDate"
})
public class Magazine
    extends Item
{

    @XmlElement(nillable = true)
    protected List<Borrow> borrows;
    protected int editionNumber;
    protected String name;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;

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
     * {@link Borrow }
     * 
     * 
     */
    public List<Borrow> getBorrows() {
        if (borrows == null) {
            borrows = new ArrayList<Borrow>();
        }
        return this.borrows;
    }

    /**
     * Obtient la valeur de la propriété editionNumber.
     * 
     */
    public int getEditionNumber() {
        return editionNumber;
    }

    /**
     * Définit la valeur de la propriété editionNumber.
     * 
     */
    public void setEditionNumber(int value) {
        this.editionNumber = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété publishDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishDate() {
        return publishDate;
    }

    /**
     * Définit la valeur de la propriété publishDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishDate(XMLGregorianCalendar value) {
        this.publishDate = value;
    }

}
