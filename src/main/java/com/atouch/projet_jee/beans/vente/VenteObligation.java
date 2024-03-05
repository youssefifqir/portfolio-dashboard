package com.atouch.projet_jee.beans.vente;

import com.atouch.projet_jee.beans.Investisseur;
import com.atouch.projet_jee.beans.Societe;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class VenteObligation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int nombre;
    private BigDecimal prixUnitaire;
    private BigDecimal prixdeBase;
    @ManyToOne
    private Investisseur investisseur;
    @ManyToOne
    private Societe societe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(BigDecimal prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public BigDecimal getPrixdeBase() {
        return prixdeBase;
    }

    public void setPrixdeBase(BigDecimal prixdeBase) {
        this.prixdeBase = prixdeBase;
    }

    public Investisseur getInvestisseur() {
        return investisseur;
    }

    public void setInvestisseur(Investisseur investisseur) {
        this.investisseur = investisseur;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }
}
