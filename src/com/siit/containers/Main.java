package com.siit.containers;

import java.util.*;

public class Main {

    public static void main(String... args) {

        // array example
        Person[] people = new Person[3];
        Person mia = new Employee("mia", 30);
        List<String> hobbies = new ArrayList<>();
        hobbies.add("reading");
        hobbies.add("running");
        mia.setHobbies(hobbies);
        mia.setCNP("cnp1");
        Person rita = new Student("rita", 22);
        rita.setCNP("cnp2");
        Person rares = new Unemployed("rares", 33);
        rares.setCNP("cnp2");


        people[0] = mia;
        people[1] = rita;
        people[2] = rares;


        // ArrayList example
        List<Person> people1 = new ArrayList<>();
        people1.add(mia);
        people1.add(rita);
        people1.add(rares);


        System.out.println("----- ArrayList -----");
        for (Person person : people1) {
            System.out.println(person.getName());
        }


        System.out.println();
        System.out.println("----- iterate using iterator -----");
        Iterator<Person> personIterator = people1.iterator();
        while (personIterator.hasNext()) {
            Person person = personIterator.next();
            System.out.println(person.getName());
        }


        System.out.println("-----iterate using position---");
        for (int i = 0; i < people1.size(); i++) {
            System.out.println(people1.get(i).getName());
        }

        setExample(mia, rita, rares);

        mapExample(mia, rita, rares);

        treeSetExample(mia, rita, rares, people1);

        queueExample(mia, rita, rares);

        removeInts();

    }

    private static void queueExample(Person mia, Person rita, Person rares) {
        System.out.println();
        System.out.println("-------QUEUE--------");

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(mia);
        linkedList.add(rita);
        linkedList.add(rares);

        System.out.println(linkedList);

        int maxAge = 0;
        Person oldest = null;
        if (linkedList.size() >= 3) {
            for (Person p : linkedList) {
                if (p.getAge() > maxAge) {
                    maxAge = p.getAge();
                    oldest = p;
                }
            }
        }
        System.out.println(linkedList);
        linkedList.removeFirstOccurrence(oldest);
        linkedList.addFirst(oldest);

        System.out.println(linkedList);
    }

    private static void treeSetExample(Person mia, Person rita, Person rares, List<Person> people1) {
        System.out.println();
        System.out.println("---- TREE SET ----");
        Set<Person> peopleOrderedByName = new TreeSet<>();
        peopleOrderedByName.add(rita);
        peopleOrderedByName.add(mia);
        peopleOrderedByName.add(rares);
        System.out.println(peopleOrderedByName);


        System.out.println("before sort");
        System.out.println(people1);
        Collections.sort(people1, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("after sort");
        System.out.println(people1);
    }

    private static void mapExample(Person mia, Person rita, Person rares) {
        System.out.println();
        System.out.println("-------MAP--------");
        Map<String, Person> peopleByNicknames = new HashMap<>();
        peopleByNicknames.put("morcoveata", rita);
        peopleByNicknames.put("isoscel", mia);
        peopleByNicknames.put("patratel", rares);
        for (String key : peopleByNicknames.keySet()) {
            System.out.println(peopleByNicknames.get(key));
        }

        for (Person person : peopleByNicknames.values()) {
            System.out.println(person);
        }

        for (Map.Entry<String, Person> entry : peopleByNicknames.entrySet()) {
            System.out.println(entry);
        }

        peopleByNicknames.clear();
    }

    private static void setExample(Person mia, Person rita, Person rares) {
        Set<Person> peopleAsSet = new HashSet<>();
        peopleAsSet.add(mia);
        peopleAsSet.add(rita);
        peopleAsSet.add(rares);

        System.out.println();
        System.out.println("-------SET------");
        for (Person person : peopleAsSet) {
            System.out.println(person.getName());
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(1);
        numbers.add(10);
        numbers.add(14);

        int sum = 0;
        int prod = 1;

        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                sum += numbers.get(i);
            }
            if (numbers.get(i) % 2 != 0) {
                prod *= numbers.get(i);
            }
        }

        System.out.println("sum : " + sum + " prod:" + prod);


        Integer[] nrs = {1, 2, 3};
        Arrays.asList(nrs);
    }


    public static void removeInts() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(0);
        numbers.add(3);
        numbers.add(5);
        numbers.add(0);
        numbers.add(8);
        numbers.add(13);
        numbers.add(0);

        // expected result: 3,8

        Iterator<Integer> it = numbers.iterator();
        List<Integer> positionsToRemove = new ArrayList<>();

        int i = 0;
        int nrOfRemovals = 0;
        int poz = 0;
        while (it.hasNext()) {
            int next = it.next();
            if (next == 0) {
                it.remove();

                i = poz - nrOfRemovals * 2 - 1;
                positionsToRemove.add(i);

                nrOfRemovals++;
            }
            poz++;
        }

        System.out.println(numbers);
        System.out.println(Arrays.asList(positionsToRemove));
        for (Integer pos : positionsToRemove) {
            if (pos != null) {
                numbers.remove((int) pos);
            } else {
                break;
            }
        }

        System.out.println(numbers);
    }
}
