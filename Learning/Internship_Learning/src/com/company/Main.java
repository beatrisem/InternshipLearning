package com.company;

import s2t1.overrideOverload.Add;
import s2t1.overrideOverload.Dog;

import static s2t1.passByValueAndReference.Swap.swap;

public class Main {

    public static void main(String[] args) {

        //override
        Dog dog1 = new Dog();
        dog1.sound();


        //overload

        Add ad = new Add();
        int result = ad.addMethod(1,2);
        System.out.println("Result: "+ result);

        result = ad.addMethod(3, 4,5);
        System.out.println("Result: "+ result);

        //swap pass by reference doesn't apply
        int c = 3;
        int d = 8;
        swap(c, d);
        System.out.println("c2 = "+ c);
        System.out.println("d2 = "+ d);
    }
}
