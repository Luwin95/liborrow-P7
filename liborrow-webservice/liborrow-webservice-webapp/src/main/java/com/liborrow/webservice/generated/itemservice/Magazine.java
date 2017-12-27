
package com.liborrow.webservice.generated.itemservice;

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
 *     &lt;extension base="{http://itemService/}item">
 *       &lt;sequence>
 *         &lt;element name="editionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "magazine", namespace = "http://itemService/", propOrder = {
    "editionNumber",
    "name",
    "publishDate"
})
public class Magazine
    extends Item
{

    protected int editionNumber;
    @XmlElement(required = true)
    protected java.lang.String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar publishDate;

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
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setName(java.lang.String value) {
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
