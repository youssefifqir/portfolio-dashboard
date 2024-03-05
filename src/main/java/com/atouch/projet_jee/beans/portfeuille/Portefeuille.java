package com.atouch.projet_jee.beans.portfeuille;

import com.atouch.projet_jee.beans.Investisseur;
import com.atouch.projet_jee.beans.Societe;
import com.atouch.projet_jee.beans.achat.AchatAction;
import com.atouch.projet_jee.beans.achat.AchatObligation;
import com.atouch.projet_jee.beans.vente.VenteAction;
import com.atouch.projet_jee.beans.vente.VenteObligation;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Portefeuille {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long libelle;
    @ManyToOne
    private Investisseur investisseur;
    @ManyToOne
    private Societe societe;
    @OneToOne
    private PortefeuillePerfo portefeuillePerfo;
    @OneToOne
    private PortfeuillePerfoActionDetails portfeuillePerfoActionDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLibelle() {
        return libelle;
    }

    public void setLibelle(Long libelle) {
        this.libelle = libelle;
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

    public PortefeuillePerfo getPortefeuillePerfo() {
        return portefeuillePerfo;
    }

    public void setPortefeuillePerfo(PortefeuillePerfo portefeuillePerfo) {
        this.portefeuillePerfo = portefeuillePerfo;
    }

    public PortfeuillePerfoActionDetails getPortfeuillePerfoActionDetails() {
        return portfeuillePerfoActionDetails;
    }

    public void setPortfeuillePerfoActionDetails(PortfeuillePerfoActionDetails portfeuillePerfoActionDetails) {
        this.portfeuillePerfoActionDetails = portfeuillePerfoActionDetails;
    }
}
