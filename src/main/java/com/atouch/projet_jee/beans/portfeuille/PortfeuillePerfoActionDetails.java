package com.atouch.projet_jee.beans.portfeuille;

import com.atouch.projet_jee.beans.Societe;
import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
public class PortfeuillePerfoActionDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Portefeuille portefeuille;
    @OneToOne
    private Societe societe;
    private Long nbrActions ;
    private long prixMoy;//prix moy des actions
    private BigDecimal performance; // performance des actions pour 1 societe

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Portefeuille getPortefeuille() {
        return portefeuille;
    }

    public void setPortefeuille(Portefeuille portefeuille) {
        this.portefeuille = portefeuille;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public Long getNbrActions() {
        return nbrActions;
    }

    public void setNbrActions(Long nbrActions) {
        this.nbrActions = nbrActions;
    }

    public long getPrixMoy() {
        return prixMoy;
    }

    public void setPrixMoy(long prixMoy) {
        this.prixMoy = prixMoy;
    }

    public BigDecimal getPerformance() {
        return performance;
    }

    public void setPerformance(BigDecimal performance) {
        this.performance = performance;
    }
}
