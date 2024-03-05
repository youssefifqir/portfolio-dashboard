package com.atouch.projet_jee.beans.bourse;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Bourse {
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String libelle;

private String email;

private String adresse;

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

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getAdresse() {
          return adresse;
     }

     public void setAdresse(String adresse) {
          this.adresse = adresse;
     }
}
