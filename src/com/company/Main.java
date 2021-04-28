package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Мария", Gender.FEMALE, new Clothes(ClothesName.JACKET)));
        studentList.add(new Student("Анна", Gender.FEMALE, new Clothes(ClothesName.JACKET)));
        studentList.add(new Student("Анастасия", Gender.FEMALE, new Clothes(ClothesName.CLOAK)));
        studentList.add(new Student("Дарья", Gender.FEMALE, new Clothes(ClothesName.BLOUSE)));
        studentList.add(new Student("Ольга", Gender.FEMALE, new Clothes(ClothesName.JEANS)));
        studentList.add(new Student("Екатерина", Gender.FEMALE, new Clothes(ClothesName.JUMPER)));
        studentList.add(new Student("Ирина", Gender.FEMALE, new Clothes(ClothesName.DRESS)));
        studentList.add(new Student("Елизавета", Gender.FEMALE, new Clothes(ClothesName.DRESS)));
        studentList.add(new Student("Татьяна", Gender.FEMALE, new Clothes(ClothesName.JACKET)));
        studentList.add(new Student("Наталья", Gender.FEMALE, new Clothes(ClothesName.JUMPER)));
        studentList.add(new Student("Варвара", Gender.FEMALE, new Clothes(ClothesName.JEANS)));
        studentList.add(new Student("Юлия", Gender.FEMALE, new Clothes(ClothesName.BLOUSE)));
        studentList.add(new Student("Ксения", Gender.FEMALE, new Clothes(ClothesName.BLOUSE)));
        studentList.add(new Student("Маргарита", Gender.FEMALE, new Clothes(ClothesName.CLOAK)));
        studentList.add(new Student("Алёна", Gender.FEMALE, new Clothes(ClothesName.DRESS)));
        studentList.add(new Student("Кристина", Gender.FEMALE, new Clothes(ClothesName.BLOUSE)));
        studentList.add(new Student("Любовь", Gender.FEMALE, new Clothes(ClothesName.JACKET)));
        studentList.add(new Student("Светлана", Gender.FEMALE, new Clothes(ClothesName.CLOAK)));
        studentList.add(new Student("Елена", Gender.FEMALE, new Clothes(ClothesName.JEANS)));
        studentList.add(new Student("Анастасия", Gender.FEMALE, new Clothes(ClothesName.COAT)));
        studentList.add(new Student("Мария", Gender.FEMALE, new Clothes(ClothesName.COAT)));
        studentList.add(new Student("Юлия", Gender.FEMALE, new Clothes(ClothesName.JEANS)));
        studentList.add(new Student("Анна", Gender.FEMALE, new Clothes(ClothesName.DRESS)));
        studentList.add(new Student("Екатерина", Gender.FEMALE, new Clothes(ClothesName.BLOUSE)));
        studentList.add(new Student("Елизавета", Gender.FEMALE, new Clothes(ClothesName.DRESS)));
        studentList.add(new Student("Ирина", Gender.FEMALE, new Clothes(ClothesName.DRESS)));
        studentList.add(new Student("Наталья", Gender.FEMALE, new Clothes(ClothesName.BLOUSE)));
        studentList.add(new Student("Злата", Gender.FEMALE, new Clothes(ClothesName.JACKET)));
        studentList.add(new Student("Антон", Gender.MALE, new Clothes(ClothesName.JACKET)));
        studentList.add(new Student("Александр", Gender.MALE, new Clothes(ClothesName.JACKET)));
        studentList.add(new Student("Денис", Gender.MALE, new Clothes(ClothesName.JEANS)));
        studentList.add(new Student("Даниил", Gender.MALE, new Clothes(ClothesName.COAT)));
        studentList.add(new Student("Богдан", Gender.MALE, new Clothes(ClothesName.COAT)));
        studentList.add(new Student("Арсений", Gender.MALE, new Clothes(ClothesName.JEANS)));
        studentList.add(new Student("Павел", Gender.MALE, new Clothes(ClothesName.JACKET)));
        studentList.add(new Student("Константин", Gender.MALE, new Clothes(ClothesName.JUMPER)));
        studentList.add(new Student("Владимир", Gender.MALE, new Clothes(ClothesName.JUMPER)));
        studentList.add(new Student("Антон", Gender.MALE, new Clothes(ClothesName.CLOAK)));
        studentList.add(new Student("Сергей", Gender.MALE, new Clothes(ClothesName.JEANS)));
        studentList.add(new Student("Михаил", Gender.MALE, new Clothes(ClothesName.JACKET)));

        /*1. Вывести в консоль сколько в классе человек женского и мужского пола*/
        Stream<Student> girlStream = studentList.stream();
        long girlsOfNumber = girlStream.filter(it -> it.getGender() == Gender.FEMALE).count();
        Stream<Student> boyStream = studentList.stream();
        long boysOfNumber = boyStream.filter(it -> it.getGender() == Gender.MALE).count();
        System.out.println("Девочек в классе: " + girlsOfNumber +
                ". Мальчиков в классе: " + boysOfNumber);
        System.out.println("==========================================");

        /*2. Посчитать средний возраст группы*/
        //для использования average() приведем поток к IntStream
        Double aveAge = studentList.stream().mapToInt(it -> it.getAge()).average().getAsDouble();
        System.out.println("Средний возраст детей в классе: " + aveAge);
        System.out.println("==========================================");

        /*3. Создать коллекцию и Вывести список людей в порядке возрастания по имени одежды*/
        List<Student> nameCloth = studentList.stream()
                .sorted(Comparator.comparing(it -> it.getClothes().getClothesName())).collect(Collectors.toList());
        System.out.println("Список учеников в порядке возрастания по названию одежды: ");
        nameCloth.forEach(System.out::println);
        System.out.println("===========================================");

        /*4. Создать коллекцию и Вывести список людей в порядке убывания по размеру одежды*/
        List<Student> sizeCloth = studentList.stream()
                .sorted(Comparator.comparing(it -> it.getClothes().getClothesSize())).collect(Collectors.toList());
        System.out.println("Список учеников в порядке убыванию по размеру одежды: ");
        sizeCloth.forEach(System.out::println);
        System.out.println("===========================================");

        /*5. Создать коллекцию и Вывести только тех людей, у которых 2 кармана*/
        System.out.println("Список учеников с двумя карманами на одежде: ");
        List<Student> pocketCloth = studentList.stream()
                .filter(it -> it.getClothes().getClothesPocket() == 2).collect(Collectors.toList());
        pocketCloth.forEach(System.out::println);
        System.out.println("===========================================");

        /*6. Создать коллекцию и Вывести только тех людей, у которых цвет одежды зеленый и коричневый*/
        System.out.println("Список учеников одетых в одежу зеленого и коричневого цвета: ");
        List<Student> colorCloth = studentList.stream()
                .filter(it -> it.getClothes().getClothesColor() == ClothesColor.BROWN ||
                it.getClothes().getClothesColor() == ClothesColor.GREEN).collect(Collectors.toList());
        colorCloth.forEach(System.out::println);
        System.out.println("===========================================");
    }
}