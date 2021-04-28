package com.company;

public enum Gender {

    MALE ("мальчик"),
    FEMALE ("девочка");

    private String pol;

    Gender(String pol) {
        this.pol = pol;
    }

    public String getPol() {
        return pol;
    }

}
