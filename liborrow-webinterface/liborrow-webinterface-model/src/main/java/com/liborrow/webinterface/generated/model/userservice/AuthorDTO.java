
package com.liborrow.webinterface.generated.model.userservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour authorDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="authorDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="biography" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="books" type="{userservice.model.generated.webinterface.liborrow.com}bookDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="citizenships" type="{userservice.model.generated.webinterface.liborrow.com}citizenship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="death" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="image" type="{userservice.model.generated.webinterface.liborrow.com}imageDTO" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authorDTO", propOrder = {
    "biography",
    "birth",
    "books",
    "citizenships",
    "death",
    "firstname",
    "id",
    "image",
    "name"
})
public class AuthorDTO {

    protected String biography;
    protected int birth;
    @XmlElement(nillable = true)
    protected List<BookDTO> books;
    @XmlElement(nillable = true)
    protected List<Citizenship> citizenships;
    protected int death;
    protected String firstname;
    protected Long id;
    protected ImageDTO image;
    protected String name;

    /**
     * Obtient la valeur de la propriété biography.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiography() {
        return biography;
    }

    /**
     * Définit la valeur de la propriété biography.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiography(String value) {
        this.biography = value;
    }

    /**
     * Obtient la valeur de la propriété birth.
     * 
     */
    public int getBirth() {
        return birth;
    }

    /**
     * Définit la valeur de la propriété birth.
     * 
     */
    public void setBirth(int value) {
        this.birth = value;
    }

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
     * Gets the value of the citizenships property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citizenships property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitizenships().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Citizenship }
     * 
     * 
     */
    public List<Citizenship> getCitizenships() {
        if (citizenships == null) {
            citizenships = new ArrayList<Citizenship>();
        }
        return this.citizenships;
    }

    /**
     * Obtient la valeur de la propriété death.
     * 
     */
    public int getDeath() {
        return death;
    }

    /**
     * Définit la valeur de la propriété death.
     * 
     */
    public void setDeath(int value) {
        this.death = value;
    }

    /**
     * Obtient la valeur de la propriété firstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Définit la valeur de la propriété firstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
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
     * Obtient la valeur de la propriété image.
     * 
     * @return
     *     possible object is
     *     {@link ImageDTO }
     *     
     */
    public ImageDTO getImage() {
        return image;
    }

    /**
     * Définit la valeur de la propriété image.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageDTO }
     *     
     */
    public void setImage(ImageDTO value) {
        this.image = value;
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

}
