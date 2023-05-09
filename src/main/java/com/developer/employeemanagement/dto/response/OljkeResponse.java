package com.developer.employeemanagement.dto.response;

import java.io.Serializable;

public class OljkeResponse implements Serializable {
    private Long id;
    private String label;

    public OljkeResponse() {
    }

    public OljkeResponse(Long id, String label) {
        this.id = id;
        this.label = label;
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
}
