package com.company;

public enum ClothesName {

    BLOUSE ("блузка"),
    JEANS ("джинсы"),
    JACKET ("куртка"),
    COAT ("пальто"),
    DRESS ("платье"),
    CLOAK ("плащ"),
    JUMPER ("свитер");

    private String pol;

    ClothesName(String pol) {
        this.pol = pol;
    }

    public String getPol() {
        return pol;
    }
}
