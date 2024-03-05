package com.atouch.projet_jee.beans;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Societe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @OneToOne
    private SocietyCategory societyCategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SocietyCategory getSocietyCategory() {
        return societyCategory;
    }

    public void setSocietyCategory(SocietyCategory societyCategory) {
        this.societyCategory = societyCategory;
    }
}
