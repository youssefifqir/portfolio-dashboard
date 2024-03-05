package com.atouch.projet_jee.beans.achat;

import com.atouch.projet_jee.beans.Investisseur;
import com.atouch.projet_jee.beans.portfeuille.Portefeuille;
import com.atouch.projet_jee.beans.Societe;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class AchatObligation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Investisseur investisseur;
    @ManyToOne
    private Portefeuille portefeuille;
    private long nombre;

    @ManyToOne
    private Societe societe;
    private LocalDateTime dateAchat;
    private BigDecimal montantUnitaire;
    private BigDecimal montantBase;
    private BigDecimal montantTotalAvecImpots;

    @OneToOne
    private TypeObligation typeObligation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Investisseur getInvestisseur() {
        return investisseur;
    }

    public void setInvestisseur(Investisseur investisseur) {
        this.investisseur = investisseur;
    }

    public Portefeuille getPortefeuille() {
        return portefeuille;
    }

    public void setPortefeuille(Portefeuille portefeuille) {
        this.portefeuille = portefeuille;
    }

    public long getNombre() {
        return nombre;
    }

    public void setNombre(long nombre) {
        this.nombre = nombre;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public LocalDateTime getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDateTime dateAchat) {
        this.dateAchat = dateAchat;
    }

    public BigDecimal getMontantUnitaire() {
        return montantUnitaire;
    }

    public void setMontantUnitaire(BigDecimal montantUnitaire) {
        this.montantUnitaire = montantUnitaire;
    }

    public BigDecimal getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(BigDecimal montantBase) {
        this.montantBase = montantBase;
    }

    public BigDecimal getMontantTotalAvecImpots() {
        return montantTotalAvecImpots;
    }

    public void setMontantTotalAvecImpots(BigDecimal montantTotalAvecImpots) {
        this.montantTotalAvecImpots = montantTotalAvecImpots;
    }

    public TypeObligation getTypeObligation() {
        return typeObligation;
    }

    public void setTypeObligation(TypeObligation typeObligation) {
        this.typeObligation = typeObligation;
    }
}
