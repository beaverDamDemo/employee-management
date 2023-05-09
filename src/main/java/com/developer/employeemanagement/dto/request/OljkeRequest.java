package com.developer.employeemanagement.dto.request;

import java.io.Serializable;

public class OljkeRequest implements Serializable {
    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
