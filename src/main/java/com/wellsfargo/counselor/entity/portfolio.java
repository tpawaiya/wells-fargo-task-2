package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class portfolio {

    @Id
    @GeneratedValue()
    private long clientId;
    private long portfolioId;

    @Column(nullable = false)
    private String creationDate;

   
    protected portfolio() {

    }

    public portfolio(String creationdate) {
        this.creationDate = creationdate;
    }

    public Long getclientId()
    {
        return clientId;
    }
    public Long getportfolioId() {
        return portfolioId;
        
    }

    public String getcreationDate() {
        return creationDate;
    }

    public void setcreationDate(String creationdate) {
        this.creationDate = creationdate;
    }

    
}

