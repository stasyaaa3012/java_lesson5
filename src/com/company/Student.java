package com.company;

public class Student {

    private String name;
    private Integer age;
    private Gender gender;
    private Clothes clothes;

    public Student(String name, Gender gender, Clothes clothes) {
        this.name = name;
        RandomAge();
        this.gender = gender;
        this.clothes = clothes;
    }

    public void RandomAge() {
        age = (int)(Math.random() * 3 + 12);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return "Ученик {" +
                "имя = '" + name + '\'' +
                ", возраст = " + age +
                ", пол = " + gender.getPol() +
                ", название одежды = " + clothes.getClothesName().getPol() +
                ", цвет одежды = " + clothes.getClothesColor().getPol() +
                ", размер = " + clothes.getClothesSize() +
                ", кол-во карманов = " + clothes.getClothesPocket() +
                '}';
    }

}
