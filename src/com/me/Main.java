package com.me;

public class Main {

    public static void main(String[] args) {

        //step 5 instance
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");
        //then run
        //results;
        /*one created, instance is 1
          two created, instance is 2
          three created, instance is 3*/

        System.out.println("===========================");

        //step 6
        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());
        //calling getInstanceNumber method by each new instance of Someclass
        //we created above
        //run
        //results;
        /*
        1
        2
        3
         */

        //one.instanceNumber = 4;
        //this CANNOT be done

        System.out.println("=========================================");

        //step 7 an example of final value from Java Math library
        //constructors are private in created math class
        //and class is marked final to prevent sub-classes from being created
        //could never extend Math class
        System.out.println(Math.PI);
        //result;
        //3.141592653589793

    }

}
