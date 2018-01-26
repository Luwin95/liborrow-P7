
package com.liborrow.webinterface.generated.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authors" type="{model.generated.webinterface.liborrow.com}authorDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="books" type="{model.generated.webinterface.liborrow.com}bookDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="magazines" type="{model.generated.webinterface.liborrow.com}magazineDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchResponse", propOrder = {
    "authors",
    "books",
    "magazines"
})
public class SearchResponse {

    @XmlElement(nillable = true)
    protected List<AuthorDTO> authors;
    @XmlElement(nillable = true)
    protected List<BookDTO> books;
    @XmlElement(nillable = true)
    protected List<MagazineDTO> magazines;

    /**
     * Gets the value of the authors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorDTO }
     * 
     * 
     */
    public List<AuthorDTO> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<AuthorDTO>();
        }
        return this.authors;
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

}
