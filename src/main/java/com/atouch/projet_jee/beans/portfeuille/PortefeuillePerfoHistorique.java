package com.atouch.projet_jee.beans.portfeuille;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class PortefeuillePerfoHistorique {
    //pour chaque portefeuille 3ndo historique dialo 3la 7sab date
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Portefeuille portefeuille;

    private LocalDate date;
    private double performance;

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }
}
