
package com.liborrow.webservice.generated.itemservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour author complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="author">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="birth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="death" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="biography" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="citizenships">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://schemas.xmlsoap.org/soap/encoding/}Array">
 *                 &lt;attribute ref="{http://schemas.xmlsoap.org/soap/encoding/}arrayType"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "author", namespace = "http://itemService/", propOrder = {
    "id",
    "name",
    "firstname",
    "birth",
    "death",
    "biography",
    "citizenships"
})
public class Author {

    protected int id;
    @XmlElement(required = true)
    protected java.lang.String name;
    @XmlElement(required = true)
    protected java.lang.String firstname;
    protected int birth;
    protected int death;
    @XmlElement(required = true)
    protected java.lang.String biography;
    @XmlElement(required = true)
    protected Author.Citizenships citizenships;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * Obtient la valeur de la propriété firstname.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFirstname() {
        return firstname;
    }

    /**
     * Définit la valeur de la propriété firstname.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFirstname(java.lang.String value) {
        this.firstname = value;
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
     * Obtient la valeur de la propriété biography.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getBiography() {
        return biography;
    }

    /**
     * Définit la valeur de la propriété biography.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setBiography(java.lang.String value) {
        this.biography = value;
    }

    /**
     * Obtient la valeur de la propriété citizenships.
     * 
     * @return
     *     possible object is
     *     {@link Author.Citizenships }
     *     
     */
    public Author.Citizenships getCitizenships() {
        return citizenships;
    }

    /**
     * Définit la valeur de la propriété citizenships.
     * 
     * @param value
     *     allowed object is
     *     {@link Author.Citizenships }
     *     
     */
    public void setCitizenships(Author.Citizenships value) {
        this.citizenships = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://schemas.xmlsoap.org/soap/encoding/}Array">
     *       &lt;attribute ref="{http://schemas.xmlsoap.org/soap/encoding/}arrayType"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Citizenships
        extends Array
    {


    }

}
