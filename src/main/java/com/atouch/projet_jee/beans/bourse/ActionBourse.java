package com.atouch.projet_jee.beans.bourse;

import com.atouch.projet_jee.beans.Societe;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class ActionBourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Societe societe;

    private BigDecimal prixActionDepart;

    private BigDecimal prixActionFin;

    private LocalDate dateActionBourse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public BigDecimal getPrixActionDepart() {
        return prixActionDepart;
    }

    public void setPrixActionDepart(BigDecimal prixActionDepart) {
        this.prixActionDepart = prixActionDepart;
    }

    public BigDecimal getPrixActionFin() {
        return prixActionFin;
    }

    public void setPrixActionFin(BigDecimal prixActionFin) {
        this.prixActionFin = prixActionFin;
    }

    public LocalDate getDateActionBourse() {
        return dateActionBourse;
    }

    public void setDateActionBourse(LocalDate dateActionBourse) {
        this.dateActionBourse = dateActionBourse;
    }
}
