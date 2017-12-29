
package com.liborrow.webservice.generated.itemservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour book complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="book">
 *   &lt;complexContent>
 *     &lt;extension base="{http://itemService/}item">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="release" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="editor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authors">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://schemas.xmlsoap.org/soap/encoding/}Array">
 *                 &lt;attribute ref="{http://schemas.xmlsoap.org/soap/encoding/}arrayType"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "book", namespace = "http://itemService/", propOrder = {
    "title",
    "language",
    "release",
    "summary",
    "editor",
    "authors"
})
public class Book
    extends Item
{

    @XmlElement(required = true)
    protected java.lang.String title;
    @XmlElement(required = true)
    protected java.lang.String language;
    @XmlElement(required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar release;
    @XmlElement(required = true)
    protected java.lang.String summary;
    @XmlElement(required = true)
    protected java.lang.String editor;
    @XmlElement(required = true)
    protected Book.Authors authors;

    /**
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTitle() {
        return title;
    }

    /**
     * Définit la valeur de la propriété title.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTitle(java.lang.String value) {
        this.title = value;
    }

    /**
     * Obtient la valeur de la propriété language.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLanguage() {
        return language;
    }

    /**
     * Définit la valeur de la propriété language.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLanguage(java.lang.String value) {
        this.language = value;
    }

    /**
     * Obtient la valeur de la propriété release.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRelease() {
        return release;
    }

    /**
     * Définit la valeur de la propriété release.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRelease(XMLGregorianCalendar value) {
        this.release = value;
    }

    /**
     * Obtient la valeur de la propriété summary.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSummary() {
        return summary;
    }

    /**
     * Définit la valeur de la propriété summary.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSummary(java.lang.String value) {
        this.summary = value;
    }

    /**
     * Obtient la valeur de la propriété editor.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getEditor() {
        return editor;
    }

    /**
     * Définit la valeur de la propriété editor.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setEditor(java.lang.String value) {
        this.editor = value;
    }

    /**
     * Obtient la valeur de la propriété authors.
     * 
     * @return
     *     possible object is
     *     {@link Book.Authors }
     *     
     */
    public Book.Authors getAuthors() {
        return authors;
    }

    /**
     * Définit la valeur de la propriété authors.
     * 
     * @param value
     *     allowed object is
     *     {@link Book.Authors }
     *     
     */
    public void setAuthors(Book.Authors value) {
        this.authors = value;
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
    public static class Authors
        extends Array
    {


    }

}
