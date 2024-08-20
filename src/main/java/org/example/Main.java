package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        List<Person> person = Arrays.asList(
                new Person("Eddie", "Peng", "I don't know", 0),
                new Person("Bill", "Gates", "1999/10/28", 21),
                new Person("Jobs", "Steve", "1996/02/24", 24),
                new Person("May", "Frank", "1976/09/12", 44),
                new Person("Judy", "James", "1978/12/24", 42),
                new Person("Ben", "Friend", "1995/02/10", 25),
                new Person("Jobs", "Yang", "1997/01/22", 23));

        // 如果今天我想要在人名中間加一個"-"會比較方便表示的話，stream就是一個很好的方法。
        person.forEach(x -> System.out.println(x.firstName + "-" + x.lastName + " " + x.birthday));

        // forEach
        HashMap<Integer, String> mapTest = new HashMap<>();
        mapTest.put(1, "Edward");
        mapTest.put(2, "Baron");
        mapTest.put(3, "ChovyWU");

        mapTest.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));

        // filter
        List<Person> younger = person.stream()
                                .filter(t -> t.age < 30)
                                .collect(toList());
        System.out.println("Younger person in the list is: ");
        younger.forEach(x -> System.out.println("Name " + x.firstName + "-" + x.lastName));


        // map
        List<String> map = person.stream()
                .map(x-> x.getLastName().toUpperCase())
                .collect(toList());
        map.forEach(System.out::println);

        // map && flatMap
        System.out.println("--------");
        List<String> words = Arrays.asList("Hello", "World");
        words.stream()
                .map((String line) -> Arrays.stream(line.split("")))
                .distinct()
                .forEach(System.out::println);
        System.out.println("--------");
        words.stream()
                // 把他切成 "H","e","l","l","o","W","o","r","l","d"
                .flatMap((String line) -> Arrays.stream(line.split(""))) //代表切除空字串，所以每切一次就讓每個字換行。
                .distinct() // 把不一樣字母分割出來。
                .forEach(System.out::println);

    }
}