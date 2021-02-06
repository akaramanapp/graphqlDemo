package com.dgs.graphqlDemo;

public class Person {
    private final String name;
    private final String surname;
    private final String country;
    private final String city;
    private final int birthYear;

    public Person(String name, String surname, String country, String city, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.city = city;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public int getBirthyear() {
        return birthYear;
    }

}
