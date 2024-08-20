package org.example;

public class Person {
    String firstName;
    String lastName;
    String birthday;
    int age;

    Person(String firstName, String lastName, String birthday, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = lastName;
        this.age = age;
    }

    //這個對之後要印出東西，會有幫助，所以請留著他。
    public String toString() {
        return getFirstName() + "-" +
                getLastName();
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

}
