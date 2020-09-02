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

        //set example

        int count[] = {34, 52, 3, 1, 87, 5};
        Set <Integer> set = new HashSet<>();
        for (int i = 0; i < 5; i++){
            set.add(count[i]);
        }
        System.out.println(set);

        //TreeSet sorts in ascending order
        TreeSet sorted = new TreeSet<Integer>(set);
        System.out.println(sorted);

        //TreeMap, not thread safe, unordered collection
        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
        tmap.put(2, "Rose");
        tmap.put(6, "Peony");
        tmap.put(1, "Daisy");
        tmap.put(24, "Snowdrop");
//display using iterator
        Set set2 = tmap.entrySet();
        Iterator iterator = set2.iterator();
        while(iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("TreeMap key: "+mentry.getKey()+ " value: "+ mentry.getValue());
        }

        System.out.println("__________________________");


        //HashMap

        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(5, "Burrito");
        hmap.put(4, "Paella");
        hmap.put(11, "Taco");
        hmap.put(27, "Nachos");
        //display using iterator
        Set set3 = hmap.entrySet();
        Iterator iterator2 = set3.iterator();
        while(iterator2.hasNext()) {
            Map.Entry hmentry = (Map.Entry) iterator2.next();
            System.out.println("HashMap key: " + hmentry.getKey() + " value: " + hmentry.getValue());
        }

        System.out.println("____________________________");
        //linkedHashMap

        LinkedHashMap shops = new LinkedHashMap();
        shops.put("Mango", new Double(44.33));
        shops.put("Zara", new Double(47.83));
        shops.put("Reserved", new Double(78.39));
        Set set4 = shops.entrySet();

        Iterator i = set4.iterator();

        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey() + ": " + me.getValue());
        }


        }
}
