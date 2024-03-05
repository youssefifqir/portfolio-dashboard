package com.atouch.projet_jee.beans.bourse;

import com.atouch.projet_jee.beans.SocietyCategory;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
public class BourseSociete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

   private String Nom;
   @ManyToOne
   private SocietyCategory societyCategory;
   private double pourcentageAugmentationAction ;
   private double pourcentageDimunitionAction ;
    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public SocietyCategory getSocietyCategory() {
        return societyCategory;
    }

    public void setSocietyCategory(SocietyCategory societyCategory) {
        this.societyCategory = societyCategory;
    }

    public double getPourcentageAugmentationAction() {
        return pourcentageAugmentationAction;
    }

    public void setPourcentageAugmentationAction(double pourcentageAugmentationAction) {
        this.pourcentageAugmentationAction = pourcentageAugmentationAction;
    }

    public double getPourcentageDimunitionAction() {
        return pourcentageDimunitionAction;
    }

    public void setPourcentageDimunitionAction(double pourcentageDimunitionAction) {
        this.pourcentageDimunitionAction = pourcentageDimunitionAction;
    }
}
