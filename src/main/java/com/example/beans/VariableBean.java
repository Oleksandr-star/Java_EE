package com.example.beans;

import java.io.Serializable;

public class VariableBean implements Serializable {
    private String variable = "Default Value";

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }
}