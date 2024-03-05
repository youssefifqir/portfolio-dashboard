package com.atouch.projet_jee.beans.portfeuille;

import jakarta.persistence.*;

@Entity

public class PortefeuillePerfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne
    private Portefeuille portefeuille;
    // totalAction totalObligation performanceAction performanceObligation performanceGlobale
    private long totalAction;
    private long totalObligation;
    private long perfomanceAction;
    private long performanceObligation;
    private long performanceGlobale;//rendement

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

    public long getTotalAction() {
        return totalAction;
    }

    public void setTotalAction(long totalAction) {
        this.totalAction = totalAction;
    }

    public long getTotalObligation() {
        return totalObligation;
    }

    public void setTotalObligation(long totalObligation) {
        this.totalObligation = totalObligation;
    }

    public long getPerfomanceAction() {
        return perfomanceAction;
    }

    public void setPerfomanceAction(long perfomanceAction) {
        this.perfomanceAction = perfomanceAction;
    }

    public long getPerformanceObligation() {
        return performanceObligation;
    }

    public void setPerformanceObligation(long performanceObligation) {
        this.performanceObligation = performanceObligation;
    }

    public long getPerformanceGlobale() {
        return performanceGlobale;
    }

    public void setPerformanceGlobale(long performanceGlobale) {
        this.performanceGlobale = performanceGlobale;
    }
}
