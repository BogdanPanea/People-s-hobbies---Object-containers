package com.siit.containers;

import java.util.*;

public class Main {

    public static void main(String... args) {

        Person mia = new Employee("mia", 30);
        List<String> hobbiesMia = new ArrayList<>();
        hobbiesMia.add("reading");
        hobbiesMia.add("running");
        mia.setHobbies(hobbiesMia);
        mia.setCNP("cnp1");
        Person rita = new Student("rita", 22);
        List<String> hobbiesRita = new ArrayList<>();
        hobbiesRita.add("sleeping");
        hobbiesRita.add("swimming");
        rita.setHobbies(hobbiesRita);
        rita.setCNP("cnp2");
        Person rares = new Unemployed("rares", 33);
        List<String> hobbiesRares = new ArrayList<>();
        hobbiesRares.add("biking");
        hobbiesRares.add("skiing");
        rita.setHobbies(hobbiesRares);
        rares.setCNP("cnp3");

        List<Person> people = new ArrayList<>();
        people.add(mia);
        people.add(rita);
        people.add(rares);

        treeSet(mia, rita, rares, people);

        Person bia = new Employee("bia", 18);
        Person bob = new Student("bob", 20);
        Person dani = new Unemployed("dani", 27);

        hashMap(bia, bob, dani);

    }

    private static void treeSet(Person mia, Person rita, Person rares, List<Person> people) {

        Set<Person> peopleOrderedByName = new TreeSet<>(new NameComparator());
        peopleOrderedByName.add(rita);
        peopleOrderedByName.add(mia);
        peopleOrderedByName.add(rares);

        Set<Person> peopleOrderedByAge = new TreeSet<>(new AgeComparator());
        peopleOrderedByAge.add(rita);
        peopleOrderedByAge.add(mia);
        peopleOrderedByAge.add(rares);

        System.out.println("---- TREE SET ----");

        System.out.println();

        System.out.println("Before sort");
        System.out.println();
        System.out.println(people);
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();

        System.out.println("After sort by name");
        System.out.println();
        System.out.println(peopleOrderedByName);
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();

        System.out.println("After sort by age");
        System.out.println();
        System.out.println(peopleOrderedByAge);
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();

    }

    private static void hashMap(Person bia, Person bob, Person dani) {

        Address address1 = new Address("Romania");
        Address address2 = new Address("Rusia");
        Address address3 = new Address("Bulgaria");
        Address address4 = new Address("Moldova");
        Address address5 = new Address("Spania");


        List<Address> readingAddreses = new ArrayList<>(Arrays.asList(address1, address2, address3));
        List<Address> sleepingAddreses = new ArrayList<>(Arrays.asList(address1, address3, address4));
        List<Address> runningAddreses = new ArrayList<>(Arrays.asList(address2, address3, address4));
        List<Address> swimmingAddreses = new ArrayList<>(Arrays.asList(address1, address2, address3, address4));
        List<Address> bikingAddreses = new ArrayList<>(Arrays.asList(address3, address4, address5));
        List<Address> skiingAddreses = new ArrayList<>(Arrays.asList(address1, address2, address3, address4, address5));

        List<Hobby> biaHobbies = new ArrayList<>();
        biaHobbies.add(new Hobby("reading", 4, readingAddreses));
        biaHobbies.add(new Hobby("running", 3, runningAddreses));
        biaHobbies.add(new Hobby("biking", 2, bikingAddreses));

        List<Hobby> bobHobbies = new ArrayList<>();
        bobHobbies.add(new Hobby("reading", 2, readingAddreses));
        bobHobbies.add(new Hobby("skiing", 1, skiingAddreses));
        bobHobbies.add(new Hobby("biking", 1, bikingAddreses));

        List<Hobby> daniHobbies = new ArrayList<>();
        daniHobbies.add(new Hobby("sleeping", 7, sleepingAddreses));
        daniHobbies.add(new Hobby("swimming", 2, swimmingAddreses));
        daniHobbies.add(new Hobby("biking", 1, bikingAddreses));


        Map<Person, List<Hobby>> personsWithHobbies = new HashMap<>();
        personsWithHobbies.put(bia, biaHobbies);
        personsWithHobbies.put(bob, bobHobbies);
        personsWithHobbies.put(dani, daniHobbies);

        System.out.println("-------------HashMap---------------");
        System.out.println();
        System.out.println("Person info");
        System.out.println();
        System.out.println(bia);
        System.out.println("Person hobbies information");
        System.out.println();
        System.out.println(personsWithHobbies.get(bia));

//        for (Map.Entry<Person, List<Hobby>> entry : personsWithHobbies.entrySet()) {
//            Person key = entry.getKey();
//            List<Hobby> value = entry.getValue();
//            if(bob.equals( key )) {
//
//                System.out.println( key );
//                System.out.println( value );
//            }
//        }


    }

}
