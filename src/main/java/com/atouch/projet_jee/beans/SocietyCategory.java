package com.atouch.projet_jee.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SocietyCategory {
    @Id
    private Long id;
    private String libelle; // b7al nom dial category
    private String code;
    private long seuilAchat; // hada howa seuil d'achat , ila nbreAchatAction > = had seuil , lprix ghaytchanja

    public long getSeuilAchat() {
        return seuilAchat;
    }

    public void setSeuilAchat(long seuilAchat) {
        this.seuilAchat = seuilAchat;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
