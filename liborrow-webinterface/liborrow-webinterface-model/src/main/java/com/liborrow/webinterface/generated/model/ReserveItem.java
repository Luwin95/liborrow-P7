
package com.liborrow.webinterface.generated.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour reserveItem complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reserveItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{model.generated.webinterface.liborrow.com}itemDTO" minOccurs="0"/>
 *         &lt;element name="arg1" type="{model.generated.webinterface.liborrow.com}userLightDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserveItem", propOrder = {
    "arg0",
    "arg1"
})
public class ReserveItem {

    protected ItemDTO arg0;
    protected UserLightDTO arg1;

    /**
     * Obtient la valeur de la propriété arg0.
     * 
     * @return
     *     possible object is
     *     {@link ItemDTO }
     *     
     */
    public ItemDTO getArg0() {
        return arg0;
    }

    /**
     * Définit la valeur de la propriété arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDTO }
     *     
     */
    public void setArg0(ItemDTO value) {
        this.arg0 = value;
    }

    /**
     * Obtient la valeur de la propriété arg1.
     * 
     * @return
     *     possible object is
     *     {@link UserLightDTO }
     *     
     */
    public UserLightDTO getArg1() {
        return arg1;
    }

    /**
     * Définit la valeur de la propriété arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLightDTO }
     *     
     */
    public void setArg1(UserLightDTO value) {
        this.arg1 = value;
    }

}
