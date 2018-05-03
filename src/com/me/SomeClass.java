package com.me;

//step 1 added this class
public class SomeClass {

    //step 2 variable or field
    private static int classCounter = 0;
    private final String name;
    //private final int instanceNumber = 1;
    //changed to demonstrate how it can used in public
    public final int instanceNumber; //no value assigned, so we can use it with values we assign

    //step 3 constructor
    public SomeClass(String name) {
        this.name = name;
        classCounter ++; //because instantiating new version of this class
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
        //when using parameter, then must initiate with this.etc..

    }

    //step 4 getter for instance number only, don't forget this is a method
    public int getInstanceNumber() {
        return instanceNumber;

        //for step 5 back to main
    }

}
