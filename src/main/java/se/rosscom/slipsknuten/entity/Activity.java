/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.rosscom.slipsknuten.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ulfrossang
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Activity implements Serializable {

    public Activity() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    
    @ManyToOne  
    @JoinColumn(name="userId", insertable = false, updatable = false, nullable=false)
    private Account userId;
    
    private String activity;
    
    private Timestamp endOfActivity;
    
    public Timestamp getEndOfActivity() {
        return endOfActivity;
    }

    public void setEndOfActivity(Timestamp endOfActivity) {
        this.endOfActivity = endOfActivity;
    }


    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getUserId() {
        return userId;
    }

    public void setUserId(Account userId) {
        this.userId = userId;
    }
}
