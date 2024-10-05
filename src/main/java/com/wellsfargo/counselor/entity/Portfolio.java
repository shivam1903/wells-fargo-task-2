package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio(){

    }

    public Portfolio(long clientId, Date creationDate) {
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public long getClientId() {
        return clientId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
