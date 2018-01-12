
package com.liborrow.webinterface.generated.model.itemservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour itemCriterias complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="itemCriterias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorCriterias" type="{itemservice.model.generated.webinterface.liborrow.com}authorCriterias" minOccurs="0"/>
 *         &lt;element name="authorSearch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bookCriterias" type="{itemservice.model.generated.webinterface.liborrow.com}bookCriterias" minOccurs="0"/>
 *         &lt;element name="bookSearch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="itemRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="magazineCriterias" type="{itemservice.model.generated.webinterface.liborrow.com}magazineCriterias" minOccurs="0"/>
 *         &lt;element name="magazineSearch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemCriterias", propOrder = {
    "authorCriterias",
    "authorSearch",
    "bookCriterias",
    "bookSearch",
    "itemRef",
    "magazineCriterias",
    "magazineSearch"
})
public class ItemCriterias {

    protected AuthorCriterias authorCriterias;
    protected boolean authorSearch;
    protected BookCriterias bookCriterias;
    protected boolean bookSearch;
    protected String itemRef;
    protected MagazineCriterias magazineCriterias;
    protected boolean magazineSearch;

    /**
     * Obtient la valeur de la propriété authorCriterias.
     * 
     * @return
     *     possible object is
     *     {@link AuthorCriterias }
     *     
     */
    public AuthorCriterias getAuthorCriterias() {
        return authorCriterias;
    }

    /**
     * Définit la valeur de la propriété authorCriterias.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorCriterias }
     *     
     */
    public void setAuthorCriterias(AuthorCriterias value) {
        this.authorCriterias = value;
    }

    /**
     * Obtient la valeur de la propriété authorSearch.
     * 
     */
    public boolean isAuthorSearch() {
        return authorSearch;
    }

    /**
     * Définit la valeur de la propriété authorSearch.
     * 
     */
    public void setAuthorSearch(boolean value) {
        this.authorSearch = value;
    }

    /**
     * Obtient la valeur de la propriété bookCriterias.
     * 
     * @return
     *     possible object is
     *     {@link BookCriterias }
     *     
     */
    public BookCriterias getBookCriterias() {
        return bookCriterias;
    }

    /**
     * Définit la valeur de la propriété bookCriterias.
     * 
     * @param value
     *     allowed object is
     *     {@link BookCriterias }
     *     
     */
    public void setBookCriterias(BookCriterias value) {
        this.bookCriterias = value;
    }

    /**
     * Obtient la valeur de la propriété bookSearch.
     * 
     */
    public boolean isBookSearch() {
        return bookSearch;
    }

    /**
     * Définit la valeur de la propriété bookSearch.
     * 
     */
    public void setBookSearch(boolean value) {
        this.bookSearch = value;
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
     * Obtient la valeur de la propriété magazineCriterias.
     * 
     * @return
     *     possible object is
     *     {@link MagazineCriterias }
     *     
     */
    public MagazineCriterias getMagazineCriterias() {
        return magazineCriterias;
    }

    /**
     * Définit la valeur de la propriété magazineCriterias.
     * 
     * @param value
     *     allowed object is
     *     {@link MagazineCriterias }
     *     
     */
    public void setMagazineCriterias(MagazineCriterias value) {
        this.magazineCriterias = value;
    }

    /**
     * Obtient la valeur de la propriété magazineSearch.
     * 
     */
    public boolean isMagazineSearch() {
        return magazineSearch;
    }

    /**
     * Définit la valeur de la propriété magazineSearch.
     * 
     */
    public void setMagazineSearch(boolean value) {
        this.magazineSearch = value;
    }

}
