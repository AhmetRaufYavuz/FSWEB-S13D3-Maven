package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String hobbies;
    String car;
    boolean married;

    public Person (String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person (String firstName, String lastName, int age, String hobbies, String car, boolean married){
        this(firstName,lastName,age);
        this.hobbies = hobbies;
        this.car = car;
        this.married = married;
    }

    public String getFirstName (){
        return this.firstName;
    }

    public String getLastName (){
        return this.lastName;
    }

    public int getAge (){
        return this.age;
    }

    public boolean isTeen (){
        boolean teen = false;
        if(this.age >12 && this.age < 20){
            teen = true;
        }
        return teen;
    }

}
