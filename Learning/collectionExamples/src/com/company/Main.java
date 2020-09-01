package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //ArrayList example

        List<String> names = new ArrayList<>();
        names.add("Jānis");
        names.add("Pēteris");
        names.add("Anna");
        System.out.println(names);

        //LinkedList example
        LinkedList<String> animals = new LinkedList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("cow");
        System.out.println("Animals: "+animals);

        LinkedList<String> birds = new LinkedList<>();
        birds.add("swan");
        birds.add("crow");

        //add one linked list to another
        animals.addAll(birds);
        System.out.println("Animals and birds:"+ animals);

        //listIterator

        ListIterator<String> listIterate = animals.listIterator();
        System.out.println("List iterator:");

        while (listIterate.hasNext()){ //also can use hasPrevious()
            System.out.println(listIterate.next());
            System.out.println(", ");
        }
    }
}
