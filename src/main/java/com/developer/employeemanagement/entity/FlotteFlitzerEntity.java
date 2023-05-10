package com.developer.employeemanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "flotte_flitzer")
public class FlotteFlitzerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String label;
    @Column
    private Integer zyl;
    @Column
    private Integer kw;
    @Column
    private Integer ccm;
    @Column
    private Integer kmh;

    public FlotteFlitzerEntity() {
    }

    public FlotteFlitzerEntity(Long id, String label, Integer zyl, Integer kw, Integer ccm, Integer kmh) {
        this.id = id;
        this.label = label;
        this.zyl = zyl;
        this.kw = kw;
        this.ccm = ccm;
        this.kmh = kmh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getZyl() {
        return zyl;
    }

    public void setZyl(Integer zyl) {
        this.zyl = zyl;
    }

    public Integer getKw() {
        return kw;
    }

    public void setKw(Integer kw) {
        this.kw = kw;
    }

    public Integer getCcm() {
        return ccm;
    }

    public void setCcm(Integer ccm) {
        this.ccm = ccm;
    }

    public Integer getKmh() {
        return kmh;
    }

    public void setKmh(Integer kmh) {
        this.kmh = kmh;
    }
}
