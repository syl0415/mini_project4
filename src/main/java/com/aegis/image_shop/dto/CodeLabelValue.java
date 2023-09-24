package com.aegis.image_shop.dto;

public class CodeLabelValue{
    private String value;
    private String label;

    public CodeLabelValue(){
        super();
    }

    public CodeLabelValue(String value, String label){
        this.label = label;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
