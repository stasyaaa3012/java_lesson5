package com.company;

public class Clothes {

    private ClothesName clothesName;
    private ClothesColor clothesColor;
    private Integer clothesSize;
    private Integer clothesPocket;

    public Clothes(ClothesName clothesName) {
        this.clothesName = clothesName;
        RandomClothesColor();
        RandomClothesSize();
        RandomClothesPocket();
    }

    public void RandomClothesColor() {
        int a;
        a = (int)(Math.random() * 4 + 1);
        switch (a) {
            case 1:
            {
                setClothesColor(clothesColor.GREEN);
                break;
            }
            case 2:
            {
                setClothesColor(clothesColor.WHITE);
                break;
            }
            case 3:
            {
                setClothesColor(clothesColor.BROWN);
                break;
            }
            case 4:
            {
                setClothesColor(clothesColor.RED);
                break;
            }
        }
    }

    public void RandomClothesSize() {
        int a;
        a = (int)(Math.random() * 2 + 23);
        setClothesSize(a);
    }

    public void RandomClothesPocket() {
        int a;
        a = (int)(Math.random() * 5);
        setClothesPocket(a);
    }

    public ClothesName getClothesName() {
        return clothesName;
    }

    public void setClothesName(ClothesName clothesName) {
        this.clothesName = clothesName;
    }

    public ClothesColor getClothesColor() {
        return clothesColor;
    }

    public void setClothesColor(ClothesColor clothesColor) {
        this.clothesColor = clothesColor;
    }

    public Integer getClothesSize() {
        return clothesSize;
    }

    public void setClothesSize(Integer clothesSize) {
        this.clothesSize = clothesSize;
    }

    public Integer getClothesPocket() {
        return clothesPocket;
    }

    public void setClothesPocket(Integer clothesPocket) {
        this.clothesPocket = clothesPocket;
    }

}
