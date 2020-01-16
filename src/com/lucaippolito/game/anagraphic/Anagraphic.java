package com.lucaippolito.game.anagraphic;

public class Anagraphic {
    private String name;
    private String surname;
    private Integer age;
    private String address;
    private String sex;

    public Anagraphic(String name,String surname,Integer age,String address,String sex){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }
}
