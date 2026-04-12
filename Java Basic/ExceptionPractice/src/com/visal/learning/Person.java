package com.visal.learning;

import java.time.LocalDate;

public class Person {
    private Long Id;
    private String name ;
    private String gender;
    private LocalDate dateOfBirth;
    private String IdCard;

    public Person(Long id, String name, String gender, LocalDate dateOfBirth, String idCard) {
        Id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        IdCard = idCard;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", IdCard='" + IdCard + '\'' +
                '}';
    }
}
