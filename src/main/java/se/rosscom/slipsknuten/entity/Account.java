/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.rosscom.slipsknuten.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ulfrossang
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT e FROM Account e")
})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Account implements Serializable {


    public Account(String userId, String mail) {
        this.userId = userId;
        this.mail = mail;
    }

    
    @Id
    private String userId;
    private String mail;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Account() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    
}
