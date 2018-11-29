package com.siit.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private String CNP;
    private List<String> hobbies = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(CNP, person.CNP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, CNP);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", CNP='" + CNP + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }
}
