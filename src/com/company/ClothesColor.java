package com.company;

public enum ClothesColor {

    GREEN ("зелёный"),
    WHITE ("белый"),
    BROWN ("коричневый"),
    RED ("красный");

    private String pol;

    ClothesColor (String pol) {
        this.pol = pol;
    }

    public String getPol() {
        return pol;
    }

}
